package einsendeaufgabezwei;

import java.text.DecimalFormat;

/**
 *
 */
public class Angestellte extends Person {

    protected float gehalt;

    /**
     * Konstruktor zur Initialisierung der Attribute durch die
     * uebergebenen Parameter.
     *
     * @param vorname  Vorname der Angestellten
     * @param nachname Nachname der Angestellten
     * @param email    E-Mail-Adresse der Angestellten
     * @param gehalt   Gehalt der Angestellten
     */
    public Angestellte(String vorname, String nachname, String email, float gehalt) {
        // Konstruktor der Oberklasse wird aufgerufen
        super(vorname, nachname, email);
        this.gehalt = gehalt;
    }

    public Angestellte() {

    }

    public String getGehalt() {
        DecimalFormat f = new java.text.DecimalFormat( "0.00" );
        String l = f.format(gehalt);
        return l;
    }

    public float setGehalt(float gehalt) {
        this.gehalt = gehalt;
        return 0;
    }

    @Override
    public String toString() {
        return "Angestellte: " + super.toString() + ", " + gehalt;
    }

}
