package saxanddom.dom;

public class AdresseGeschaeftlich extends Adresse2 {
    private String typ;

    public AdresseGeschaeftlich() {
    }

    public AdresseGeschaeftlich(String typ) {
        this.typ = typ;
    }

    public AdresseGeschaeftlich(String vorname, String nachname, String strasse, String plz, String ort, String land, String typ) {
        super(vorname, nachname, strasse, plz, ort, land);
        this.typ = typ;
    }

    @Override
    public String toString() {
        return "AdresseGeschaeftlich{'Vorname =" + getVorname() + '\'' +
                ", nachname='" + getNachname() + '\'' +
                ", strasse='" + getStrasse() + '\'' +
                ", plz='" + getPlz() + '\'' +
                ", ort='" + getOrt() + '\'' +
                ", land='" + getLand() + '\'' +
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
