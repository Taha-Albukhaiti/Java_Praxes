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

    public float getGehalt() {

        return gehalt;
    }

    public void setGehalt(float gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String toString() {
        return "Angestellte: " + super.toString() + ", " + gehalt;
    }

}
