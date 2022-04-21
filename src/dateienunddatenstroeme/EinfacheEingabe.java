package dateienunddatenstroeme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EinfacheEingabe {


    /**
     * Main-Methode.
     *
     * @param args Uebergabeparameter
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // Methode zum Eingeben von Text aufrufen
        String vorname = textEingeben("Vornamen");
        String name = textEingeben("Nachnamen");
        int alter = intEingeben("Alter");
        String beruf = textEingeben("Beruf");

        // Eingaben auf Konsole ausgeben
        System.out.print("Hallo: " + vorname + " " + name + "! Du bist "
                + alter + " Jahre alt." + " Dein Beruf ist " + beruf);
    }

    /**
     * Text von der Konsole einlesen und zurueckgeben.
     *
     * @param wertBez Bezeichnung welcher Wert eingegeben werden soll
     * @return von Konsole eingelesener Wert
     * @throws IOException
     */
    public static String textEingeben(String wertBez) throws IOException {
        // Reader-Objekt zum zeilenweisen Einlesen von Text erzeugen
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Eingaben einlesen
        System.out.print("Bitte geben Sie den Wert fuer " + wertBez + " ein: ");
        return br.readLine();
    }

    /**
     * Int Wert von der Konsole einlesen und zurueck geben.
     *
     * @throws IOException
     */
    public static int intEingeben(String wertBez) throws IOException {
        // Reader-Objekt zum zeilenweisen Einlesen von Text erzeugen
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Eingaben einlesen
        System.out.print("Bitte geben Sie den Wert fuer " + wertBez + " ein: ");
        return Integer.parseInt(br.readLine());
    }

}
