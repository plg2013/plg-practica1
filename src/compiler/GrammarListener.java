package compiler;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exp_nv6}.
	 * @param ctx the parse tree
	 */
	void enterExp_nv6(@NotNull GrammarParser.Exp_nv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exp_nv6}.
	 * @param ctx the parse tree
	 */
	void exitExp_nv6(@NotNull GrammarParser.Exp_nv6Context ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#exp_term}.
	 * @param ctx the parse tree
	 */
	void enterExp_term(@NotNull GrammarParser.Exp_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exp_term}.
	 * @param ctx the parse tree
	 */
	void exitExp_term(@NotNull GrammarParser.Exp_termContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#exp_nv2}.
	 * @param ctx the parse tree
	 */
	void enterExp_nv2(@NotNull GrammarParser.Exp_nv2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exp_nv2}.
	 * @param ctx the parse tree
	 */
	void exitExp_nv2(@NotNull GrammarParser.Exp_nv2Context ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#decs}.
	 * @param ctx the parse tree
	 */
	void enterDecs(@NotNull GrammarParser.DecsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#decs}.
	 * @param ctx the parse tree
	 */
	void exitDecs(@NotNull GrammarParser.DecsContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#exp_nv3}.
	 * @param ctx the parse tree
	 */
	void enterExp_nv3(@NotNull GrammarParser.Exp_nv3Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exp_nv3}.
	 * @param ctx the parse tree
	 */
	void exitExp_nv3(@NotNull GrammarParser.Exp_nv3Context ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#exp_nv4}.
	 * @param ctx the parse tree
	 */
	void enterExp_nv4(@NotNull GrammarParser.Exp_nv4Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exp_nv4}.
	 * @param ctx the parse tree
	 */
	void exitExp_nv4(@NotNull GrammarParser.Exp_nv4Context ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#exp_nv5}.
	 * @param ctx the parse tree
	 */
	void enterExp_nv5(@NotNull GrammarParser.Exp_nv5Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exp_nv5}.
	 * @param ctx the parse tree
	 */
	void exitExp_nv5(@NotNull GrammarParser.Exp_nv5Context ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#exp_nv0}.
	 * @param ctx the parse tree
	 */
	void enterExp_nv0(@NotNull GrammarParser.Exp_nv0Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exp_nv0}.
	 * @param ctx the parse tree
	 */
	void exitExp_nv0(@NotNull GrammarParser.Exp_nv0Context ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#exp_nv1}.
	 * @param ctx the parse tree
	 */
	void enterExp_nv1(@NotNull GrammarParser.Exp_nv1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exp_nv1}.
	 * @param ctx the parse tree
	 */
	void exitExp_nv1(@NotNull GrammarParser.Exp_nv1Context ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#acc}.
	 * @param ctx the parse tree
	 */
	void enterAcc(@NotNull GrammarParser.AccContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#acc}.
	 * @param ctx the parse tree
	 */
	void exitAcc(@NotNull GrammarParser.AccContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull GrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull GrammarParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull GrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull GrammarParser.ProgramaContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#accs}.
	 * @param ctx the parse tree
	 */
	void enterAccs(@NotNull GrammarParser.AccsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#accs}.
	 * @param ctx the parse tree
	 */
	void exitAccs(@NotNull GrammarParser.AccsContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(@NotNull GrammarParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(@NotNull GrammarParser.NumContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(@NotNull GrammarParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(@NotNull GrammarParser.DecContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull GrammarParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull GrammarParser.TipoContext ctx);
}
