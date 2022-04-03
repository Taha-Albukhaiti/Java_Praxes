package einsendeaufgabezwei;

/**
 *
 */
public class Kunde extends Person {

    protected int kundennummer;

    /**
     * Konstruktor zur Initialisierung der Attribute durch die
     * uebergebenen Parameter.
     *
     * @param vorname      Vorname der Kund:in
     * @param nachname     Nachname der Kund:in
     * @param email        E-Mail-Adresse der Kund:in
     * @param kundennummer Kundennummer der Kund:in
     */
    public Kunde(String vorname, String nachname, String email,
                 int kundennummer) {
        // Konstruktor der Oberklasse wird aufgerufen
        super(vorname, nachname, email);
        this.kundennummer = kundennummer;
    }


    @Override
    public String toString() {
        return "Kunde: " + kundennummer + super.toString();
    }
}
