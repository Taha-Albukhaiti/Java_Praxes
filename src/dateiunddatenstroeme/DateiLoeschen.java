package dateiunddatenstroeme;

import java.io.File;
import java.io.IOException;

/**
 * Testen der Methoden der Klasse File.
 *
 * @author skalt
 * @version 2.0 07/2009
 */
public class DateiLoeschen {
    /**
     * Main-Methode
     *
     * @param args Uebergabeparamater
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // Uebergabeparameter pruefen
        if (args.length != 2) {
            System.out.println("\nAufruf des Programms:\n"
                    + "java DateiEntfernen datei  verz");
            System.out.println("\ndatei:  Datei, die geloescht werden soll.");
            System.out.println("verz:  Verzeichnis, in dem die zu "
                    + "loeschende Datei gespeichert ist.");
            System.exit(1);
        }
        // Datei loeschen
        loescheDatei(args[0], args[1]);
    }

    /**
     * Methode zum Loeschen einer Datei.
     *
     * @param datei Datei, die geloescht werden soll
     * @param verz  Verzeichnis, in dem zu loeschende Datei gespeichert ist
     * @throws IOException
     */
    private static void loescheDatei(String datei, String verz) throws IOException {

        // File-Objekt fuer zu loeschende Datei erzeugen
        File removeFile = new File(verz + File.separatorChar + datei);

        // Datei loeschen
        if (removeFile.delete()) {
            // Benutzerinformation
            System.out.println("\nDie Datei '" + datei + "' wurde "
                    + "aus dem Verzeichnis: '" + verz + "' geloescht.\n");
        }
    }
}