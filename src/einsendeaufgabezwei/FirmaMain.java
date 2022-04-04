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
        Firma p = new Firma("meineFirma");
        try {
            p.ladePersonen(DATEINAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
        p.gibPersonenAus(new Personenfilter() {
            @Override
            public boolean personEinbeziehen(Person p) {
                return p instanceof Kunde ? true : false;
            }
        });

        System.out.println();
        p.gibPersonenAus((Person per) -> per instanceof Angestellte ? true : false);

        System.out.println();
        p.gibPersonenAusVariante2(() -> true);

    }

}
