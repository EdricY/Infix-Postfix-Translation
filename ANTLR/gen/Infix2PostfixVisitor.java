// Generated from D:/git/Infix-Postfix-Translation/ANTLR\Infix2Postfix.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Infix2PostfixParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Infix2PostfixVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Infix2PostfixParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(Infix2PostfixParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Infix2PostfixParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(Infix2PostfixParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Infix2PostfixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Infix2PostfixParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Infix2PostfixParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(Infix2PostfixParser.TermsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Infix2PostfixParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Infix2PostfixParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link Infix2PostfixParser#factors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactors(Infix2PostfixParser.FactorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Infix2PostfixParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(Infix2PostfixParser.FactorContext ctx);
}