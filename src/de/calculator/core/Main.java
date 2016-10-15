package de.calculator.core;

/**
 * Created by tobi on 15.10.16.
 * Einstiegspunkt des Programms
 */

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
        // Das geschieht über ANTLRInputStream, welcher (aktuell) die input Datei über ANTLRFileStream einliest
        ANTLRInputStream input = new ANTLRFileStream("src/input");

        // Lexer erstellen und mit input versorgen
        CalculatorLexer lexer = new CalculatorLexer(input);

        // Der Lexer generiert unsere Tokens aus dem Input (z.B. sind einzelne Zahlen oder Operatoren Tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Parser erstellen und Tokens übergeben
        CalculatorParser parser = new CalculatorParser(tokens);

        // ParseTree erstellen und Startregel angeben
        ParseTree tree = parser.eval();

        // Die Klasse MyVisitor wurde von mir angelegt und geht die einzelnen Nodes des ParseTrees durch
        new MyVisitor().visit(tree);

    }
}
