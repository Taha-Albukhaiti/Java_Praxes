package einsendeaufgabedrei;

/**
 */
public class Telefoneintrag {
    private String name;
    private String nummer;
    /**
     * Konstruktor zur Initialisierung der Instanzvariablen mit den uebergebenen Werten
     * @param name Name der Person
     * @param nummer Telefonnummer der Person
     */
    public Telefoneintrag(String name, String nummer) {
   	 this.name = name;
   	 this.nummer = nummer;
    }
    
    public String getName() {
        return this.name;
    }

    public String getNummer() {
        return this.nummer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }


}
