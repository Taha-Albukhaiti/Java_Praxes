package collectionsFramework;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<Person> unserePersonen = new LinkedList<>();
        Collection<Person> unserePersonenInKiel = new ArrayList<>();
        Collection<Kunde> unsereKunden = new LinkedList<>();
        Collection<Integer> unsereZahlen = new LinkedList<>();
        Person p;
        Kunde k = new Kunde();

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

        k = new Kunde("Tariq", "asfdasf", "sdfdf", "affa", "asf", "asdf", false);
        unserePersonen.add(k);
        unserePersonen.add(new Kunde("Ali", "asfdasf", "sdfdf", "affa", "asf", "asdf", false));

        Object[] unserePersonenArray = unserePersonen.toArray();
        unserePersonenArray[0] = "Adam";
        System.out.println(Arrays.toString(unserePersonenArray));

// Ein Array der richtigen Laenge wird erzeugt
// und als Parameter gegeben.
        Kunde[] unsereKunde_3 = new Kunde[3];
        unserePersonen.toArray(unsereKunde_3);
        System.out.println("unsereKunde_3");
        System.out.println(Arrays.toString(unsereKunde_3));

// Der Parameter ist ein anonymous Array der Laenge 0.
        Kunde[] unsereKunde_2 = unserePersonen.toArray(new Kunde[0]);
        System.out.println(Arrays.toString(unsereKunde_2));
        Person[] unserePersonen_1 = unsereKunden.toArray(new Person[0]);
        System.out.println(Arrays.toString(unserePersonen_1));
// Number[] unsereKunde_4 = unserePersonen.toArray(new Number[0]);
// System.out.println(Arrays.toString(unsereKunde_3));

        System.out.println();

        Iterator<Person> it = unserePersonen.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }
        System.out.println("");

        unserePersonen.removeIf(n -> n.getName().charAt(0) < 'G');
        unserePersonen.removeIf(n -> n.getName().contains("Tariq"));
        it = unserePersonen.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }


        System.out.println("");

        for (Person dd : unserePersonen) {
            System.out.println(dd);

        }
        // Map
        System.out.println("");

        Map<String, Person> unserePersonenMap;
        unserePersonenMap = new HashMap<>();
        unserePersonenMap.put(k1.getName(), k1);
        unserePersonenMap.put(k2.getName(), k2);
        unserePersonenMap.put(k3.getName(), k3);
        
        System.out.println(unserePersonenMap.containsKey("Nelson - Mandela"));
        if (unserePersonenMap.containsKey("Catherine - Deneuve")) {
            System.out.println(unserePersonenMap.get("Catherine - Deneuve"));
        }

        Collection<Person> unserePersonen2 = unserePersonenMap.values();
        Iterator<Person> it2 = unserePersonen2.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next().getName());
        }
    }
}
