package rekursion;

/**
 * Wie QuickSort, nur ohne Testausgaben
 */
public class QuickSort2 {

    private static int[] daten = {17, 29, 5, 14, 19, 24, 3, 10, 11};

    /**
     * Daten-Array von Index <min> bis Index <max> ausgeben, sofern Index gueltig ist
     *
     * @param min Startindex
     * @param max Endindex
     */
    public static void ausgeben(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i >= 0 && i < daten.length) {
                System.out.print("(" + i + "|" + daten[i] + ") ");
            }
        }
        System.out.println();
    }

    /**
     * Daten-Array von Index <links> bis Index <rechts> mit QuickSort sortieren
     *
     * @param links  linker Index
     * @param rechts rechter Index
     */
    public static void quicksort(int links, int rechts) {
        if (links < rechts) {                        //sofern etwas zu tun ist
            int teiler = teile(links, rechts);        //Array teilen und Teilerposition ermitteln
            quicksort(links, teiler - 1);            //rekursiver Aufruf mit Array links vom Teiler
            quicksort(teiler + 1, rechts);            //rekursiver Aufruf mit Array rechts vom Teiler
        }
    }

    /**
     * Bestimmt den Teiler (Pivot) im Datenarray von <links> bis <rechts>
     * und gibt den Index des Teilers zurueck. Der Teiler steht anschliessend
     * an der richtigen Stelle.
     *
     * @param links  linker Index
     * @param rechts rechter Index
     * @return Index des Teilers
     */
    public static int teile(int links, int rechts) {
        int pivot = daten[rechts];     //Willkuerlich wird das Element ganz rechts als Pivot gewaehlt
        int i = links;                 //Starte mit i ganz links
        int j = rechts - 1;             //Starte mit j links vom Pivotelement

        do {
            while (daten[i] <= pivot && i < rechts - 1) {    //Suche von links nach einem Element > pivot
                i++;
            }
            while (daten[j] >= pivot && j > links) {        //Suche von rechts nach einem Element < pivot
                j--;
            }
            if (i < j) {                                    //falls beide gefunden, tauschen
                int temp = daten[j];
                daten[j] = daten[i];
                daten[i] = temp;
            }
        } while (i < j);            //solange fortsetzen, bis sich i und j treffen

        if (daten[i] > pivot) {        //am Ende Element an i mit pivot tauschen, falls groesser
            daten[rechts] = daten[i];
            daten[i] = pivot;
        }
        return i;                    //jetzige Pivotposition zurueckgeben
        //(links davon ist alles <= pivot, rechts davon alles >= pivot)
    }

    /**
     * Gibt das unsortierte Array aus, sortiert es und gibt es erneut aus.
     *
     * @param args Kommandozeilenparameter, werden nicht verwendet.
     */
    public static void main(String[] args) {
        int maxIndex = daten.length - 1;
        System.out.print("Start: ");
        ausgeben(0, maxIndex);
        quicksort(0, maxIndex);        //ganzes Array sortieren
        System.out.print("Ende: ");
        ausgeben(0, maxIndex);
    }

}
