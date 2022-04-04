package einsendeaufgabezwei;

import java.io.*;
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
        Kunde k = null;
        Angestellte a = null;
        BufferedReader br = null;
        int zaehler = 0;
        String line;
        String s1 = "K";
        String s2 = "A";
        for (int i = 0; i < allePersonen.length; i++) {
            allePersonen[i] = null;
        }
        try {

            br = new BufferedReader(new FileReader(quelldatei));
            while (br.ready()) {
                while ((line = br.readLine()) != null) {
                    if (line == s1) {
                        continue;
                    }
                    while ((line = br.readLine()) != null) {
                        if (line != s2) {
                            k = new Kunde();
                            k.setVorname(br.readLine());
                            k.setNachname(br.readLine());
                            k.setEmail(br.readLine());
                            k.setKundennummer((int) Double.parseDouble(br.readLine()));
                            allePersonen[zaehler++] = k;
                        } else if (line == s2) {
                            a = new Angestellte();
                            a.setVorname(br.readLine());
                            a.setNachname(br.readLine());
                            a.setEmail(br.readLine());
                            a.setGehalt((int) Double.parseDouble(br.readLine()));
                            allePersonen[zaehler++] = a;
                        }
                    }
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
                System.out.println(allePersonen.toString());
            }
        }
        //  Personenfilter l = (pf) -> System.out.println(pf[i]);
                /* for (pf : allePersonen) {
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
