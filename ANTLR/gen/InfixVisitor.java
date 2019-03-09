// Generated from D:/git/Infix-Postfix-Translation/ANTLR\Infix.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InfixParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InfixVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InfixParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(InfixParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link InfixParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(InfixParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link InfixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(InfixParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link InfixParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(InfixParser.TermsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InfixParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(InfixParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link InfixParser#factors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactors(InfixParser.FactorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InfixParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(InfixParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link InfixParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(InfixParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link InfixParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(InfixParser.IdentifierContext ctx);
}