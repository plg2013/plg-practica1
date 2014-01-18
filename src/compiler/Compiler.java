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

	public void exitExp_nv0(GrammarParser.Exp_nv0Context ctx) {

		//	exp_nv0
		//      : OP_IO (id | exp_nv1)
		//      | exp_nv1
		//      ;

		if (ctx.OP_IO() != null) { // Ensure it is IO expression

			String op_io = ctx.OP_IO().getText();

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
					if (ctx.exp_nv1() != null && ctx.exp_nv1().OP_ASIG() != null) {	
						String id = ctx.exp_nv1().id().getText();
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


	public void exitExp_nv1(GrammarParser.Exp_nv1Context ctx) {

		//  exp_nv1
		//	    : id OP_ASIG exp_nv1
		//	    | exp_nv2
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

	public void exitExp_nv2(GrammarParser.Exp_nv2Context ctx) {

		//	exp_nv2
		//	    : exp_nv3 OP_COMP exp_nv3 
		//	    | exp_nv3
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

	public void exitExp_nv3(GrammarParser.Exp_nv3Context ctx) {

		//	exp_nv3
		//	    : exp_nv3 OP_ADI exp_nv4
		//	    | exp_nv4
		//	    ;

		if (ctx.OP_ADI() != null) {
			
			String op_adi = ctx.OP_ADI().getText();
			
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
	
	public void exitExp_nv4(GrammarParser.Exp_nv4Context ctx) {
		
		//	exp_nv4
		//	    : exp_nv4 OP_MULTI exp_nv5
		//	    | exp_nv5
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
	
	public void exitExp_nv5(GrammarParser.Exp_nv5Context ctx) {
		
		//	exp_nv5
		//	    : OP_UN exp_nv5
		//	    | exp_nv6
		//	    ;

		
		if (ctx.OP_UN() != null) {
		
			String op_un = ctx.OP_UN().getText();
			
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
	
	public void exitExp_nv6(GrammarParser.Exp_nv6Context ctx) {
		
		//	exp_nv6
		//	    : OP_CAST exp_term
		//	    | exp_term
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
	
	public void exitExp_term(GrammarParser.Exp_termContext ctx) {
		
		//	exp_term
		//	    : PAR_AP exp_nv0 PAR_CI
		//	    | id
		//	    | num
		//	    ;

		if (ctx.id() != null) {

			String id = ctx.id().getText();
			
			if (!TS.containsKey(id)) {
				addError("[E] Variable '" + id + "' no declarada.");
				addCode("[Código incompleto por error]");

			} else
				addCode("desapila-dir( " + TS.get(id).get("mem_addr") + " )");
			
		} else if (ctx.num() != null) {
		
			String num = ctx.num().getText();
			
			addCode("apila( " + num + " )");
			
		}
	}
}

