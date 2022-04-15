package streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 * Klasse, um Dateien zu lesen und die Inhalte als Array zurueckgeben
 * 
 * @author agathemerceron
 *
 */

public class UtilitiesArrayFiles {

    /**
     * liest ganze Zahlen aus der Datei filename und gibt sie in ein Array
     * zurueck. Es wird erwartet, dass jede Zeile genau eine ganze Zahl hat. Der
     * Name der Datei soll den ganzen Pfad beinhalten, z.B.
     * "C:/Users/BHT/vfh/Standford/QuickSort.txt"
     * 
     * @param filename, Namen der Datei, in der die Zahlen gespeichert sind
     * @return ein Array, das alle Zahlen enthaelt.
     */
    public static int[] readInArray(String filename) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));

            ArrayList<Integer> ar = new ArrayList<>();

            String s = in.readLine();
            while (s != null) {
                int i = Integer.parseInt(s);
                ar.add(i);
                s = in.readLine();
            }
            System.out.println(ar.size());

            int[] ir = new int[ar.size()];
            for (int i = 0; i < ir.length; i++) {
                ir[i] = ar.get(i);
            }
            in.close();
            return ir;
            // use of the toArray method not possible
            // because we want int[] (primitiv) and not Integer[]
            // return (int []) ar.toArray(new Integer[0]);

        } catch (IOException e) {
            System.out.println(e.getMessage());
            return new int[0];
        }
    }

    /**
     * liest ganze Zahlen aus der Datei filename und gibt sie in ein Array
     * zurueck. Es wird erwartet, dass jede Zeile genau eine ganze Zahl hat. Der
     * Name der Datei soll den ganzen Pfad beinhalten, z.B.
     * "C:/Users/BHT/vfh/Standford/QuickSort.txt"
     * 
     * @param filename, Namen der Datei, in der die Zahlen gespeichert sind
     * @return ein Array, das alle Zahlen enthaelt.
     */

    public static int[] readInArrayStream(String filename) {

        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            int[] ir = in.lines().mapToInt(line -> Integer.parseInt(line))
                    .toArray();
            in.close();
            return ir;

        } catch (IOException ex) {
            System.out.println("Datei " + filename
                    + " konnte nicht gelesen werden: " + ex.getMessage());
            return new int[0];
        }
    }

    /**
     * schreibt alle Zahlen im Array ir in die Datei namens filename. Eine Zahl
     * wird auf eine eigene Zeile geschrieben. Der Name der Datei soll den
     * ganzen Pfad beinhalten, z.B.
     * "C:/Users/BHT/vfh/Standford/QuickSortSorted.txt"
     * 
     * @param ir
     * @param filename
     */

    public static void writeArrayToFile(int[] ir, String filename) {

        try {
            FileOutputStream felix = new FileOutputStream(filename);
            OutputStreamWriter olli = new OutputStreamWriter(felix);
            BufferedWriter bruno = new BufferedWriter(olli);

            for (int i = 0; i < ir.length - 1; i++) {
                bruno.write("" + ir[i]);
                bruno.newLine();
            }
            bruno.write("" + ir[ir.length - 1]);
            bruno.flush();
            bruno.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }


}
