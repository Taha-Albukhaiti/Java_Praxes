package collectionsFramework;


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
    /*
    public void ladePersonen(String quelldatei) throws IOException {
        // ### to do ###
        Kunde k;
        Angestellte a;
        Person p;
        BufferedReader br = null;
        int zaehler = 0;
        String line;
        for (int i = 0; i < allePersonen.length; i++) allePersonen[i] = null;
        try {
            br = new BufferedReader(new FileReader(quelldatei));
            while ((line = br.readLine()) != null) {
                if (line.equals("K")) {
                    k = new Kunde();
                    k.setNachname(br.readLine());
                    k.setVorname(br.readLine());
                    k.setEmail(br.readLine());
                    k.setKundennummer(Integer.parseInt(br.readLine()));
                    allePersonen[zaehler++] = k;
                } else if (line.equals("A")) {
                    a = new Angestellte();
                    a.setNachname(br.readLine());
                    a.setVorname(br.readLine());
                    a.setEmail(br.readLine());
                    a.setGehalt(Float.parseFloat(br.readLine()));
                    allePersonen[zaehler++] = a;
                }
            }
        } catch (Exception e) {
            System.err.println("Fehler beim Laden: " + e.getMessage());
        } finally {
            br.close();
        }
    }
*/

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
    }

    /**
     * Gibt alle Personen aus, die dem uebergebenen Filterkriterium entsprechen
     *
     * @param
     */
    public void gibPersonenAusVariante2(BooleanSupplier n) {        // ### Parameter ergaenzen ###
        // ### to do ###
        for (int i = 0; i < allePersonen.length - 3; i++) {
            if (n.getAsBoolean()) {
                System.out.println(allePersonen[i]);
            }
        }

    }

}


