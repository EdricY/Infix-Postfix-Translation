// Generated from D:/git/Infix-Postfix-Translation/ANTLR\Infix.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InfixParser}.
 */
public interface InfixListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InfixParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(InfixParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(InfixParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link InfixParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(InfixParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(InfixParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(InfixParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(InfixParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link InfixParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(InfixParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(InfixParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InfixParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(InfixParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(InfixParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link InfixParser#factors}.
	 * @param ctx the parse tree
	 */
	void enterFactors(InfixParser.FactorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#factors}.
	 * @param ctx the parse tree
	 */
	void exitFactors(InfixParser.FactorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InfixParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(InfixParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(InfixParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link InfixParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(InfixParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(InfixParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link InfixParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(InfixParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(InfixParser.IdentifierContext ctx);
}