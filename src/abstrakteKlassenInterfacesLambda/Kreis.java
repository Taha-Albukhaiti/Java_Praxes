package abstrakteKlassenInterfacesLambda;

import java.io.Serializable;

public class Kreis implements IFigur, Serializable {

    /**
     * Das serialVersionUID gibt die Identität der Klasse
     * womit Kreis-Objekt als Objekt gespeichert werden.
     */
    private static final long serialVersionUID = 1L;
    private double radius;
    private String farbe;

    /**
     * erzeugt ein Kreis-Objekt mit dem angegebenen Radius
     *
     * @param iRadius, der Radius
     */

    Kreis(double iRadius) {
        this.radius = iRadius;
        this.farbe = getDefaultFarbe();
    }

    /**
     * erzeugt ein Kreis-Objekt mit dem angegebenen Radius
     * und der angegebenen Farbe
     *
     * @param iRadius, der Radius
     * @param farbe,   die Farbe als Zeichenkette
     */

    Kreis(double iRadius, String farbe) {
        this.radius = iRadius;
        this.farbe = farbe;
    }

    @Override
    public String getFarbe() {
        return this.farbe;
    }

    @Override
    public String getStatus() {
        return "Ich bin ein Kreis";
    }

    @Override
    public double getFlaeche() {
        final double pi = Math.PI;
        final double flaeche = Math.pow(radius, 2) * pi;
        return flaeche;
    }

    /**
     * erhoeht den Radius.
     *
     * @param rate, die Rate um den Radius zu erhoehen.
     */
    public void radiusIncrease(double rate) {
        this.radius += radius * rate;
    }

    @Override
    public String toString() {
        return "[Radius= " + this.radius + ", Farbe=" + this.farbe + "]";
    }
}
