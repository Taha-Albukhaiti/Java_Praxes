package abstrakteKlassenInterfacesLambda;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Diese Klasse enthaelt Methoden, um Benutzereingaben von der Konsole zu lesen.
 * Copyright: Copyright (c) 2011, TFH Berlin. Alle Rights Reserved.
 * Organisation: Beuth Hochschule fuer Technik Berlin - Virtuelle FH
 * 
 * @author Alexander Schmidt
 * @version 1.0
 **/
public class Konsole {

    static BufferedReader br = new BufferedReader(new InputStreamReader(
            System.in));

    /**
     * Die Methode liest eine Benutzereingabe von der Konsole.
     * 
     * @param text
     *            Enthaelt die Eingabeaufforderung fuer den Benutzer
     * @return String
     */
    static String getInputString(String text) {
        while (true) {
            System.out.print(text);
            try {
                return br.readLine();
            } catch (Exception e) {
                System.err.println("Fehler bei der Verarbeitung: "
                        + e.getLocalizedMessage());
            }
        }
    }

    /**
     * Die Methode liest eine Benutzereingabe von der Konsole
     * 
     * @param text
     *            Enthaelt die Eingabeaufforderung fuer den Benutzer
     * @return Integer
     */
    static int getInputInt(String text) {
        while (true) {
            System.out.print(text);
            try {
                return Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.err.println("Fehler bei der Verarbeitung: "
                        + e.getLocalizedMessage());
            }
        }
    }

    /**
     * Die Methode liest eine Benutzereingabe von der Konsole
     * 
     * @param text
     *            Enthaelt die Eingabeaufforderung fuer den Benutzer
     * @return Float
     */
    static float getInputFloat(String text) {
        while (true) {
            System.out.print(text);
            try {
                return Float.parseFloat(br.readLine());
            } catch (Exception e) {
                System.err.println("Fehler bei der Verarbeitung: "
                        + e.getLocalizedMessage());
            }
        }
    }

    /**
     * Die Methode liest eine Benutzereingabe von der Konsole
     * 
     * @param text
     *            Enthaelt die Eingabeaufforderung fuer den Benutzer
     * @return Char
     */
    static char getInputChar(String text) {
        String buffer;
        while (true) {
            System.out.print(text);
            try {
                buffer = br.readLine();
                return buffer.charAt(0);
            } catch (Exception e) {
                System.err.println("Fehler bei der Verarbeitung: "
                        + e.getLocalizedMessage());
            }
        }
    }

}
