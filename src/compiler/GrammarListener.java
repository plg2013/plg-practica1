package compiler;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(@NotNull GrammarParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(@NotNull GrammarParser.MultExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#castExpr}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(@NotNull GrammarParser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#castExpr}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(@NotNull GrammarParser.CastExprContext ctx);

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
	 * Enter a parse tree produced by {@link GrammarParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(@NotNull GrammarParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(@NotNull GrammarParser.CompExprContext ctx);

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
	 * Enter a parse tree produced by {@link GrammarParser#ioExpr}.
	 * @param ctx the parse tree
	 */
	void enterIoExpr(@NotNull GrammarParser.IoExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ioExpr}.
	 * @param ctx the parse tree
	 */
	void exitIoExpr(@NotNull GrammarParser.IoExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull GrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull GrammarParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(@NotNull GrammarParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(@NotNull GrammarParser.UnaryExprContext ctx);

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

	/**
	 * Enter a parse tree produced by {@link GrammarParser#asigExpr}.
	 * @param ctx the parse tree
	 */
	void enterAsigExpr(@NotNull GrammarParser.AsigExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#asigExpr}.
	 * @param ctx the parse tree
	 */
	void exitAsigExpr(@NotNull GrammarParser.AsigExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#adiExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdiExpr(@NotNull GrammarParser.AdiExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#adiExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdiExpr(@NotNull GrammarParser.AdiExprContext ctx);
}
