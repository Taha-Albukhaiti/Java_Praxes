package tahaslibrary;

import java.util.List;

public class _Rekursion {

    public static String allStarRekursion(String str) {
        if (str.length() <= 1) return str;
        return str.charAt(0) + "*" + allStarRekursion(str.substring(1));
    }

    public static String allStarRekursion(String str, char spi) {
        if (str.length() <= 1) return str;
        String s = Character.toString(spi);
        return str.charAt(0) + s + allStarRekursion(str.substring(1));
    }

    public static String cleanString(String str) {
        if (str.length() == 0) {
            return "";
        }
        var first = str.charAt(0);
        var count = str.chars().takeWhile(x -> x == first).count();
        return first + cleanString(str.substring((int) count));
    }

    public static String join(List list, String str) {
        if (list.size() < 1) {
            return "";
        }
        String s = list.get(0) + str + join(list.subList(1, list.size()), str);

        if (String.valueOf(s.charAt(s.length() - 1)).equals(str)) {
            s = s.replace(str, "");
        }
        return s;
    }

    public static int sumRekursiv(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        return list.get(0) + sumRekursiv(list.subList(1, list.size()));
    }

    public static int countSubstring(String str, String supString) {
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {
            lastIndex = str.indexOf(supString, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += supString.length();
            }
        }
        return count;
    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }
}

