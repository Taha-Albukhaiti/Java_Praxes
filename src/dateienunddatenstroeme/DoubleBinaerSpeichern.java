package dateienunddatenstroeme;

import java.io.*;
import java.util.Arrays;

/**
 * Diese Klasse zeigt, wie Zahlen binaer in eine Datei gespeichert werden
 * koennen, und auch wieder gelesen werden.
 *
 * @author Agathe Merceron
 */

public class DoubleBinaerSpeichern {

    /**
     * schreibt ein Array aus double Zahlen binaer in eine Datei
     *
     * @param dateiName Name der Datei, um die Zahlen als binaer zu speichern
     * @param bA        das double-Array dessen Zahlen in die Datei gespeichert
     *                  werden
     * @throws IOException
     */

    public static void doubleToBinaryDatei(String dateiName, double[] bA)
            throws IOException {
        // Ausgabestroeme erzeugen
        FileOutputStream foStream = new FileOutputStream(dateiName);
        DataOutputStream doStream = new DataOutputStream(foStream);

        try {
            // Schleife ueber Array
            for (int i = 0; i < bA.length; i++) {
                doStream.writeDouble(bA[i]);
                System.out.print(bA[i] + ", "); // als Kontrolle
            }
            // Dateigroesse in Bytes auf der Konsole ausgeben
            // als Ueberpruefung
            System.out.println("\nDateigroesse: " + doStream.size() + " Bytes");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Ausgabestrom schliessen
        finally {
            doStream.close();
        }
    }

    /**
     * Liste double Zahlen aus einer Datei und gibt sie als Array zurueck Die
     * Datei muss mindestens so viele Zahlen enthalten wie im Parameter anzahl
     * eingegeben, sonst wird die Methode und das Programm ohne Ergebnis
     * beendet.
     *
     * @param dateiName Name der datei, die double-Zahlen binaer gespeichert
     *                  enthaelt
     * @param anzahl    die Zahlen die gelesen werden
     * @return
     */

    public static double[] doubleFromBinaryDatei(String dateiName, int anzahl) {
        // in einer folgenden LE wird die Klasse ArrayList eingefuehrt.
        // Mit einem ArrayList statt mit einem Array kann man
        // bequem Zahlen lesen, ohne dass die Anzahl der Zahlen von vornherein
        // bestimmt wird. Damit wird der 2. Parameter anzahl
        // ueberfluessig
        double[] zahlen = new double[anzahl];
        try {
            FileInputStream fiStream = new FileInputStream(dateiName);
            DataInputStream diStream = new DataInputStream(fiStream);

            // Schleife ueber Array
            for (int i = 0; i < anzahl; i++) {
                zahlen[i] = diStream.readDouble();
            }

            diStream.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        return zahlen;
    }

    /**
     * Main-Methode.
     *
     * @param args Uebergabeparameter
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // Variablen deklarieren
        double[] bA = {10, 20, 30, 40, 50, 60};
        // Methode zum Testen des Ausgabestroms aufrufen

        doubleToBinaryDatei(
                "/Users/taha/eclipse-workspace/doubleInBinary",
                bA);
        double[] result = doubleFromBinaryDatei(
                "/Users/taha/eclipse-workspace/doubleInBinary",
                bA.length);

        // einfach visuell ueberpruefen, ob das Ergebnis stimmt
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result));
    }

}
