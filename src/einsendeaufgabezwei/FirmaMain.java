package einsendeaufgabezwei;

import java.io.IOException;

/**
 *
 */
public class FirmaMain {

    /* Der Name der Datei mit den Stammdaten
     */
    private static final String DATEINAME = "stammdaten.txt";


    /**
     * Main-Methode.
     *
     * @param args Uebergabeparameter
     */
    public static void main(String[] args) {

        // ### to do ###

        Firma m = new Firma("Blabal");
        try {
            m.ladePersonen(DATEINAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
