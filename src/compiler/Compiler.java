package compiler;

import org.antlr.v4.misc.OrderedHashMap;
import java.util.Map;


public class Compiler extends GrammarBaseListener {

	// Hash table to store the information for the variables
	Map<String, Map<String, String>> TS = 
			new OrderedHashMap<String, Map<String, String>>();

	// Memory counter to assign address to the variables
	int heap_memory_addr = 0x0;

	// Compiler output
	String errors = "";
	String code = "";


	public Compiler() {
		// Empty constructor
	}

	public String getErrors() {
		return errors;
	}
	public String getCode() {
		return code;
	}

	private void addError(String new_error) {
		errors += new_error + "\n";
	}

	private void addCode(String new_code) {
		code += new_code + "\n";
	}


	public void exitDec(GrammarParser.DecContext ctx) {

		// dec : tipo id ;

		if (ctx.id() == null || ctx.tipo() == null) 
			addError("[E] Declaración de variable incorrecta.");

		else {	
			String type = ctx.tipo().getText();
			String id = ctx.id().getText();

			if (TS.containsKey(id)) {
				addError("[W] La variable '" + id + "' ya se ha declarado previamente");

			} else {
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

		if (ctx.OP_IN() != null || ctx.OP_OUT() != null) { // Ensure it is IO expression

			String op_io = ctx.OP_IN() != null ?
					ctx.OP_IN().getText() : ctx.OP_OUT().getText();

			if (ctx.id() != null) { // IO with a variable

				String id = ctx.id().getText();

				if (!TS.containsKey(id)) {
					addError("[E] Variable '" + id + "' no declarada.");
					addCode("[Código incompleto por error]");
				}

				else {
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
						addError("[E] Operador de E/S no válido.");
						addCode("[Código incompleto por error]");
					}
				}
			} else {


				switch(op_io) {
				case "in":
					addCode("in");
					break;

				case "out":
					if (ctx.asigExpr() != null && ctx.asigExpr().OP_ASIG() != null) {	
						String id = ctx.asigExpr().id().getText();
						addCode("apila-dir( " + TS.get(id).get("mem_addr") + " )");
					}
					
					addCode("out");
					
					break;

				default:
					addError("[E] Operador de E/S no válido.");
					addCode("[Código incompleto por error]");
				}
			}
		}
	}


	public void exitAsigExpr(GrammarParser.AsigExprContext ctx) {

		//	asigExpr // Asigative expr
		//	    : id OP_ASIG asigExpr
		//	    | compExpr
		//	    ;

		if (ctx.OP_ASIG() != null) {

			String id = ctx.id().getText();

			if (!TS.containsKey(id)) {
				addError("[E] Variable '" + id + "' no declarada.");
				addCode("[Código incompleto por error]");

			} else {

				addCode("desapila-dir( " + TS.get(id).get("mem_addr") + " )");

			}
		}	
	}

	public void exitCompExpr(GrammarParser.CompExprContext ctx) {

		//	compExpr
		//	    : adiExpr OP_COMP adiExpr 
		//	    | adiExpr
		//	    ;

		if (ctx.OP_COMP() != null) {

			String op_comp = ctx.OP_COMP().getText();

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
				addError("[E] Operador de comparación no válido");
				addCode("[Código incompleto por error]");
			}	
		}
	}

	public void exitAdiExpr(GrammarParser.AdiExprContext ctx) {

		//	adiExpr
		//	    : adiExpr (OP_ADD | OP_SUB | OP_LOGOR) multExpr
		//	    | multExpr
		//	    ;

		if (ctx.OP_ADD() != null || ctx.OP_SUB() != null || ctx.OP_LOGOR() != null) {
			
			String op_adi;
			
			if (ctx.OP_ADD() != null)
				op_adi = ctx.OP_ADD().getText();
			else
				op_adi = ctx.OP_SUB() != null ?
						ctx.OP_SUB().getText() : ctx.OP_LOGOR().getText();
			
			switch(op_adi) {
			case "+":
				addCode("suma");
				break;
				
			case "-":
				addCode("resta");
				break;
				
			case "||":
				addCode("or");
				break;
			
			default:
				addError("[E] Operador aditivo no válido");
				addCode("[Código incompleto por error]");
			}
		}
	}
	
	public void exitMultExpr(GrammarParser.MultExprContext ctx) {
		
		//	multExpr
		//	    : multExpr OP_MULTI unaryExpr
		//	    | unaryExpr
		//	    ;

		if (ctx.OP_MULTI() != null) {
			
			String op_multi = ctx.OP_MULTI().getText();
			
			switch(op_multi) {
			case "*":
				addCode("multiplica");
				break;
				
			case "/":
				addCode("divide");
				break;
			
			case "%":
				addCode("modulo");
				break;
				
			case "&&":
				addCode("and");
				break;
			
			default:
				addError("[E] Operador multiplicativo no válido");
				addCode("[Código incompleto por error]");
			}
		}
	}
	
	public void exitUnaryExpr(GrammarParser.UnaryExprContext ctx) {
		
		//	unaryExpr
		//	    : (OP_SUB | OP_LOGNOT) castExpr
		//	    | castExpr
		//	    ;
		
		if (ctx.OP_SUB() != null || ctx.OP_LOGNOT() != null) {
		
			String op_un = ctx.OP_SUB() != null ?
					ctx.OP_SUB().getText() : ctx.OP_LOGNOT().getText();
			
			switch(op_un) {
			case "-":
				addCode("negativo");
				break;
				
			case "!":
				addCode("not");
				break;
			
			default:
				addError("Operador unario no válido");
				addCode("[Código incompleto por error]");
			}
			
		}
	}
	
	public void exitCastExpr(GrammarParser.CastExprContext ctx) {
		
		//	castExpr
		//	    : OP_CAST term
		//	    | term
		//	    ;

		if (ctx.OP_CAST() != null) {
			
			String op_cast = ctx.OP_CAST().getText();
			
			switch(op_cast) {
			case "(int)":
				addCode("tipo( int )");
				break;
				
			case "(real)":
				addCode("tipo( real )");
				break;
			
			default:
				addError("Operador de tipo no válido");
				addCode("[Código incompleto por error]");
			}
		}
	}
	
	public void exitTerm(GrammarParser.TermContext ctx) {
		
		//	term
		//	    : PAR_AP ioExpr PAR_CI
		//	    | id
		//	    | num
		//	    ;

		if (ctx.id() != null) {

			String id = ctx.id().getText();
			
			if (!TS.containsKey(id)) {
				addError("[E] Variable '" + id + "' no declarada.");
				addCode("[Código incompleto por error]");

			} else
				addCode("apila-dir( " + TS.get(id).get("mem_addr") + " )");
			
		} else if (ctx.num() != null) {
		
			String num = ctx.num().getText();
			
			addCode("apila( " + num + " )");
			
		}
	}
}

