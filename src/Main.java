import java.io.FileInputStream;

//import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(
        							new FileInputStream("test.src"));

        // create a lexer that feeds off of input CharStream
        GrammarLexer lexer = new GrammarLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        GrammarParser parser = new GrammarParser(tokens);

        ParseTree tree = parser.programa(); // begin parsing at init rule
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}
