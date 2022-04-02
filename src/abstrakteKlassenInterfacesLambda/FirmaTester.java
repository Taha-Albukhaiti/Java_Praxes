package abstrakteKlassenInterfacesLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Klasse zum Testen des einfachen Firmen- Verwaltungsprogramms.
 *
 * @author Agathe Merceron
 * @version 1.0
 */
public class FirmaTester implements Comparator<Kunde> {

    /**
     * Main-Methode.
     *
     * @param args Uebergabeparameter
     */
    public static void main(String[] args) {
        Firma kmu = new Firma(4, "Java4You");
        Angestellte ang1 = new Angestellte("Taylor", "Elisabeth",
                "Amrummer Strasse", "10", "13353", "Berlin", true, 410000f);
        kmu.addAngestellte(ang1);
        // result should be 410000
        System.out.println("Alle Gehälter " + kmu.alleGehaelter());
        Angestellte ang2 = new Angestellte("Mueller", "Mark",
                "Amrummer Strasse", "11", "13353", "Berlin", false, 20000f);
        kmu.addAngestellte(ang2);
        // result should be 420000
        System.out.println(kmu.alleGehaelter());
        Kunde k1 = new Kunde("Cruise", "Tom", "Amrummer Strasse", "12",
                "13353", "Berlin", false);
        kmu.addKunde(k1);
        // result should be 0
        System.out.println(k1.getKundenNr());
        Kunde k2 = new Kunde("Jolie", "Angelina", "Amrummer Strasse", "13",
                "13353", "Berlin", true);
        kmu.addKunde(k2);
        // result should be 1
        System.out.println(k2.getKundenNr());
        // check we have the right people
        kmu.alleAdressenAusgeben();
        Kunde k3 = new Kunde("Deneuve", "Catherine", "Amrummer Strasse", "14",
                "13353", "Berlin", true);
        // should not be possible
        kmu.addKunde(k3);
        // should be true
        System.out.println(kmu.istVoll());
        ArrayList<Kunde> m = new ArrayList<>();
        m.add(k2);
        m.add(k3);
        m.add(k1);


        Arrays.sort(m, (o1, o2) -> o2.compareTo(o1));

    }

    @Override
    public int compare(Kunde o1, Kunde o2) {
        return 0;
    }
}
