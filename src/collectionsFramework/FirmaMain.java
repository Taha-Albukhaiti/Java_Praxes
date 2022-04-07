package collectionsFramework;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

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


        Firma f = new Firma("meineFirma");
        Collection<Person> unserePersonen;
        Collection<Person> unserePersonenInKiel;
        Collection<Kunde> unsereKunden;
        Collection<Integer> unsereZahlen;

        unserePersonen = new LinkedList<>();
        unserePersonenInKiel = new LinkedList<>();
        unsereKunden = new LinkedList<>();
        unsereZahlen = new LinkedList<>();

        unsereZahlen.add(1);
        unsereZahlen.add(2);
        Angestellte ang1 = new Angestellte("Taylor", "Elisabeth", "Amrummer Strasse", 410000);
        unserePersonenInKiel.add(ang1);

        boolean b1 = unserePersonen.containsAll(unserePersonenInKiel);
        boolean b2 = unserePersonen.containsAll(unsereKunden);
        boolean b3 = unserePersonen.containsAll(unsereZahlen);
        System.out.println(b1 + " " + b2 + " " + b3 );



        /*
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
*/
    }

}
