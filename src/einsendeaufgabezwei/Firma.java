package einsendeaufgabezwei;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 */
public class Firma {

    /* Maximale Anzahl der mit der Firma in Beziehung stehenden Personen
     * (Kund:innen oder Angestellte)
     */
    private static final int MAX_ANZAHL = 10;

    /* Name der Firma
     */
    private String name;

    /* Array, das alle Kund:innen und Angestellten der Firma enthaelt
     */
    private Person[] allePersonen = new Person[MAX_ANZAHL];


    /**
     * Konstruktor
     *
     * @param name Firmenname
     */
    public Firma(String name) {

        this.name = name;
    }


    /**
     * Liest die Personendaten (Kund:innen und Angestellte) aus
     * der als Parameter uebergebenen Datei, legt die entsprechenden
     * Objekte an und traegt diese in das Array allePersonen ein.
     */
    public void ladePersonen(String quelldatei) throws IOException {
        // ### to do ###
        Kunde k;
        allePersonen = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(quelldatei));
            String zeile = null;
            while ((zeile = br.readLine()) != null) {
                if (zeile.equals("k")) {
                    zeile = null;
                    while ((zeile = br.readLine()) != null) {
                        String vor = zeile;

                        k = new Kunde(zeile, );
                    }


                    System.out.println("Test: " + zeile);
                }

                //if (br.toString() == "k") {
                //}
            }

        } catch (Exception e) {
            System.err.println("Fehler beim Laden: " + e.getMessage());
        } finally {
            br.close();
        }

    }


    /**
     * Gibt alle Personen aus, die dem uebergebenen Filterkriterium entsprechen
     *
     * @param
     */
    public void gibPersonenAus() {        // ### Parameter ergaenzen ###

        // ### to do ###

    }

    /**
     * Gibt alle Personen aus, die dem uebergebenen Filterkriterium entsprechen
     *
     * @param
     */
    public void gibPersonenAusVariante2() {        // ### Parameter ergaenzen ###

        // ### to do ###

    }
}
