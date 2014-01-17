package compiler;

import org.antlr.v4.misc.OrderedHashMap;
import java.util.Map;


public class Compiler extends GrammarBaseListener {

    Map<String, Map<String, String>> TS = 
            new OrderedHashMap<String, Map<String, String>>();
    
    String error = "";
    String code = "";
    
    int heap_memory_addr = 0x0;
    
    public void exitDec(GrammarParser.DecContext ctx) {
        
        // dec : tipo id ;
        
        String id = ctx.id().getText();
        String type = ctx.tipo().getText();
        
        if (TS.containsKey(id)) {
            error += "[W] La variable " + id + " ya se ha declarado previamente\n";
        
        } else {
            Map<String, String> var_attributes =
                    new OrderedHashMap<String, String>();
            
            var_attributes.put("type", type);
            var_attributes.put("mem_addr", Integer.toString(heap_memory_addr++));
            var_attributes.put("value", "null");
            
            TS.put(id, var_attributes);
            
        }
    }
    
    public void exitExp_nv0(GrammarParser.Exp_nv0Context ctx) {
        
        if (ctx.OP_IO() != null) { // Ensure it is IO expression
            
            if (ctx.id() != null) { // IO with a variable
                
                if (TS.containsKey(ctx.id().getText())) {
                    
                    // TODO: Create code
                    
                } else
                    error += "[E] Variable " + ctx.id().getText() + " no declarada.\n";

                
                
            } else if (ctx.exp_nv1() != null) { // IO with an expr
                System.out.println("Expr IO");
                
            }
            
            
        }
        
    }
    
    
    public void printTS() {
    	System.out.println(TS);
    }
}
