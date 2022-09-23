package saxanddom.dom;

public class AdressePrivat extends Adresse2 {
    private String typ;

    public AdressePrivat() {
    }

    public AdressePrivat(String vorname, String nachname, String strasse, String plz, String ort, String land, String typ) {
        super(vorname, nachname, strasse, plz, ort, land);
        this.typ = typ;
    }

    @Override
    public String toString() {
        return "AdressePrivat{" +
                super.toString() +
                "typ='" + typ + '\'' +
                '}';
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
}
