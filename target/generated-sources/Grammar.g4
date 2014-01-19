grammar Grammar;


// --- LEXER ---

WS : [ \t\r\n]+ -> skip ;
COMMENT : '@' ~[\r\n]* -> skip ;

SEP : ';' ;
PAR_AP : '(' ;
PAR_CI : ')' ;

fragment LETRA : 'A'..'Z' | 'a'..'z' ; 
fragment CERO : '0' ;
fragment DIGITO : '1'..'9' ;
fragment GUION_BAJO : '_' ;
fragment PUNTO : '.' ;

OP_CAST : PAR_AP TIPO PAR_CI ;

OP_LOGNOT : '!' ;

OP_MULTI : (OP_MULT | OP_DIV | OP_MOD | OP_LOGAND) ;
OP_MULT : '*' ;
OP_DIV : '/' ;
OP_MOD : '%' ;
OP_LOGAND : '&&' ;

OP_ADD : '+' ;
OP_SUB : '-' ;
OP_LOGOR : '||' ;

OP_COMP : (OP_LT | OP_GT | OP_LET | OP_GET | OP_E | OP_NE) ;
OP_LT : '<' ;
OP_GT : '>' ;
OP_LET : '<=' ;
OP_GET : '>=' ;
OP_E : '==' ;
OP_NE : '!=' ;

OP_ASIG : '=' ;

OP_IN : 'in' ;
OP_OUT : 'out' ;


TIPO : (TIPO_INT | TIPO_REAL) ;
TIPO_INT : ('i'|'I')('n'|'N')('t'|'T') ;
TIPO_REAL : ('r'|'R')('e'|'E')('a'|'A')('l'|'L') ;

IDENT : (LETRA | GUION_BAJO) (LETRA | DIGITO | GUION_BAJO)* ;
NUM : DIGITO (DIGITO | CERO)* (PUNTO (DIGITO | CERO)+)?;


// --- PARSER ---

tipo : TIPO ;
id : IDENT ;
num : NUM ;


programa
    : decs accs
    ;

decs
    : (dec)*
    ;

dec
    : tipo id SEP
    ;

accs
    : (acc)+
    ;

acc
    : ioExpr SEP
    ;

ioExpr // IO expr
    : OP_IN id
    | OP_OUT (id | asigExpr)
    | asigExpr
    ;

asigExpr // Asigative expr
    : id OP_ASIG asigExpr
    | compExpr
    ;

compExpr // Comparative expr
    : adiExpr OP_COMP adiExpr 
    | adiExpr
    ;

adiExpr // Aditive expr
    : adiExpr (OP_ADD | OP_SUB | OP_LOGOR) multExpr
    | multExpr
    ;

multExpr // Multiplicative expr
    : multExpr OP_MULTI unaryExpr
    | unaryExpr
    ;

unaryExpr // Unary expr
    : (OP_SUB | OP_LOGNOT) castExpr
    | castExpr
    ;

castExpr // Casting expr
    : OP_CAST term
    | term
    ;

term // Terminal
    : PAR_AP ioExpr PAR_CI
    | id
    | num
    ;
