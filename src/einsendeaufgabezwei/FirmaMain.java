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
        Firma f = new Firma("meineFirma");
        try {
            f.ladePersonen(DATEINAME);
        } catch (IOException e) {
            e.printStackTrace();
        }

        f.gibPersonenAus(new Personenfilter() {
            @Override
            public boolean personEinbeziehen(Person p) {
                return p instanceof Kunde ? true : false;
            }
        });

        System.out.println();
        f.gibPersonenAus(p -> p instanceof Angestellte ? true : false);

        System.out.println();
        f.gibPersonenAusVariante2(() -> true);

    }

}
