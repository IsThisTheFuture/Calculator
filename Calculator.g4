/* Im Folgenden ist eine einfache Grammatik definiert, welche die Grundrechenarten (+, -, *, /)
   sowie die Verwendung von Klammern erlaubt.
   Die aktuelle Version erlaubt allerdings noch keine Verwendung von unären Operatoren
   z.B. würde '-9 + 5' einen Fehler produzieren.

   Parserreglen starten mit Kleinbuchstaben, Lexerregeln mit Großbuchstaben */


grammar Calculator;

/* Startregel für den Parser */
eval
    :    additionExp
    ;

/* Addition und Subtraktion haben den geringsten Vorrang.
   Die Reihenfolge in der die Regeln definiert werden haben also Einfluss auf den Vorrang. */
additionExp
    :    multiplyExp
         ( '+' multiplyExp
         | '-' multiplyExp
         )*
    ;

/* Multiplikation und Division besitzen größeren Vorrang */
multiplyExp
    :    atomExp
         ( '*' atomExp
         | '/' atomExp
         )*
    ;


/* Ein Expression Atom ist der kleinste Teil eines Ausdrucks: eine Zahl. Oder
   wenn wir auf Klammern treffen rufen wir die Regel 'additionExp' rekursiv auf.
   Wie man sieht besitzt eine 'atomExp' den größten Vorrang. */
atomExp
    :    Number
    |    '(' additionExp ')'
    ;


/* Eine Zahl: kann einen Integer Wert, oder eine Dezimalzahl sein */
Number
    :    ('0'..'9')+ ('.' ('0'..'9')+)?
    ;

/* Sämtliche Whitespaces sollen ignoriert werden
   Prüfen: https://stackoverflow.com/questions/15503561/antlr4-whitespace-handling */
WS
    :   (' ' | '\t' | '\r'| '\n') -> skip
    ;