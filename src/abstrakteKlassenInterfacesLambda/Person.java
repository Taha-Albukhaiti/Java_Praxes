package abstrakteKlassenInterfacesLambda;

/**
 * Abstrakte Klasse Person. Diese Klasse ist abstrakt, weil eine Person an sich
 * fuer eine Firma nicht existiert, sondern eine Person immer entweder ein
 * Angestellter oder ein Kunde ist. Dies wird wiedergespiegelt mit dem Konzept
 * der abstrakten Klasse. Der gemeinsame Teil fuer Angestellter und Kunde ist in
 * der Klasse Person beinhaltet.
 *
 * @author S. Kaltofen
 * @version 2.4
 */

public abstract class Person {

    // Instanzvariablen
    private String nachname, vorname, strasse, hausnummer, ort, plz;
    private boolean weiblich; // Ist Person maennlich=> weiblich=false,
    // ist sie weiblich: weiblich=true

    /**
     * Parameterloser Konstruktor mit Initialisierung der Attribute mit
     * Muster-Werten.
     */
    public Person() {
        this.nachname = "Muster";
        this.vorname = "MusterVorname";
        this.strasse = "MusterStrasse";
        this.hausnummer = "xx";
        this.ort = "MusterOrt";
        this.plz = "plzpl";
        this.weiblich = true;
    }

    /**
     * Mit diesem Konstruktor erfolgt die Initialisierung der Attribute durch die
     * uebergebenen Parameter.
     *
     * @param nachname   Nachname der Person
     * @param vorname    Vorname der Person
     * @param strasse    Strasse zur Adresse der Person
     * @param hausnummer Hausnummer zur Adresse der Person
     * @param ort        Ort zur Adresse der Person
     * @param plz        PLZ zur Adresse der Person
     * @param weiblich   Flag ob Person weiblich ist
     */
    public Person(String nachname, String vorname, String strasse, String hausnummer, String ort, String plz,
                  boolean weiblich) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.ort = ort;
        this.plz = plz;
        this.weiblich = weiblich;

    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setWeiblich(boolean weiblich) {
        this.weiblich = weiblich;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getHausnummer() {

        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    /**
     * Getter des Attributes weiblich.
     *
     * @return ob die Person weiblich ist
     */
    public boolean isWeiblich() {
        return weiblich;
    }

    /**
     * gibt die Anrede zurueck. Diese Methode ist abstrakt und wird erst bei der
     * Weitervererbung (an Kunde und Angestellter) weiter definiert.
     *
     * @return die Anrede
     */

    protected abstract String getAnrede();

    /**
     * Die Methode gibt die Adresse einer Person-Objekt zurück.
     *
     * @return die Adresse als ein Array von String-Objekte
     */

    public String[] getAdresse() {
        String[] adresse = new String[4];
        adresse[0] = getAnrede();
        adresse[1] = " " + vorname + " " + nachname;
        adresse[2] = " " + strasse + " " + hausnummer;
        adresse[3] = " " + plz + " " + ort;
        return adresse;
    }

    /**
     * Die Methode getName() gibt Vornamen und Nachnamen zurueck.
     *
     * @return Vorname gefolgt von " - " gefolgt vom Nachname
     */
    public String getName() {
        return vorname + " - " + nachname;
    }

    @Override
    public String toString() {
        return "[Person" +
                "nachname='" + this.nachname +
                ", vorname='" + this.vorname +
                ", strasse='" + this.strasse +
                ", hausnummer='" + this.hausnummer +
                ", ort='" + this.ort +
                ", plz='" + this.plz +
                ", weiblich=" + this.weiblich +
                ']';
    }
}
