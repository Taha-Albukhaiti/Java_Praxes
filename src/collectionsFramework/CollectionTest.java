package collectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<Person> unserePersonen = new LinkedList<>();
        Collection<Person> unserePersonenInKiel = new ArrayList<>();
        Collection<Kunde> unsereKunden = new LinkedList<>();
        Collection<Integer> unsereZahlen = new LinkedList<>();
        Person p;
        Kunde k;

        unsereZahlen.add(1);
        unsereZahlen.add(2);
        Angestellte ang1 = new Angestellte("Taylor", "Elisabeth", "Amrummer Strasse",
                "10", "Hamburg", "13353", true, 410000f);
        unserePersonenInKiel.add(ang1);
        Kunde k1 = new Kunde("Cruise", "Tom", "Amrummer Strasse", "12", "Frankfurt", "13353", false);
        Kunde k2 = new Kunde("Jolie", "Angelina", "Amrummer Strasse", "13", "Nizza", "13354", true);
        Kunde k3 = new Kunde("Deneuve", "Catherine", "Amrummer Strasse", "14", "Paris", "13353", true);

        unsereKunden.add(k1);
        unsereKunden.add(k2);
        unserePersonen.add(k1);
        unserePersonen.add(k2);
        unserePersonen.add(k3);

        Iterator<Person> it = unserePersonen.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }

        k = new Kunde("Tariq", "asfdasf", "sdfdf", "affa", "asf", "asdf", false);
        unserePersonen.add(k);
        unserePersonen.add(new Kunde("Ali", "asfdasf", "sdfdf", "affa", "asf", "asdf", false));
        System.out.println();

        for (Person dd : unserePersonen) {
            System.out.println(dd);

        }

        //LinkedList<Person>  p = new  LinkedList<>();
        //Das Objekt unserePersonen wird
        // mit der Klasse LinkedList<E> instanziiert
        //unserePersonen = new LinkedList<>();
      /*  Kunde k1 = new Kunde("Cruise", "Tom", "Amrummer Strasse", 23211);
        Kunde k2 = new Kunde("Jolie", "Angelina", "Amrummer Strasse", 2232);
        Kunde k3 = new Kunde("Deneuve", "Catherine", "Amrummer Strasse", 2311111);
        unserePersonen.add(k1);
        unserePersonen.add(k2);
        unserePersonen.add(k3);
        Iterator<Person> it = unserePersonen.iterator();
        while (it.hasNext()) System.out.println(it.next().getVorname());
        for (Person pp : unserePersonen) {
            System.out.println(pp);
        }

       */
    }
}
