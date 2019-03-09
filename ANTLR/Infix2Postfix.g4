grammar Infix2Postfix;   // note: must be same as filename

start
    locals [
        List<String> symbols = new ArrayList<>(),
        List<Integer> lines = new ArrayList<>()
    ]
    :   list EOF
        {
            System.out.print("EOF\n");
            System.out.println("symbol table (symbol:line)");
            for (int i=0; i < $symbols.size(); i ++) {
                System.out.print($symbols.get(i));
                System.out.print(":" + $lines.get(i) + " ");
            }
            System.out.println();
        }
	;

list
    : expr ';' {System.out.println(";");} list
    | // epsilon
    ;

expr : term terms;

terms
    : '+' term {System.out.print("+ ");} terms
    | '-' term {System.out.print("- ");} terms
    | // epsilon
    ;

term : factor factors;

factors
    : '*' factor {System.out.print("* ");  } factors
    | '/' factor {System.out.print("/ ");  } factors
    | MOD factor {System.out.print("MOD ");} factors
    | // epsilon
    ;

factor
    : '(' expr ')'
    | NUM
    {
        System.out.print($NUM.text + " ");
    }
    | ID
    {
        System.out.print($ID.text + " ");
        if (!$start::symbols.contains($ID.text)) {
            $start::symbols.add($ID.text);
            $start::lines.add($ID.line);
        }
    }
    ;

MOD : 'MOD';
ID : LETTER (LETTER | DIGIT)*;
NUM: DIGIT* '.'? DIGIT+ ('e'[-+]?DIGIT+)?;
LETTER : [a-zA-Z];
DIGIT : [0-9];
WS: [ \t\r\n]+ -> skip ;