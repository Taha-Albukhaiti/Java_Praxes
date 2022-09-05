package dateiunddatenstroeme;

import java.io.*;

/**
 * Testen der Methoden der Klasse File.
 *
 * @author skalt
 * @version 2.0 07/2009
 */
public class DateiKopieren {
    /**
     * Main-Methode
     *
     * @param args Uebergabeparamater
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // Uebergabeparameter pruefen
        if (args.length != 2) {
            System.out.println("""

                    Aufruf des Programms:
                    java DateiKopieren datei_1  datei_2""");
            System.out.println("\ndatei_1:  Datei, aus der gelesen wird.");
            System.out.println("datei_2:  Datei, in die geschrieben wird.");
            System.exit(1);
        }
        // Datei kopieren
        // kopiereDatei(args[0], args[1]);
        kopiereDateiII(args[0], args[1]);
    }

    /**
     * Methode zum Kopieren einer Datei.
     *
     * @param quellDatei Datei, die kopiert werden soll
     * @param zielDatei  Datei, die erzeugt werden soll
     * @throws IOException
     */
    public static void kopiereDatei(String quellDatei, String zielDatei) throws IOException {
        // Einfache Ein- und Ausgabestroeme oeffnen
        FileInputStream in = new FileInputStream(quellDatei);
        FileOutputStream out = new FileOutputStream(zielDatei);
        long dateiLaenge = (new File(quellDatei)).length();
        // Byte-Array, in das Daten eingelesen werden sollen, erzeugen
        byte[] b = new byte[(int) dateiLaenge];
        int len;
        // Daten aus Quelldatei einlesen und in Zieldatei schreiben
        while ((len = in.read(b)) > 0) {
            out.write(b, 0, len);
        }
        // Einfache Ein- und Ausgabestroeme schliessen

        out.close();
        in.close();
        // Benutzerinformation
        System.out.println("Datei '" + quellDatei + "' wurde in die Datei '" + zielDatei + "' kopiert.");
    }

    public static void kopiereDateiII(String quellDatei, String zielDatei) {
        BufferedWriter in = null;
        BufferedReader out = null;
        try {
            out = new BufferedReader(new FileReader(zielDatei));
            in = new BufferedWriter(new FileWriter(quellDatei));
            while (out.ready()) {
                in.write(out.readLine());
                in.newLine();
                System.out.println("llll");
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                    out.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}