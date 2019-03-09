// Generated from D:/git/Infix-Postfix-Translation/ANTLR\Infix2Postfix.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Infix2PostfixParser}.
 */
public interface Infix2PostfixListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Infix2PostfixParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Infix2PostfixParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Infix2PostfixParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Infix2PostfixParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Infix2PostfixParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(Infix2PostfixParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Infix2PostfixParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(Infix2PostfixParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Infix2PostfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Infix2PostfixParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Infix2PostfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Infix2PostfixParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Infix2PostfixParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(Infix2PostfixParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Infix2PostfixParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(Infix2PostfixParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Infix2PostfixParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Infix2PostfixParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Infix2PostfixParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Infix2PostfixParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Infix2PostfixParser#factors}.
	 * @param ctx the parse tree
	 */
	void enterFactors(Infix2PostfixParser.FactorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Infix2PostfixParser#factors}.
	 * @param ctx the parse tree
	 */
	void exitFactors(Infix2PostfixParser.FactorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Infix2PostfixParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(Infix2PostfixParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Infix2PostfixParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(Infix2PostfixParser.FactorContext ctx);
}