package cli;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import compiler.GrammarLexer;
import compiler.GrammarParser;
import compiler.Compiler;
import compiler.DescriptiveErrorListener;


public class CmdLineInterface {

	Compiler compiler;

	public Compiler getCompiler() {
		return compiler;
	}
	
	public void exec(ANTLRInputStream input) {

		GrammarLexer lexer = new GrammarLexer(input);
//		lexer.removeErrorListeners();
//		lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		GrammarParser parser = new GrammarParser(tokens);
//		parser.removeErrorListeners();
//		parser.addErrorListener(DescriptiveErrorListener.INSTANCE);

		ParseTree tree = parser.programa(); // begin parsing at rule 'programa'

		// create a standard ANTLR parse tree walker
		ParseTreeWalker walker = new ParseTreeWalker();
		// create listener then feed to walker
		
		compiler = new Compiler();
		walker.walk(compiler, tree);   // walk parse tree

	}



	public static void main(String[] args) {
		
		CmdLineInterface cli = new CmdLineInterface();
		
		ANTLRInputStream input = null;
		
		try {
			input = new ANTLRInputStream(
					new FileInputStream("test.src"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cli.exec(input);
		System.out.println(cli.compiler.getTS());
		
	}
};

