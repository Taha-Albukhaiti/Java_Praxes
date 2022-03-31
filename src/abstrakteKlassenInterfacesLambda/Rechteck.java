package abstrakteKlassenInterfacesLambda;

import java.io.Serializable;

public class Rechteck implements IFigur, Serializable {

    /**
     * Das serialVersionUID gibt die Identitaet der Klasse 
     * womit RechtEck-Objekt als Objekt gespeichert werden.
     */
    private static final long serialVersionUID = 1L;
    private double laenge;
    private double breite;
    private String farbe;

    /**
     * erzeugt ein RechtEck-Objekt mit den angegebenen 
     * Werten fuer Laenge und Breite
     * 
     * @param laenge, Laenge des Rechteckes
     * @param breite, Breite des Rechteckes
     */
    Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
        this.farbe = getDefaultFarbe();
    }

    /**
     * erzeugt ein RechtEck-Objekt mit den angegebenen 
     * Werten fuer Laenge, Breite und Farbe
     * 
     * @param laenge
     * @param breite
     * @param farbe
     */

    Rechteck(double laenge, double breite, String farbe) {
        this.laenge = laenge;
        this.breite = breite;
        this.farbe = farbe;
    }

    @Override
    public String getFarbe() {
        return this.farbe;
    }

    @Override
    public String getStatus() {
        return "Ich bin ein Rechteck";
    }

    @Override
    public double getFlaeche() {
        return laenge * breite;
    }

    @Override
    public String getDefaultFarbe() {
        return FARBEN[0];
    }

    @Override
    public String toString() {
        return "[Laenge= " + this.laenge + ", Breite=" + this.breite + ", Farbe=" + this.farbe + "]";
    }

}