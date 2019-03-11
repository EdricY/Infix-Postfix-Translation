# Generates the AST while "reading" the infix notation
import sys
from token import Token

SHOW_ERRORS = True

symbols = {}
current_line = 1
lookahead = Token("", -1)

if (len(sys.argv) < 2):
    print("need filename")
    sys.exit(0)

filename = sys.argv[1]
fp = open(filename, 'rb')

graphfp = open("ast.gv", "w")
graphcount = 0

def inc_graph_count():
    global graphcount
    graphcount += 1

def nextChar():
    global current_line
    ch = str(fp.read(1), "utf-8")
    if ch == '\n':
        current_line += 1
    return ch

def ungetChar():
    fp.seek(-1, 1)

def next():
    ch = nextChar()
    if ch is None: return Token("", -1)
    s = ""
    t = -1

    while ch.isspace():
        ch = nextChar()
    if ch.isalpha():
        t = Token.ID
        s += ch
        ch = nextChar()
        while ch.isalpha() or ch.isnumeric(): 
            s += ch
            ch = nextChar()
        if s == "MOD":
            t = Token.MULOP
        if s == "EOF":
            t = -1
        ungetChar()
    elif ch.isnumeric() or ch == '.':
        t = Token.NUM
        s += ch
        decimal = ch == '.'
        ch = nextChar()
        while ch.isnumeric() or (ch == '.' and not decimal):
            decimal = True if ch == '.' else decimal
            s += ch
            ch = nextChar()
        if (ch == 'e' or ch == 'E'):
            s += ch
            ch = nextChar()
            if (ch == '+' or ch == '-'):
                s += ch
                ch = nextChar()
            while ch.isnumeric():
                s += ch
                ch = nextChar()
        ungetChar()
    elif ch == '+' or ch == '-':
        t = Token.ADDOP
        s = ch
    elif ch == '*' or ch == '/':
        t = Token.MULOP
        s = ch
    elif ch == ';' or ch == '(' or ch == ')':
        t = Token.SPECIAL
        s = ch
    return Token(s, t)

def match(tok):
    global lookahead
    if lookahead == tok:
        lookahead = next()
    elif SHOW_ERRORS:
        if not isinstance(tok, str):
            if tok.type == Token.ID:
                print("Error: name expected, '" + str(lookahead) +"' found")
                return
            elif tok.type == Token.NUM:
                print("Error: number expected, '" + str(lookahead) +"' found")
                return
        print("Error: '" + tok + "' expected, '" + str(lookahead) + "' found")

def parse_id(parent_node):
    sym = lookahead.val
    line = current_line
    print(lookahead, end=' ')
    match(Token("", Token.ID))
    if (sym not in symbols):
        symbols[sym] = line
    node = 'n' + str(graphcount)
    inc_graph_count()
    graphfp.write('%s [label="%s"];\n' % (node, sym))
    if parent_node:
        graphfp.write('%s -> %s;\n' % (parent_node, node))
    return node

def parse_num(parent_node):
    num = lookahead.val
    print(lookahead, end=' ')
    match(Token("", Token.NUM))
    node = 'n' + str(graphcount)
    inc_graph_count()
    graphfp.write('%s [label="%s"];\n' % (node, num))
    if parent_node:
        graphfp.write('%s -> %s;\n' % (parent_node, node))
    return node

def parse_factor(parent_node):
    if lookahead.val == '(':
        match('(')
        node = parse_expr(parent_node)
        match(')')
        return node
    elif lookahead.type == Token.ID:
        return parse_id(parent_node)
    else:
        return parse_num(parent_node)

def parse_factors(front_child):
    if (lookahead.type == Token.MULOP):
        mulop = lookahead.val
        match(Token("", Token.MULOP))
        node = 'n' + str(graphcount)
        inc_graph_count()
        graphfp.write('%s [label="%s"];\n' % (node, mulop))
        graphfp.write('%s -> %s;\n' % (node, front_child))
        parse_factor(node)
        print(mulop, end=' ')
        extra = parse_factors(node)
        if extra:
            node = extra
        return node
    # or epsilon

def parse_term(parent_node):
    first_fnode = parse_factor(None)
    mulop_node = parse_factors(first_fnode)
    node = first_fnode
    if mulop_node:
        node = mulop_node
    if parent_node:
        graphfp.write('%s -> %s;\n' % (parent_node, node))
    return node

def parse_terms(first_child):
    if lookahead.type == Token.ADDOP:
        addop = lookahead.val
        match(Token("", Token.ADDOP))
        node = 'n' + str(graphcount)
        inc_graph_count()
        graphfp.write('%s [label="%s"];\n' % (node, addop))
        graphfp.write('%s -> %s;\n' % (node, first_child))
        parse_term(node)
        print(addop, end=' ')
        extra = parse_terms(node)
        if extra:
            node = extra
        return node
    # or epsilon

def parse_expr(parent_node):
    first_tnode = parse_term(None)
    addop_node = parse_terms(first_tnode)
    node = first_tnode
    if addop_node:
        node = addop_node
    if parent_node:
        graphfp.write('%s -> %s;\n' % (parent_node, node))
    return node

def parse_expressions():
    parse_expr('n0')
    match(';')
    print(';')
    if lookahead.type == -1:
        print('eof')
        return
    parse_expressions()

lookahead = next()
graphfp.write("digraph {\n")
graphfp.write("node [shape=none;margin=0];\n")
graphfp.write("edge [color=gray];\n")
graphfp.write('n0 [label="expressions"];\n')
graphcount += 1

parse_expressions()

graphfp.write("}\n")

# stackoverflow.com/questions/613183
ordered_symbols = sorted(symbols.items(), key=lambda kv: kv[1])
print("symbol table (symbol:line)")
for (sym, line) in ordered_symbols:
    print(sym + ':' + str(line), end=" ")


