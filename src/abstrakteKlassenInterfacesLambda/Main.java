package abstrakteKlassenInterfacesLambda;

import java.io.BufferedReader;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] words = {"          M        ", "\nSkyfall", " A" };
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
}
