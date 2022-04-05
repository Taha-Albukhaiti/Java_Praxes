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
        Angestellte a;
        BufferedReader br = null;
        int zaehler = 0;
        String line;
        for (int i = 0; i < allePersonen.length; i++) {
            allePersonen[i] = null;
        }
        try {
            br = new BufferedReader(new FileReader(quelldatei));
            k = new Kunde();
            a = new Angestellte();
            while ((line = br.readLine()) != null) {
                if (line.startsWith("K")) {
                    k.setVorname(br.readLine());
                    k.setNachname(br.readLine());
                    k.setEmail(br.readLine());
                    k.setKundennummer((int) Double.parseDouble(br.readLine()));
                    allePersonen[zaehler++] = k;
                } else if (line.startsWith("A")) {
                    a.setNachname(br.readLine());
                    a.setVorname(br.readLine());
                    a.setEmail(br.readLine());
                    a.setGehalt((int) Double.parseDouble(br.readLine()));
                    allePersonen[zaehler++] = a;
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
        for (int i = 0; i < allePersonen.length - 1; i++) {
            if (pf.personEinbeziehen(allePersonen[i])) {
                System.out.println(allePersonen[i]);
            }
        }
        //  Personenfilter l = (pf) -> System.out.println(pf[i]);


        //pf = (Personenfilter) Arrays.stream(allePersonen);
              /*  if (p.getClass().equals(Kunde)) {
                    Kunde k = null;
                    System.out.println(k.toString());
                }

               */
    }

    /**
     * Gibt alle Personen aus, die dem uebergebenen Filterkriterium entsprechen
     *
     * @param
     */
    public void gibPersonenAusVariante2(BooleanSupplier n) {        // ### Parameter ergaenzen ###
        // ### to do ###
        n.getAsBoolean();

    }
}
