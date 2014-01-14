grammar Grammar;


// --- LEXER ---

WS : [ \t\r\n]+ -> skip ;
COMMENT : '@' ~[\r\n]* -> skip ;

SEP : ';' ;
PAR_AP : '(' ;
PAR_CI : ')' ;

LETRA : 'A'..'Z' | 'a'..'z' ; 
CERO : '0' ;
DIGITO : '1'..'9' ;
GUION_BAJO : '_' ;
PUNTO : '.' ;

OP_CAST : PAR_AP TIPO PAR_CI ;

OP_UN : (OP_NEG | OP_LOGNOT) ;
OP_NEG : '-' ;
OP_LOGNOT : '!' ;

OP_MULTI : (OP_MULT | OP_DIV | OP_MOD | OP_LOGAND) ;
OP_MULT : '*' ;
OP_DIV : '/' ;
OP_MOD : '%' ;
OP_LOGAND : '&&' ;

OP_ADI : (OP_ADD | OP_SUB | OP_LOGOR) ;
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

OP_IO : (OP_IN | OP_OUT) ;
OP_IN : 'in' ;
OP_OUT : 'out' ;

TIPO : TIPO_INT | TIPO_REAL ;
TIPO_INT : ('i'|'I')('n'|'N')('t'|'T') ;
TIPO_REAL : ('r'|'R')('e'|'E')('a'|'A')('l'|'L') ;



// --- PARSER ---

tipo : TIPO ;
id : (LETRA | GUION_BAJO) (LETRA | DIGITO | GUION_BAJO)* ;
num : DIGITO (DIGITO | CERO)* (PUNTO (DIGITO | CERO)+)?;


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
    : exp_nv0 SEP
    ;

exp_nv0
    : OP_IO (id | exp_nv1)
    | exp_nv1
    ;

exp_nv1
    : id OP_ASIG exp_nv1
    | exp_nv2
    ;

exp_nv2
    : exp_nv2 OP_COMP exp_nv2
    | exp_nv3
    ;

exp_nv3
    : exp_nv3 OP_ADI exp_nv4
    | exp_nv4
    ;

exp_nv4
    : exp_nv4 OP_MULTI exp_nv5
    | exp_nv5
    ;

exp_nv5
    : OP_UN exp_nv5
    | exp_nv6
    ;

exp_nv6
    : OP_CAST exp_term
    | exp_term
    ;

exp_term
    : PAR_AP exp_nv1 PAR_CI
    | id
    | num
    ;
