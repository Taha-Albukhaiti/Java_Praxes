package rekursion;

/**
 * QuickSort.java
 * Programm sortiert
 * Sequenz fester L�nge von ungeordneten Elementen.
 *
 * @author G�rlitz
 * @version 2.0, 12/2001
 */

class QuickSort {

    /**
     * Sortiert Sequenz fester L�nge von ungeordneten Elementen.
     * Quicksort, nach C.A.R. Hoare
     */
    public static void quick(int[] reihe, int u, int o) {
        int i = u, j = o, median;
        median = reihe[(u + o) >> 1];
        do {
            while (reihe[i] < median) {
                i++;
            }
            while (median < reihe[j]) {
                j--;
            }

            if (i <= j) {
                int temp = reihe[j];
                reihe[j] = reihe[i];
                reihe[i] = temp;
                i++;
                j--;
            }
        } while (i < j);

        if (u < j) {
            quick(reihe, u, j);
        }

        if (i < o) {
            quick(reihe, i, o);
        }
System.out.println();
    }

    public static void main(String args[]) {
        int[] m = new int[]{2, 1, 4, 3, 9};
        quick(m, 1,2);
    }


}