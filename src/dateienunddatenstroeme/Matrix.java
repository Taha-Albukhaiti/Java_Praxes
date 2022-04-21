package dateienunddatenstroeme;

import java.io.*;

public class Matrix {
    /**
     * Informationen zum uebergebenen File-Objekt unter Verwendung von Methoden der
     * Klasse File anzeigen.
     *
     * @param testDatei File-Objekt zu dem Informationen angezeigt werden sollen
     */
    static void zeigeFileInfos(File testFile) {
        System.out.println("\nInformationen:\n");
        System.out.println("Name= " + testFile.getName());
        System.out.println("Path= " + testFile.getPath());
        System.out.println("AbsolutePath= " + testFile.getAbsolutePath());
        System.out.println("Parent= " + testFile.getParent());
        System.out.println("exists= " + testFile.exists());
        System.out.println("canRead= " + testFile.canRead());
        System.out.println("canWrite= " + testFile.canWrite());
        System.out.println("isFile= " + testFile.isFile());
        System.out.println("isDirectory= " + testFile.isDirectory());
    }

    /**
     * Methode zum Erzeugen einer neuen Datei mit dem uebergebenen Dateinamen.
     *
     * @param dateiName Name der zu erzeugenden Datei
     * @return erzeugtes File-Objekt
     * @throws IOException
     */
    static File erzeugeDatei(String dateiName) throws IOException {
        // Dateiobjekt mit entsprechendem Namen erzeugen
        File testDatei = new File(dateiName);
        // leere Datei erzeugen
        testDatei.createNewFile();
        testDatei.setWritable(true);
        return testDatei;
    }

    /**
     * Methode zum Testen Schreiben von Text, der ueber die Tastatur eingegeben
     * wird, in eine Datei.
     *
     * @param dateiName Name der Datei in die Text geschrieben wird
     * @throws IOException
     */
    public static void schreibeTextInDatei(File dateiName) throws IOException {

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

    public static void main(String[] args) throws IOException {

        // Datei erzeugen
        File testDatei = erzeugeDatei("TestFile.txt");
        zeigeFileInfos(testDatei);
        System.out.println(testDatei);
        // Dateiinformationen anzeigen
        // zeigeFileInfos(testDatei);

        // Auf die Datei Schreiben
        schreibeTextInDatei(testDatei);

    }

}
