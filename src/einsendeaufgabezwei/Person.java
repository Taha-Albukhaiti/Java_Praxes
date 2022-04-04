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

    public Person() {
    }

    public String getVorname() {
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  vorname + ',' + nachname + ',' + email ;
    }
}