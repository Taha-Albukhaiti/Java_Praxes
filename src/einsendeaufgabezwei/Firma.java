package einsendeaufgabezwei;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.BooleanSupplier;

/**
 *
 */
public class Firma {

    /* Maximale Anzahl der mit der Firma in Beziehung stehenden Personen
     * (Kund:innen oder Angestellte)
     */
    private static final int MAX_ANZAHL = 7;

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

        BufferedReader br = null;
        int zaehler = 0;
        String line;
        for (int i = 0; i < allePersonen.length; i++) {
            allePersonen[i] = null;
        }
        try {
            br = new BufferedReader(new FileReader(quelldatei));
            while ((line = br.readLine()) != null) {
                if (line.equals("K")) {
                    allePersonen[zaehler++] = new Kunde(br.readLine(), br.readLine(), br.readLine(), Integer.parseInt(br.readLine()));
                } else if (line.equals("A")) {
                    allePersonen[zaehler++] = new Angestellte(br.readLine(), br.readLine(), br.readLine(), (Math.round(Float.parseFloat(br.readLine()) * 100) / 100F));
                }
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
    public void gibPersonenAus(Personenfilter pf) {        // ### Parameter ergaenzen ###
        // ### to do ###
        for (int i = 0; i < allePersonen.length; i++) {
            if (pf.personEinbeziehen(allePersonen[i])) {
                System.out.println(allePersonen[i]);
            }
        }
    }

    /**
     * Gibt alle Personen aus, die dem uebergebenen Filterkriterium entsprechen
     *
     * @param
     */
    public void gibPersonenAusVariante2(BooleanSupplier n) {        // ### Parameter ergaenzen ###
        // ### to do ###
        for (int i = 0; i < allePersonen.length; i++) {
            if (n.getAsBoolean()) {
                System.out.println(allePersonen[i]);
            }
        }

    }

}


