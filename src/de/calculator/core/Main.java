package de.calculator.core;

/**
 * Created by tobi on 15.10.16.
 * Einstiegspunkt des Programms
 */

//import de.calculator.parser.*;
import de.calculator.parser.*;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Main
{
    public static void main(String[] args) throws Exception
    {
        // Um unsere Zeichenkette verarbeiten zu können muss diese eingelesen werden.
        ANTLRInputStream input = new ANTLRFileStream("src/input");
        //ANTLRInputStream input = new ANTLRInputStream("1+2");

        // Lexer erstellen und mit input versorgen
        CalculatorLexer lexer = new CalculatorLexer(input);

        // Der Lexer generiert unsere Tokens aus dem Input
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Parser erstellen und Tokens übergeben
        CalculatorParser parser = new CalculatorParser(tokens);

        // ParseTree erstellen und Startregel angeben
        //ParseTree tree = parser.eval();
        ParseTree tree = parser.input();

        // Die Klasse CalculatorBaseVisitorImpl geht die einzelnen Nodes des ParseTrees durch und wertet sie aus
        CalculatorBaseVisitorImpl calcVisitor = new CalculatorBaseVisitorImpl();
        Double result = calcVisitor.visit(tree);
        System.out.println("Result: " + result);

    }
}
