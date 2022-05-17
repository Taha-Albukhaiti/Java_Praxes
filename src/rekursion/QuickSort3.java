package rekursion;

/**
 * QuickSort3.java
 * Programm sortiert Sequenz fester Laenge von ungeordneten Elementen.
 *
 * @author Goerlitz/Hinrichs
 * @version 2.0, 12/2001
 */

class QuickSort3 {

    /**
     * Sortiert Sequenz fester Laenge von ungeordneten Elementen. Mit Demo-Textausgaben.
     * Quicksort, nach C.A.R. Hoare
     * Idee:
     * 1. Waehle aus dem Array ein Element aus, das als Pivot bezeichnet wird (hier: Pivot = Median).
     * 2. Partitionieren: Ordne das Array neu an, so dass alle Elemente mit Werten kleiner als dem Pivot
     * vor dem Pivot kommen, waehrend alle Elemente mit Werten groesser als dem Pivot danach folgen
     * (gleiche Werte koennen in beide Richtungen gehen). Nach dieser Unterteilung befindet sich der
     * Pivot in seiner Endposition. Dies wird als Partitionsoperation bezeichnet.
     * 3. Wende die obigen Schritte rekursiv auf das Subarray von Elementen mit kleineren Werten
     * und separat auf das Subarray von Elementen mit groesseren Werten an.
     *
     * @param reihe       zu sortierendes (Sub)-Array
     * @param links       Linker Index des zu sortierenden (Sub)-Arrays
     * @param rechts      Rechter Index des zu sortierenden (Sub)-Arrays
     * @param inkarnation Enthaelt die Rekursionstiefe (nur zu Demozwecken)
     */
    public static void quickSort(int[] reihe, int links, int rechts, int inkarnation) {
        int i = links;
        int j = rechts;
        int median = reihe[(links + rechts) / 2];    //Zahl in der Mitte merken
//        median = reihe[(links + rechts) >> 1]; 	//1 Bit nach rechts entspricht Division durch 2

        System.out.println("Tiefe " + inkarnation + ", Median " + median + ": ");
        System.out.print("Vorher: ");
        ausgeben(reihe, links, rechts + 1);

        do {                                    //wiederhole:
            while (reihe[i] < median) {            //linke H�lfte durchlaufen, bis Zahl >= median gefunden
                i++;
            }                                    //jetzt ist i der Index des Medians
            while (median < reihe[j]) {            //rechte H�lfte durchlaufen, bis Zahl <= median gefunden
                j--;
            }

            if (i <= j) {                        //falls Zaehlindexe sich nicht "gekreuzt" haben
                System.out.println("Tausche " + reihe[i] + " und " + reihe[j]);
                int temp = reihe[j];            //gefundene Elemente an i und j tauschen
                reihe[j] = reihe[i];
                reihe[i] = temp;
                i++;                            //beide Indexe in-/dekrementieren
                j--;
            }
        } while (i < j);                        //solange Zaehlindexe sich nicht "getroffen" oder "gekreuzt" haben
        //jetzt ist der Pivot (Median) an der richtigen Position!
        System.out.print("Nachher: ");
        ausgeben(reihe, links, rechts + 1);
        System.out.println();
        //Jetzt: "divide and conquer"
        if (links < j) {                        //falls j groesser als untere Grenze
            quickSort(reihe, links, j, inkarnation + 1);    //rekursiver Aufruf mit Bereich von links bis j
        }

        if (i < rechts) {                        //falls i kleiner als obere Grenze
            quickSort(reihe, i, rechts, inkarnation + 1);    //rekursiver Aufruf mit Bereich von i bis rechts
        }
        System.out.println("Verlasse Tiefe " + inkarnation);
    }

    /**
     * Gibt das Array im angegebenen Bereich aus.
     *
     * @param reihe  Das auszugebende Array.
     * @param links  Startindex der Ausgabe.
     * @param laenge Laenge der Ausgabe.
     */
    public static void ausgeben(int[] reihe, int links, int laenge) {
        for (int i = links; i < laenge; i++) {
            System.out.print("(" + i + "|" + reihe[i] + ") ");
        }
        System.out.println();
    }

    /**
     * Gibt das unsortierte Array aus, sortiert es und gibt es erneut aus.
     *
     * @param args Kommandozeilenparameter, werden nicht verwendet.
     */
    public static void main(String[] args) {
        int[] reihe = {17, 29, 5, 11, 19, 24, 3, 10, 14};
        System.out.print("Start: ");
        ausgeben(reihe, 0, reihe.length);
        System.out.println();
        quickSort(reihe, 0, reihe.length - 1, 1);
        System.out.print("\nEnde: ");
        ausgeben(reihe, 0, reihe.length);
    }
}