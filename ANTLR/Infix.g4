grammar Infix;   // note: must be same as filename

start : list EOF;

list
    : expr ';' list
    | // epsilon
    ;

expr : term terms;

terms
    : ADDOP term terms
    | // epsilon
    ;

term : factor factors;

factors
    : MULOP factor factors
    | // epsilon
    ;

factor
    : '(' expr ')'
    | number
    | identifier
    ;

number: NUM;
identifier: ID;

ADDOP : [+-] ;
MULOP : [*/] | MOD ;

MOD : 'MOD';
ID : LETTER (LETTER | DIGIT)*;
NUM: DIGIT* '.'? DIGIT+ ('e'[-+]?DIGIT+)?;
LETTER : [a-zA-Z];
DIGIT : [0-9];
WS: [ \t\r\n]+ -> skip ;