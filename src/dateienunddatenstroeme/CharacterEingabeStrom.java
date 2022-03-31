import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Klasse zum Testen von zeichenorientierter Eingabe aus einer Datei.
 *
 * @author skalt
 * @version 2.0, 07/2009
 */
public class CharacterEingabeStrom {

    /**
     * Main-Methode.
     *
     * @param args
     *            Uebergabeparameter
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // Dateiname der einzulesenden Datei
        String dateiName = "EinAusgabe.tmp";

        // Methode zum Testen des Ausgabestroms aufrufen
        testeCharacterEingabeStrom(dateiName);
    }

    /**
     * Methode zum Testen eines Character-Eingabestroms.
     *
     * @param dateiName
     *            Name der Datei aus der Daten gelesen werden
     * @throws IOException
     */
    public static void testeCharacterEingabeStrom(String dateiName)
            throws IOException {
        // Drei Eingabestroeme erzeugen und mit der Datei verbinden:
        FileInputStream fiStream = new FileInputStream(dateiName);
        InputStreamReader isReader = new InputStreamReader(fiStream);
        BufferedReader bReader = new BufferedReader(isReader);
        // Datenfluss: Programm <-- bReader <-- isReader <-- fiStream <-- Datei

        // Alle Zeilen (durch die Stroeme) aus der Datei lesen und zur
        // Standardausgabe ausgeben
        String eineZeile;
        while (bReader.ready()) {
            eineZeile = bReader.readLine();
            System.out.println(eineZeile);
        }
        // Eingabestrom schliessen
        bReader.close();
    }
}