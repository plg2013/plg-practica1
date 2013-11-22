header{
	/* código de cabecera. opcional*/
}



// Analizador léxico
class MiScanner extends Lexer; 
 
BLANCO: (' '|'\t'|'\n') {$setType(Token.SKIP);}; 

protected LETRA : ('A'..'Z')|('a'..'z'); 
protected DIGITO : '0'..'9';
protected DIGITO_NO_CERO : '1'..'9';

GUION_BAJO : '_';
SEPARADOR : ';'; 
PARENTESIS_APER : '(';
PARENTESIS_CIER : ')';
PUNTO : '.';

OP_IN : "in";
OP_OUT : "out";

OP_ASIGNACION: '=';

OP_COMP_MENOR : '<';
OP_COMP_MAYOR : '>';
OP_COMP_MENORIGUAL : "<=";
OP_COMP_MAYORIGUAL : ">=";
OP_COMP_IGUAL : "==";
OP_COMP_DISTINTO : "!=";

OP_MAS : '+';
OP_MENOS : '-';
OP_MULTIPLICACION : '*';
OP_DIVISION : '/';
OP_MODULO : '%';

OP_AND : "&&";
OP_OR : "||";
OP_NOT : '!';

OP_COMP : OP_COMP_MENOR | OP_COMP_MAYOR | OP_COMP_MENORIGUAL | OP_COMP_MAYORIGUAL | OP_COMP_IGUAL | OP_COMP_DISTINTO;
OP_ADITIVO : OP_OR | OP_MAS | OP_MENOS;
OP_MULTIPLICATIVO : OP_MULTIPLICACION | OP_DIVISION | OP_MODULO | OP_AND;

TIPO_REAL : "real";
TIPO_INT : "int";

OP_INT : PARENTESIS_APER TIPO_INT PARENTESIS_CIER
OP_REAL : PARENTESIS_APER TIPO_REAL PARENTESIS_CIER

COMENTARIO : '@';

LIT_NUMERO : (DIGITO)+;
LIT_ENTERO : DIGITO_NO_CERO (LIT_NUMERO)?;
LIT_REAL : LIT_ENTERO (PUNTO (DIGITO)* DIGITO_NO_CERO)?;

 
IDENT : (LETRA|GUION_BAJO)(LETRA|DIGITO|GUION_BAJO)*;



// Analizador sintáctico
class MiParser extends Parser;

options{
	/*opciones comunes a toda la especificación. opcional*/
	buildAST = true;
}

programa : declaraciones acciones;

declaraciones : (dec)*;
dec : tipo IDENT SEPARADOR;

tipo : TIPO_INT | TIPO_REAL;

acciones : (acc)*;
acc : expresion SEPARADOR;

expresion : exp_nv0 SEPARADOR;

exp_nv0 : exp_nv1 | (OP_IN | OP_OUT) exp_nv2;

exp_nv1 : exp_nv2 | IDENT OP_ASIGNACION exp_nv2;

exp_nv2 : exp_nv3 | PARENTESIS_APER exp_nv2 PARENTESIS_CIER | exp_nv3 OP_COMP exp_nv3;

exp_nv3 : exp_nv4 | PARENTESIS_APER exp_nv3 PARENTESIS_CIER | exp_nv4 exp_aditiva;
exp_aditiva : OP_ADITIVO exp_nv3;

exp_nv4 : exp_nv5 | PARENTESIS_APER exp_nv5 PARENTESIS_CIER | exp_nv5 exp_multiplicativa;
exp_multiplicativa : OP_MULTIPLICATIVO exp_nv4;

exp_nv5 : (OP_INT | OP_REAL)? (OP_MENOS | OP_NOT)? lex;

lex : LIT_ENTERO | LIT_REAL | IDENT;

