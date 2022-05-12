package rekursion;

public class Fakultaet {


    public static void main(String args[]) {
        
        int n = rekursiv(4);
        System.out.println("");
        System.out.println(n);

        int m = iterativ(4);
        System.out.println("");
        System.out.println(n);
    }

    /**
     * Rekursiver Algorithmus zur Fakultätsberechnung
     */
    static int rekursiv(int zahl) {
        if (zahl == 1 || zahl == 0) { // Abbruch bei 1
            return 1;
        } else {
            return zahl * rekursiv(zahl - 1); //rekursiver Aufruf
        }
    }

    /**
     * Iterativer Algorithmus zur Fakultätsberechnung
     */
    static int iterativ(int zahl) {
        int i = 1;           // Schleifenvariable vereinbaren
        int f = 1;           // Variable für Zwischenprodukt
        while (i <= zahl) {  // Berechnungsschleife
            f = i * f;         // Teilprodukt
            i++;               // Schleifenzaehler erhoehen
        }
        return f;           //  Rueckgabe des Fakultaetswertes
    }
}
