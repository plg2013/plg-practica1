import java.io.FileInputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import compiler.GrammarLexer;
import compiler.GrammarParser;
import compiler.Compiler;

public class Main {
    public static void main(String[] args) throws Exception {
        
    	ANTLRInputStream input = new ANTLRInputStream(
        							new FileInputStream("test.src"));

    	GrammarLexer lexer = new GrammarLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        GrammarParser parser = new GrammarParser(tokens);

        ParseTree tree = parser.programa(); // begin parsing at rule 'programa'
        
     	// create a standard ANTLR parse tree walker
        ParseTreeWalker walker = new ParseTreeWalker();
        // create listener then feed to walker
        Compiler compiler = new Compiler();
        walker.walk(compiler, tree);   // walk parse tree
        
        compiler.printTS();
    }
}
