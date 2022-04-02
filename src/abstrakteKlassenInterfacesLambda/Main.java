package abstrakteKlassenInterfacesLambda;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public interface Ausgabe {
        void ausgeben(String name1);
    }

    public interface Berechnung {
        double berechne(double x, double y);
    }

    public static void main(String[] args) throws IOException {
        String[] words = {"          M        ", "\nSkyfall", " A"};

        Ausgabe m = (name1) -> System.out.println("Hallo " + name1);
        m.ausgeben("Taha");

        Berechnung b = (x, y) -> x > y ? x : y;
        double s = b.berechne(5, 4);
        System.out.println(s);
        /*
        () -> System.out.println("Hello World");
        (name, value) -> name + " = " + value;
        Runnable moin = () -> {
            System.out.println("Moin");
        };
        System.out.println(moin);

         */

      /*  class CompareTrimmedString implements Comparator<String> {
            @Override
            public int compare(String s1, String s2){
                return s1.trim().compareTo(s2.trim());
            }
        }*/
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.trim().compareTo(s2.trim());
            }
        });
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, (String s1, String s2) -> {
            return s1.trim().compareTo(s2.trim());
        });
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, (s1, s2) -> {
            return s1.trim().compareTo(s2.trim());
        });
        System.out.println(Arrays.toString(words));


    }

    private static void name(Object o) {
    }
}
