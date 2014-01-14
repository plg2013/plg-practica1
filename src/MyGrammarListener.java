import org.antlr.v4.misc.OrderedHashMap;


import java.util.Map;


public class MyGrammarListener extends GrammarBaseListener {

    Map<String,String> props = new OrderedHashMap<String, String>();
    
    public void exitDec(GrammarParser.DecContext ctx) {
    	
    	// dec : tipo id ;
        
    	String id = ctx.id().getText();
        String value = ctx.tipo().getText();
        props.put(id, value);
    }

}
