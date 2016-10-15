package de.calculator.core;

import de.calculator.parser.*;

/**
 * Created by tobi on 15.10.16.
 */
public class MyVisitor extends CalculatorBaseVisitor<String> {
    @Override
    public String visitEval(CalculatorParser.EvalContext ctx) {
        visitChildren(ctx);
        if (ctx.getChildCount() == 1)
        {
            System.out.println(ctx.getChild(0));
            System.out.println("ctx.getChildCount() == 1");
        }
        else {
            System.out.println(ctx.getChild(2));
            System.out.println("Eval");
        }

        return null;
    }
}
