// Generated from /home/tobi/IdeaProjects/Calculator/Calculator.g4 by ANTLR 4.5.3
package de.calculator.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval(CalculatorParser.EvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#additionExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExp(CalculatorParser.AdditionExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#multiplyExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExp(CalculatorParser.MultiplyExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#atomExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExp(CalculatorParser.AtomExpContext ctx);
}