package abstrakteKlassenInterfacesLambda;

public class Calculator {

    interface IntegerMath {
        int operation(int a, int b);
    }

    // as Objekt op bestimmt, welche Operation mit
    // a und b geführt wird. Noch eine Anwendung
    // des Strategie-Patterns
    public static int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    // Die Notation String... ist aequivalent zu String[]
    public static void main(String... args) {
        // addition und subtraktion sind Objekte vom Typ IntegerMath.
        // Sie werden nicht mehr mit new erzeugt.
        // Es reicht einfach die Implementierung der Methode operation
        // durch einen Lambda-Ausdruck anzugeben.
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        System.out.println("40 + 2 = " + operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " + operateBinary(20, 10, subtraction));
    }

}