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

def parse_id():
    sym = lookahead.val
    line = current_line
    print(lookahead, end=' ')
    match(Token("", Token.ID))
    if (sym not in symbols):
        symbols[sym] = line


def parse_factor():
    if lookahead.val == '(':
        match('(')
        parse_expr()
        match(')')
    elif lookahead.type == Token.ID:
        parse_id()
    else:
        print(lookahead, end=' ')
        match(Token("", Token.NUM))

def parse_factors():
    if (lookahead.type == Token.MULOP):
        mulop = lookahead.val
        match(Token("", Token.MULOP))
        parse_factor()
        print(mulop, end=' ')
        parse_factors()
    # or epsilon

def parse_term():
    parse_factor()
    parse_factors()

def parse_terms():
    if (lookahead.type == Token.ADDOP):
        addop = lookahead.val
        match(Token("", Token.ADDOP))
        parse_term()
        print(addop, end=' ')
        parse_terms()
    # or epsilon

def parse_expr():
    parse_term()
    parse_terms()

# def parse_list():
#     t = lookahead.type
#     # TODO: maybe improve next line
#     if t == Token.ID or t == Token.NUM or lookahead == "(":
#         parse_expr()
#         match(';')
#         parse_list()
#     # or epsilon

def parse_expressions():
    parse_expr()
    match(';')
    print(';')
    if lookahead.type == -1:
        print('eof')
        return
    parse_expressions()

lookahead = next()
parse_expressions()

# stackoverflow.com/questions/613183
ordered_symbols = sorted(symbols.items(), key=lambda kv: kv[1])
print("symbol table (symbol:line)")
for (sym, line) in ordered_symbols:
    print(sym + ':' + str(line), end=" ")

# parse_expr()
# if lookahead.type != -1:
#     print('\nleftover:')
#     print(lookahead, end=" ")
#     while lookahead.type != -1:
#         lookahead = next()
#         print(lookahead, end=" ")


