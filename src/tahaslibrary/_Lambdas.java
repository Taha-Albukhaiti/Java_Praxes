package tahaslibrary;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _Lambdas {
    public static BiFunction<List<String>, String, List<String>> without = (list, str) -> list.stream().filter(s -> !s.equals(str)).collect(Collectors.toList());

    public static BinaryOperator<Integer> nthDigit = (x, y) -> {

        int[] s = IntStream.iterate(x, i -> i > 0, i -> i / 10).map(i -> i % 10).toArray();
        return y > s.length ? null : s[y];
    };

    public static BiFunction<String, String, String> blank = (s1, s2) -> {
        int n, i;
        n = 0;
        i = 1;
        if (!s1.substring(n, i).equals(s2.substring(n, i)))
            s1.replace(s1.substring(n, i), "_");
        ;
        return s1;
    };

    public static BiFunction<String, String, String> blank2 = (s, guessed) -> s.subSequence(0, s.length()).equals(guessed.subSequence(0, guessed.length())) ? s : s.replace(s, "_");

    public static String blank(String s, String guessed) {
        int n = 0;
        for (int i = 2; i < s.length(); i++) {
            if (!s.substring(n, i).equals(guessed.substring(n, i))) {
                s.replace(s.substring(n, i), "_");
            }
            n++;
        }
        return s;

        /*
        char[] sss = new char[s.length()];
        char[] sw = new char[guessed.length()];

        // Die Zeichen des Strings s1 werden im Array zeichen1 gespeichert
        for (int i = 0; i < sss.length; i++) {
            sss[i] = s.charAt(i);// Speicherung an der Stelle i
        }

        // Die Zeichen des Strings s2 werden im Array zeichen2 gespeichert
        for (int i = 0; i < sw.length; i++) {
            sw[i] = guessed.charAt(i);// Speichern an der Stelle i
        }

        for (int i = 0; i < sss.length; i++) {
            if (sss[i] == ' ') continue;
            for (char c : sw) {
                if (sss[i] != c) {
                    sss[i] = '_';
                }
            }
        }

        // String m = Arrays.toString(sss);
        String z = Arrays.toString(sss);
        String[] qq = new String[z.length()];
        for (int i = 0; i < z.length(); i++) {
            qq[i] = String.valueOf(z.charAt(i));
        }

        List<String> list = new ArrayList<>(Arrays.asList(qq));
        String s1 = "";
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(",") && !list.get(i).equals("[") && !list.get(i).equals("]")) s1 += list.get(i);
        }

         */
        //return s1;

    }

    public static Predicate<Integer> isPrim = p -> p % 2 == 0 ? true : false;

    // public static Function<Integer, List<Integer>> primes = p ->
    //       IntStream.range(0, p).sequential()
    //             .filter(i -> !(i % 2 == 0) && (i % i == 0));

    public static BiFunction<List<?>, Integer, String> columnize =
            (values, rows) -> "to be done";
}




/*
        IntStream.range(0, array.length)
        .mapToObj(index -> String.format("%d -> %s", index, array[index]))
        .forEach(System.out::println);

 */


