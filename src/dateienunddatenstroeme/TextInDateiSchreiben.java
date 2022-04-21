package dateienunddatenstroeme;

import java.io.*;

/**
 * Klasse zur Kombination von Ein- und Ausgabestroemen: Text wird ueber die
 * Tastatu eingelesen und in eine Datei geschrieben.
 *
 * @author skalt
 * @version 2.0 07/2009
 */

public class TextInDateiSchreiben {
    /**
     * Main-Methode.
     *
     * @param args Uebergabeparameter
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // Dateiname ohne Pfadangabe
        String dateiName = "TestDatei.txt";
        // Methode zum Schreiben in eine Datei aufrufen

        schreibeTextInDatei(dateiName);
        ausgabe(dateiName);// Nichts wird ausgegeben, da die Daten nicht persistiert sind

    }

    /**
     * Methode zum Testen Schreiben von Text, der ueber die Tastatur eingegeben
     * wird, in eine Datei.
     *
     * @param dateiName Name der Datei in die Text geschrieben wird
     * @throws IOException
     */
    public static void schreibeTextInDatei(String dateiName) throws IOException {

        // Eingabestroeme erzeugen und miteinander verbinden
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        // Datenfluss: Programm <-- bReader <-- InputStreamReader <--
        // Standardeingabe

        // Ausgabestroeme erzeugen und miteinander verbinden
        BufferedWriter bWriter = new BufferedWriter(new FileWriter(dateiName));
        // Datenfluss: Programm --> bWriter --> FileWriter --> Datei

        // ueber Tastatur eingegebenen Text zwischenspeichern
        String text;
        String frage;
        do {
            // Benutzerhinweise anzeigen
            System.out.println("Geben Sie einen Text ein und beenden Sie Ihre " + "Eingabe mit Enter.");
            text = bReader.readLine();
            // Zeichenfolge aus der Variable text wird in die Datei geschrieben
            bWriter.write(text);

            System.out.println("Wollen Sie noch etwas schreiben? (Ja/nein)");
            frage = bReader.readLine();
        } while (frage.equalsIgnoreCase("JA"));
        // Eingabestrom wird geschlossen
        bReader.close();

        // Ausgabestrom wird geschlossen
        bWriter.close();
        // Benutzerhinweise anzeigen
        System.out.println("Ihre Eingaben wurden in die Datei '" + dateiName + "' gespeichert.");

    }

    public static void ausgabe(String dateiName) throws IOException {
        FileInputStream fiStream = new FileInputStream(dateiName);
        InputStreamReader isReader = new InputStreamReader(fiStream);
        BufferedReader bbReader = new BufferedReader(isReader);
        // Datenfluss: Programm <-- bReader <-- isReader <-- fiStream <-- Datei
        String einezeile;
        while (bbReader.ready()) {
            einezeile = bbReader.readLine();
            System.out.println("Ihre eingegeben Texte: " + einezeile);
        }
    }
}