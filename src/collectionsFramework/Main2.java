package collectionsFramework;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Clll<Double> n = new Clll();
        n.setObj(15.9);
        System.out.println(n.getObj());

        //Stack
        Stack<String> mi = new Stack<>();
        mi.push("Eins");
        mi.push("Zwei");
        mi.push("Drei");
        System.out.println(mi);
        System.out.println(mi.peek());
        String s = mi.pop();
        System.out.println(mi.peek());
        String sd = mi.pop();
        System.out.println(mi.peek());
        mi.push(s);
        mi.push(sd);
        System.out.println(mi.peek());
        System.out.println(mi);
        System.out.println();

        Set<Double> set = new HashSet();
        set.add(2.2);
        set.add(2.2);
        set.add(2.2);
        set.add(2.1);
        set.add(2.01);
        set.add(1.11);
        set.add(1.11);
        System.out.println(set);

        Set immutableSet = Set.of(2.3, 32.3, 32.33, 4.4);// kann man nichts hinzufügen oder ändern oder löschen
        System.out.println(immutableSet);

        set.addAll(Set.of(32.33, 4.4));
        System.out.println(set);
        for (Double m : set) {
            System.out.println(m);
        }
        System.out.println();
        Map<String, Integer> map = new HashMap();
        map.put("Martikl", 2323);
        map.put("Password", 23231123);
        map.put("Quatsch", 2213123);
        map.remove("Martikl");
        System.out.println(map.containsKey("Password"));
        System.out.println(map.replace("Password", 23));
        System.out.println(map);
        System.out.println(map.get("Martikl"));
        System.out.println();

        Set<String> sm = map.keySet();
        for (String ss : sm) {
            System.out.println(ss + " Password " + map.get(ss));
        }

        Map<String, String> coun = new HashMap<>();
        coun.put("Deutschland", "Berlin");
        coun.put("Frankreich", "Paris");
        coun.put("Japan", "Tokio");
        coun.put("Russland", "Moskau");
        coun.put("China", "Peking");

        List<String> countr = new ArrayList<>();
        countr.addAll(coun.keySet());
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int ind = r.nextInt(countr.size());
            String country = countr.get(ind);
            System.out.println("Was ist die Hauptstadt von " + country + " ?");
            if (scanner.next().equals(coun.get(country))) {
                System.out.println("Richtig!");
            } else {
                System.out.println("Falsch! Rictig wäre " + coun.get(country));

            }

        }


    }
}
