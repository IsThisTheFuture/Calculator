// Generated from /home/tobi/IdeaProjects/Calculator/Calculator.g4 by ANTLR 4.5.3
package de.calculator.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(CalculatorParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(CalculatorParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExp(CalculatorParser.AdditionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExp(CalculatorParser.AdditionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExp(CalculatorParser.MultiplyExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExp(CalculatorParser.MultiplyExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(CalculatorParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(CalculatorParser.AtomExpContext ctx);
}