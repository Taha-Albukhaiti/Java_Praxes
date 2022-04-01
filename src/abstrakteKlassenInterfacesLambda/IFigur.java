package abstrakteKlassenInterfacesLambda;

import java.util.Comparator;

public interface IFigur extends Comparable<IFigur> {
    /*public static class FlaechenComparator implements Comparator<IFigur> {
        @Override
        public int compare(IFigur o1, IFigur o2) {
            return (int) (o1.getFlaeche() - o2.getFlaeche());
        }
    } */
    String[] FARBEN = {"Rot", "Gruen", "Blau"};

    /**
     * gibt den Namen der Farbe des IFigur-Objektes zurueck
     *
     * @return die Farbe als Zeichenkette
     */
    String getFarbe();

    /**
     * gibt den Status des IFigur-Objektes zurueck.
     * Der Status ist eine Zeichenkette
     * wie "Ich bin ein Kreis".
     *
     * @return den Status des Figur-Objektes
     */
    String getStatus();

    /**
     * gibt die Flaeche des IFigur-Objektes zurueck
     *
     * @return die Flaeche
     */
    double getFlaeche();

    /**
     * gibt den Namen einer Farbe aus dem Array FARBEN zurueck.
     *
     * @return den Namen einer Farbe
     */
    default String getDefaultFarbe() {
        java.util.Random zufall = new java.util.Random();
        // Farbe wird zufaellig bestimmt
        return FARBEN[zufall.nextInt(3)];

    }

    @Override
    public default int compareTo(IFigur o) {
        return this.getFarbe().compareTo(o.getFarbe());
    }

}