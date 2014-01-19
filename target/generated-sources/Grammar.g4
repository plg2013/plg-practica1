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

NUM_ENTERO : DIGITO (DIGITO | CERO)* ;
NUM_REAL : DIGITO (DIGITO | CERO)* (PUNTO (DIGITO | CERO)* DIGITO)? ;


// --- PARSER ---

tipo : TIPO ;
id : IDENT ;

num returns [String basic_type]
    : NUM_ENTERO { $basic_type = "int"; }
    | NUM_REAL { $basic_type = "real"; }
    ;


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

ioExpr locals [String basic_type] // IO expr
    : OP_IN id
    | OP_OUT (id | asigExpr)
    | asigExpr
    ;

asigExpr locals [String basic_type] // Asigative expr
    : id OP_ASIG asigExpr
    | compExpr
    ;

compExpr locals [String basic_type] // Comparative expr
    : left=adiExpr OP_COMP right=adiExpr 
    | adiExpr
    ;

adiExpr locals [String basic_type] // Aditive expr
    : left=adiExpr (OP_ADD | OP_SUB | OP_LOGOR) right=multExpr
    | multExpr
    ;

multExpr locals [String basic_type] // Multiplicative expr
    : left=multExpr OP_MULTI right=unaryExpr
    | unaryExpr
    ;

unaryExpr locals [String basic_type] // Unary expr
    : (OP_SUB | OP_LOGNOT) castExpr
    | castExpr
    ;

castExpr locals [String basic_type] // Casting expr
    : OP_CAST term
    | term
    ;

term locals [String basic_type] // Terminal
    : PAR_AP ioExpr PAR_CI
    | id
    | num
    ;
