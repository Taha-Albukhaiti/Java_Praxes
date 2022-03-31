package dateienunddatenstroeme;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Klasse zum Schreiben von zeichenorientierten Ausgaben in eine Datei.
 *
 * @author skalt
 * @version 2.0, 07/2009
 */
class CharacterAusgabeStrom {

    /**
     * Main-Methode.
     *
     * @param args
     *            Uebergabeparameter
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // Dateiname
        String dateiName = "EinAusgabe.tmp";
        // Array mit Ausgabetext
        String[] textA = { "Hallo Tester!", "Wie geht es?", "Danke, gut!" };

        // Methode zum Testen des Ausgabestroms aufrufen
        testeCharacterAusgabeStrom(dateiName, textA);
    }

    /**
     * Methode zum Testen eines Character-Ausgabestroms.
     *
     * @param dateiName
     *            Name der Datei in die Daten geschrieben werden
     * @param textA
     *            zu schreibendes String-Array
     * @throws IOException
     */
    public static void testeCharacterAusgabeStrom(String dateiName,
            String[] textA) throws IOException {
        // Eine Datei und drei Ausgabestroeme erzeugen und miteinander
        // verbinden
        FileOutputStream foStream = new FileOutputStream(dateiName);
        OutputStreamWriter osWriter = new OutputStreamWriter(foStream);
        BufferedWriter bWriter = new BufferedWriter(osWriter);
        // Datenfluss: Programm --> bWriter --> osWriter --> foStream --> Datei

        // Ausgabetext zeilenweise (durch die Stroeme) in die Datei schreiben
        for (int i = 0; i < textA.length; i++) {
            bWriter.write(textA[i]);
            bWriter.newLine(); // Plattformabhaengig!
        }
        // Ausgabestrom schliessen
        bWriter.close();
    }
}