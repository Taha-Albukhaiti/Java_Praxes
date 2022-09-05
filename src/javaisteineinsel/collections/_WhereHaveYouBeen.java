package javaisteineinsel.collections;

import java.text.BreakIterator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class _WhereHaveYouBeen {
    public static String join(Iterable<?> iterable) {
        StringBuffer result = new StringBuffer();
        for (Object o : iterable) {
            if (result.length() != 0)
                result.append(", ");
            result.append(o.toString());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Mengen mit Städten aufbauen
        Set<String> allCities = new HashSet<>();
        allCities.add("Sonsbeck");
        allCities.add("Düsseldorf");
        allCities.add("Manila");
        allCities.add("Seol");
        allCities.add("Siquijr");

        // Menge für besuchte Städte aufbauen
        Set<String> visitedCities = new TreeSet<>((s1, s2) -> s1.length() - s2.length());

        // Satz parsen und in Wörtern zerlegen. Alle gefundenen Städte
        // in neue Datenstruktur aufnehmen

        String sentence = "Von Sonsbeck fahre ich bach Düsseldorf und fliege nach Manila.";
        BreakIterator iter = BreakIterator.getWordInstance();
        iter.setText(sentence);

        for (int first = iter.first(), last = iter.next();
             last != BreakIterator.DONE;
             first = last, last = iter.next()) {
            String word = sentence.substring(first, last);
            if (allCities.contains(word)) {
                visitedCities.add(word);
            }
        }

        // Kleine Statistik

        System.out.println("Anzahl besuchte Städte: " + visitedCities.size());
        System.out.println("Anzahl nicht besuchte Städte: " + (allCities.size() - visitedCities.size()));
        System.out.println("Besuchte Städte: " + join(visitedCities));
        Set<String> unvisitedCities = new TreeSet<>(allCities);
        unvisitedCities.removeAll(visitedCities);
        System.out.println("Unbesuchte Städte: " + join(unvisitedCities));
    }
}
