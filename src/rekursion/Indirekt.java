package rekursion;

/**
 * Klasse zur Demonstration indirekter Rekursion. Die Methoden
 * indirektEins und indirektZwei rufen sich gegenseitig an.
 * Der Parameter i wird inkrementiert.
 * Sobald er positiv ist, terminiert die Rekursion.
 *
 * @author Maibaum / Geiger / merceron
 */

public class Indirekt {

    public static void main(String args[]) {
        indirektEins("Start", -5); // Methodenaufruf
       
    }

    /**
     * Diese Methode ruft indirektZweis auf, und wird von
     * indirektZwei aufgerufen. Sie kontrolliert die
     * rekursive Aufrufe mit dem Parameter i.
     *
     * @param textEins
     * @param i        eine ganze Zahl zum Kontrollieren der
     *                 rekursiven Aufrufe
     */
    static void indirektEins(String textEins, int i) {
        if (i <= 0) {
            System.out.println(textEins + i);
            indirektZwei("Text von Methode 2: ", i + 1);
            // indirekt rekursiver Aufruf

        }
    }

    /**
     * Diese Methode ruft indirektEins auf, und wird
     * von indirektEins aufgerufen. Der Parameter i wird
     * einfach weiter gereicht.
     *
     * @param textZwei
     * @param i        eine ganze Zahl
     */

    static void indirektZwei(String textZwei, int i) {
        System.out.print(textZwei + i);
        indirektEins(" | Text von Methode 1: ", i);
        // indirekt rekursiver Aufruf
    }

}
