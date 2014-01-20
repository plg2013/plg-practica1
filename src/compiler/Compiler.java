package compiler;

import org.antlr.v4.misc.OrderedHashMap;

import java.util.Map;
import utils.Logs;


public class Compiler extends GrammarBaseListener {

	// Tabla de simbolos
	Map<String, Map<String, String>> TS = 
			new OrderedHashMap<String, Map<String, String>>();

	// Contador para asignar la direccion de memoria a las variables
	int heap_memory_addr = 0x0;

	// Codigo P final
	String code = "";


	public Compiler() {
		// Empty constructor
	}

	public String getCode() {
		return code;
	}
	
	// Formatea la Tabla de Simbolos para mostrarla en la interfaz
	public String getTS() {
		
		String ts_out = "";
		
		for (Map.Entry<String, Map<String, String>> it : TS.entrySet()) {
			String id = it.getKey();
			Map<String, String> attr = it.getValue();
			
			ts_out += "[ " + id + " ] mem_addr: 0x" + attr.get("mem_addr") + "\n";
			ts_out += "  type: " + attr.get("type") + "     value: " + attr.get("value") + "\n\n";
		}
		
		
		return ts_out;
	}

	// Añade una nueva instruccion al codigo P generado
	private void addCode(String new_code) {
		code += new_code + "\n";
	}


	// Ejecutado al salir de la produccion 'dec'
	public void exitDec(GrammarParser.DecContext ctx) {

		// dec : tipo id ;

		// Error por tipo o id mal declarados
		if (ctx.id() == null || ctx.tipo() == null) 
			Logs.addError("[Error] Declaración de variable incorrecta.");

		else {	
			String type = ctx.tipo().getText().toLowerCase();
			String id = ctx.id().getText().toLowerCase();

			// Warning porque la variable ya estaba declarada
			if (TS.containsKey(id)) {
				Logs.addError("[Warning] La variable '" + id + "' ya se ha declarado previamente");

			} else {

				// Almacena la variable en la Tabla de Simbolos
				Map<String, String> var_attributes =
						new OrderedHashMap<String, String>();

				var_attributes.put("type", type);
				var_attributes.put("mem_addr", Integer.toString(heap_memory_addr++));
				var_attributes.put("value", "null");

				TS.put(id, var_attributes);

			}
		}
	}

	public void exitIoExpr(GrammarParser.IoExprContext ctx) {

		//	ioExpr
		//	    : OP_IN id
		//	    | OP_OUT (id | asigExpr)
		//	    | asigExpr
		//	    ;

		// Expresion de E/S
		if (ctx.OP_IN() != null || ctx.OP_OUT() != null) {

			String op_io = ctx.OP_IN() != null ?
					ctx.OP_IN().getText() : ctx.OP_OUT().getText();

			if (ctx.id() != null) { // E/S con una variable

				String id = ctx.id().getText().toLowerCase();

				// Error por variable no declarada
				if (!TS.containsKey(id)) {
					Logs.addError("[Error] Variable '" + id + "' no declarada.");
					addCode("[Código incompleto por error]");
					ctx.basic_type = "error";
				}

				else {

					// Genera el código en funcion del operador
					switch(op_io) {
					case "in":
						addCode("in");
						addCode("desapila-dir( " + TS.get(id).get("mem_addr") + " )");
						break;

					case "out":
						addCode("apila-dir( " + TS.get(id).get("mem_addr") + " )");
						addCode("out");
						break;

					default:
						// Esto no debería ocurrir nunca
						Logs.addError("[Error] Operador de E/S no válido.");
						addCode("[Código incompleto por error]");
					}
				
					// Valor de retorno, para controlar las restricciones
					ctx.basic_type = TS.get(id).get("type");
				
				}
				
			} else { // Operacion 'out' con una expresion


				// Genera el código en funcion del operador
				switch(op_io) {
				case "out":
					if (ctx.asigExpr() != null && ctx.asigExpr().OP_ASIG() != null) {	
						String id = ctx.asigExpr().id().getText().toLowerCase();
						addCode("apila-dir( " + TS.get(id).get("mem_addr") + " )");
					}
					
					addCode("out");
					
					ctx.basic_type = ctx.asigExpr().basic_type;
					
					break;

				default:
					// Esto no debería ocurrir nunca
					Logs.addError("[Error] Operador de E/S no válido.");
					addCode("[Código incompleto por error]");
					ctx.basic_type = "error";
				}
			}
		
		} else
		
		// Valor de retorno sintetizado del hijo
		ctx.basic_type = ctx.asigExpr().basic_type;
		
	}


	public void exitAsigExpr(GrammarParser.AsigExprContext ctx) {

		//	asigExpr
		//	    : id OP_ASIG asigExpr
		//	    | compExpr
		//	    ;

		// Expresion de asignacion
		if (ctx.OP_ASIG() != null) {

			String id = ctx.id().getText().toLowerCase();

			// Error por variable no declarada
			if (!TS.containsKey(id)) {
				Logs.addError("[Error] Variable '" + id + "' no declarada.");
				addCode("[Código incompleto por error]");
				ctx.basic_type = "error";

			} else {

				// Genera el código P
				addCode("desapila-dir( " + TS.get(id).get("mem_addr") + " )");
				
				// Valor de retorno, para controlar las restricciones
				ctx.basic_type = TS.get(id).get("type");
				
				// Restricciones de tipo
				if (ctx.basic_type.equals("int") && ctx.asigExpr().basic_type.equals("real") )
					Logs.addError("[Warning] Se está asignando un tipo 'real' a una variable de tipo 'int'.");

			}
			
		} else
			
			// Valor de retorno sintetizado del hijo
			ctx.basic_type = ctx.compExpr().basic_type;
	}

	public void exitCompExpr(GrammarParser.CompExprContext ctx) {

		//	compExpr
		//	    : left=adiExpr OP_COMP right=adiExpr 
		//	    | adiExpr
		//	    ;

		// Expresion de comparacion
		if (ctx.OP_COMP() != null) {

			String op_comp = ctx.OP_COMP().getText();
			
			// Valor de retorno, para controlar las restricciones
			ctx.basic_type = "int";

			// Generacion del código P en funcion del operador
			switch(op_comp) {
			case "<":
				addCode("menor");
				break;

			case ">":
				addCode("mayor");
				break;

			case "<=":
				addCode("menor-igual");
				break;

			case ">=":
				addCode("mayor-igual");
				break;

			case "==":
				addCode("igual");
				break;

			case "!=":
				addCode("distinto");
				break;

			default:
				// Esto no debería ocurrir nunca
				Logs.addError("[Error] Operador de comparación no válido");
				addCode("[Código incompleto por error]");
				ctx.basic_type = "error";
			}	
		
		} else
			
			// Valor de retorno sintetizado del hijo
			ctx.basic_type = ctx.adiExpr(0).basic_type;
		
	}

	public void exitAdiExpr(GrammarParser.AdiExprContext ctx) {

		//	adiExpr
		//	    : left=adiExpr (OP_ADD | OP_SUB | OP_LOGOR) right=multExpr
		//	    | multExpr
		//	    ;

		// Expresion aditiva
		if (ctx.OP_ADD() != null || ctx.OP_SUB() != null || ctx.OP_LOGOR() != null) {
			
			String op_adi;
			
			// Almacena el operador utilizado
			if (ctx.OP_ADD() != null)
				op_adi = ctx.OP_ADD().getText();
			else
				op_adi = ctx.OP_SUB() != null ?
						ctx.OP_SUB().getText() : ctx.OP_LOGOR().getText();
			
			// Genera el código P en funcion del operador
			switch(op_adi) {
			case "+":
				addCode("suma");

				// Valor de retorno
				if (ctx.left.basic_type.equals("real") || ctx.right.basic_type.equals("real"))
					ctx.basic_type = "real";
				else
					ctx.basic_type = "int";
					
				break;
				
			case "-":
				addCode("resta");

				// Valor de retorno
				if (ctx.left.basic_type.equals("real") || ctx.right.basic_type.equals("real"))
					ctx.basic_type = "real";
				else
					ctx.basic_type = "int";
					
				break;
				
			case "||":
				addCode("or");

				// Restriccion de tipo
				if (!ctx.left.basic_type.equals("int") || !ctx.right.basic_type.equals("int"))
					Logs.addError("[Warning] Los operandos de la unión deben ser de tipo 'int'");
				
				// Valor de retorno
				ctx.basic_type = "int";
				
				break;
			
			default:
				// Esto no deberia pasar nunca
				Logs.addError("[Error] Operador aditivo no válido");
				addCode("[Código incompleto por error]");
				ctx.basic_type = "error";
			}
		
		} else
			
			// Valor de retorno sintetizado del hijo
			ctx.basic_type = ctx.multExpr().basic_type;
	}
	
	public void exitMultExpr(GrammarParser.MultExprContext ctx) {
		
		//	multExpr
		//	    : left=multExpr OP_MULTI right=unaryExpr
		//	    | unaryExpr
		//	    ;

		// Expresion multiplicativa
		if (ctx.OP_MULTI() != null) {
			
			String op_multi = ctx.OP_MULTI().getText();
			
			// Generacion de codigo P en funcion del operador
			switch(op_multi) {
			case "*":
				addCode("multiplica");
				
				// Valor de retorno
				if (ctx.left.basic_type.equals("real") || ctx.right.basic_type.equals("real"))
					ctx.basic_type = "real";
				else
					ctx.basic_type = "int";
					
				break;
				
			case "/":
				addCode("divide");
				
				// Valor de retorno
				if (ctx.left.basic_type.equals("real") || ctx.right.basic_type.equals("real"))
					ctx.basic_type = "real";
				else
					ctx.basic_type = "int";
					
				break;
			
			case "%":
				addCode("modulo");
				
				// Restriccion de tipo
				if (!ctx.left.basic_type.equals("int") || !ctx.right.basic_type.equals("int"))
					Logs.addError("[Warning] Los operandos del operador módulo deben ser de tipo 'int'");
				
				// Valor de retorno
				ctx.basic_type = "int";
				
				break;
				
			case "&&":
				addCode("and");
				
				// Restriccion de tipo
				if (!ctx.left.basic_type.equals("int") || !ctx.right.basic_type.equals("int"))
					Logs.addError("[Warning] Los operandos de la intersección deben ser de tipo 'int'");
				
				// Valor de retorno
				ctx.basic_type = "int";
				
				break;
			
			default:
				// Esto no deberia pasar nunca
				Logs.addError("[Error] Operador multiplicativo no válido");
				addCode("[Código incompleto por error]");
				ctx.basic_type = "error";
			}
		
		} else
			
			// Valor de retorno sintetizado del hijo
			ctx.basic_type = ctx.unaryExpr().basic_type;
	}
	
	public void exitUnaryExpr(GrammarParser.UnaryExprContext ctx) {
		
		//	unaryExpr
		//	    : (OP_SUB | OP_LOGNOT) castExpr
		//	    | castExpr
		//	    ;
		
		// Expresion unaria
		if (ctx.OP_SUB() != null || ctx.OP_LOGNOT() != null) {
		
			//Almacena el operador utilizado
			String op_un = ctx.OP_SUB() != null ?
					ctx.OP_SUB().getText() : ctx.OP_LOGNOT().getText();
			
			// Genera el codigo en funcion del operador
			switch(op_un) {
			case "-":
				addCode("negativo");

				// Valor de retorno
				ctx.basic_type = ctx.castExpr().basic_type;
				break;
				
			case "!":
				addCode("not");
				
				// Restriccion de tipo
				if (!ctx.castExpr().basic_type.equals("int"))
					Logs.addError("[Warning] El operando de la negación lógica debe ser de tipo 'int'");
				
				// Valor de retorno
				ctx.basic_type = "int";
				
				break;
			
			default:
				// Esto no deberia pasar nunca
				Logs.addError("Operador unario no válido");
				addCode("[Código incompleto por error]");
				ctx.basic_type = "error";
			}
			
		} else
			
			// Valor de retorno sintetizado del hijo
			ctx.basic_type = ctx.castExpr().basic_type;
	}
	
	public void exitCastExpr(GrammarParser.CastExprContext ctx) {
		
		//	castExpr
		//	    : OP_CAST term
		//	    | term
		//	    ;

		// Expresion de casting
		if (ctx.OP_CAST() != null) {
			
			String op_cast = ctx.OP_CAST().getText().toLowerCase();
			
			// Generacion de codigo P en funcion del operador
			switch(op_cast) {
			case "(int)":
				addCode("tipo( int )");

				// Valor de retorno
				ctx.basic_type = "int";
				break;
				
			case "(real)":
				addCode("tipo( real )");

				// Valor de retorno
				ctx.basic_type = "real";
				break;
			
			default:
				// Esto no deberia pasar nunca
				Logs.addError("Operador de tipo no válido");
				addCode("[Código incompleto por error]");
				ctx.basic_type = "error";
			}
		
		} else
			
			// Valor de retorno sintetizado del hijo
			ctx.basic_type = ctx.term().basic_type;
	}
	
	public void exitTerm(GrammarParser.TermContext ctx) {
		
		//	term
		//	    : PAR_AP ioExpr PAR_CI
		//	    | id
		//	    | num
		//	    ;

		// Variable
		if (ctx.id() != null) {

			String id = ctx.id().getText().toLowerCase();
			
			// Error por variable no declarada
			if (!TS.containsKey(id)) {
				Logs.addError("[Error] Variable '" + id + "' no declarada.");
				addCode("[Código incompleto por error]");

			} else
				// Generacion de codigo P
				addCode("apila-dir( " + TS.get(id).get("mem_addr") + " )");
			
			// Valor de retorno
			ctx.basic_type = TS.get(id).get("type");
			

		// Numero
		} else if (ctx.num() != null) {
		
			String num = ctx.num().getText();
			
			// Generacion de código
			addCode("apila( " + num + " )");
			
			// Valor de retorno
			ctx.basic_type = ctx.num().basic_type;
			
		} else
			
			// Valor de retorno sintetizado del hijo
			ctx.basic_type = ctx.ioExpr().basic_type;
	}
}
