package cli;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import utils.Logs;
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

		// Lexer
		GrammarLexer lexer = new GrammarLexer(input);
		lexer.removeErrorListeners();
		lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Parser
		GrammarParser parser = new GrammarParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(DescriptiveErrorListener.INSTANCE);

		// Empieza a parsear en la regla 'programa'
		ParseTree tree = parser.programa();

		// Recorre el arbol creado por el parser
		ParseTreeWalker walker = new ParseTreeWalker();
		compiler = new Compiler();
		
		try {
		walker.walk(compiler, tree);
		} catch (Exception e) {
			Logs.addError("[FATAL ERROR] Sintaxis no válida");
		}

	}



	public static void main(String[] args) {
		
		CmdLineInterface cli = new CmdLineInterface();
		
		String filename;
		
		if (args.length != 0)
			filename = args[0];
		
		else {
			System.out.println("Enter a file name: ");
			Scanner scanner = new Scanner(System.in);
			filename = scanner.nextLine();
			scanner.close();
			System.out.println();
		}
		
		ANTLRInputStream input = null;
		
		try {
			input = new ANTLRInputStream(
					new FileInputStream(filename));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Ejecuta el programa sobre el archivo de entrada y escribe el código generado
		cli.exec(input);
		
		System.out.println("Output:");
		System.out.println(cli.compiler.getCode());
		
	}
};

