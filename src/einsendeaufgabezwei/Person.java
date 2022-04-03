package einsendeaufgabezwei;

/**
 */
public abstract class Person {

    protected String vorname;
    protected String nachname;
    protected String email;

    /**
     * Konstruktor zur Initialisierung der Attribute durch die
     * uebergebenen Parameter.
     * 
     * @param vorname    Vorname der Person 
     * @param nachname   Nachname der Person
     * @param email    	 E-Mail-Adresse der Person
     */
    public Person(String vorname, String nachname, String email) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.email = email;
    }

    @Override
    public String toString() {
        return  vorname + ',' + nachname + ',' + email ;
    }
}