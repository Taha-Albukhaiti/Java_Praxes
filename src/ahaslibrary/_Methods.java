package ahaslibrary;

//import org.apache.commons.lang3.*;

import java.util.*;
import java.util.stream.Stream;

public class _Methods {

    /*
     * --- 1 ---
     */
    public static String hello(String name) {
        return "Hello " + name.trim() + "!";
    }

    /*
     * --- 2 ---
     */
    public static String endUp(String s) {
        String m;
        if (s.length() >= 3) {
            m = s.substring(s.length() - 3, s.length());
            return s.substring(0, s.length() - 3) + m.toUpperCase();
        } else m = s.toUpperCase();
        return m;
    }

    /*
     * public String endUp(String str) { //Correct
     *
     * if (str.length()>=3){ StringBuilder sb = new StringBuilder(str); String Ustr
     * = sb.substring(str.length()-3,str.length()); return
     * sb.substring(0,str.length()-3)+Ustr.toUpperCase(); }else return
     * str.toUpperCase(); }
     */

    /*
     * --- 3 ---
     */
    public static String stringX(String s) {
        String result = "";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char temp = s.charAt(i);
            if (!(i > 0 && i < len - 1 && temp == 'x'))
                result = result + temp;
        }
        return result;
    }

    public static String stringXx(String str) {
        if (str.length() <= 2) return str;
        char start = str.charAt(0);
        char end = str.charAt(str.length() - 1);
        str = str.substring(1, str.length() - 1).replace("x", "");
        return start + str + end;
    }

    /*
     * Schreiben Sie eine Methode stringE(), die prüft, ob eine beliebige
     * Zeichenkette mindestens ein aber maximal drei 'E' beinhaltet. Die Prüfung
     * soll case-insensitiv erfolgen.
     */
    public static boolean stringE(String s) {
        for (int i = 0; i < s.length(); i++) {
            if ("eE".indexOf(s.charAt(i)) >= 1) {
                return true;
            }
        }
        return false;
    }

    public static String makeTags(String tag, String content) {
        return "<" + tag.toLowerCase().trim() + ">" + content.trim() + "<" + tag.toLowerCase().trim() + "/>";
    }

    public static boolean lastDigit(int a, int b) {
        int modA = a % 10;
        int modB = b % 10;
        if (modA == modB) return true;
        else return false;
    }

    public static boolean isArmstrong(int x) {
        int number = x, originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if (result == number) {
            return true;
        } else {
            return false;
        }
    }

    public static int countArmstrongs(int n) {
        return -1;
    }

    // Hello 2
    public static int rotate(int input2, String input1) {
        int count = 0;
        try {

            String arr[] = input1.split(" ");
            if (input1 != null && !input1.isEmpty()) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("Orginal Word :" + arr[i]);
                    int start = arr[i].length() - input2;
                    String s1 = arr[i].substring(start);
                    // System.out.println("s1 : " + s1);
                    String s2 = arr[i].substring(0, start);
                    // System.out.println("s2 : " + s2);
                    System.out.println("New Word : " + s1 + s2);
                    if ((s1 + s2).equals(arr[i])) {
                        count++;
                    }
                }
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return count;
    }

    public static boolean noTripples(int n, String s) {
        return true;
    }

    public static boolean noTripples(String s) {
        String[] arry = s.split("(?!^)");
        System.out.println(Arrays.toString(arry));
        for (int i = 0; i < arry.length - 1; i++) {
            if (arry[i] == arry[i + 1] && arry[i + 1] == arry[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public static int luckySum(int... values) {
        int sum = 0;
        // loop over all values
        for (int x = 0; x < values.length; x++) {
            // in the case 13 is found break out of the loop
            if (values[x] == 13) {
                break;
                // As a second option you could just return sum here
                // return sum;
            }
            // add value to the sum
            sum += values[x];
        }
        return sum;
    }

    /**
     * die prüft, ob eine Zahl selbstteilend ist. Eine Zahl ist selbstteilend, wenn
     * alle ihre Stellen die Zahl ganzzahlig teilt.
     *
     * @param x
     * @return
     */
    public static boolean dividesSelf(int x) {
        for (int val = x; val != 0; val /= 10) {
            int digit = val % 10;
            if (digit == 0 || x % digit != 0) return false;
        }

        return true;
    }

    /**
     * Gibt an, wieviele sich selbstteilende Zahlen es ab 0 bis zu einer oberen
     * Schranke gibt.
     *
     * @param x
     * @return
     */
    public static int countDividesSelf(int x) {
        int s;
        for (int val = x; val != 0; val /= 10) {
            int digit = val % 10;
            if (digit == 0 || x % digit != 0) ;
        }
        return 1;
    }

    /**
     * ie zählt, wie häufig eine Zeichenkette a in einer anderen Zeichenkette b
     * vorkommt. Sich überlagernde Zeichenketten sind erlaubt. D.h. “xx” ist als
     * zweimal in “xxx” vorhanden zu zählen. Leere Zeichenketten sind nicht zu
     * zählen.
     *
     * @param
     * @param
     * @return
     */
    public static int countOccurences(String findStr, String str) {
        // System.out.println(StringUtils.countMatches(b, a));

        //return (str.length() - str.replaceAll(Pattern.quote(findStr), "").length());

        int count = 0, fromIndex = 0;

        while ((fromIndex = str.indexOf(findStr, fromIndex)) != -1) {
            //   System.out.println("Found at index: " + fromIndex);
            count++;
            fromIndex++;
        }

        // System.out.println("Total occurrences: " + count);
        return count;




        /*
        if (a.equals(b)) return 1;

        int counter = 0;
        int n = 0;
        int m = b.length();
        for (int i = 0; i < b.length(); i++) {
            System.out.println("test1");
            String s = b.substring(n, b.length());
            String s2 = b.substring(0, m);
            if (a.equals(s)) {
                counter++;
            }
            if (a.equals(s2)) {
                counter++;
            }
            n++;
            m--;
        }

         */
  /*
        String strTest = null;
        String[] str = b.split("");
        int counter = 0;
        int s = 0;

        for (int j = 0; j < str.length; j++) {
            System.out.println("test1");
            for (int i = s; i < str.length - 1; i++) {
                strTest = str[i];
                System.out.println("test2");
            }
            s++;
            if (a == strTest) {
                System.out.println("test3");
                counter++;
            }
        }
        */
    }
    /*
    Entwickeln Sie nun bitte eine Methode everyNth(), die für eine Zeichenkette 𝑠 nur jedes n.te Zeichen zurück liefert. Bei 𝑛 = 3 sollen also nur die Zeichen 0, 3, 6, ... und so weiter zurückgegeben werden. Fuer 𝑛 <= 0 soll die leere Zeichenkette zurückgegeben werden.
    Aufrufbeispiele finden Sie in der main()-Methode. Hinweis:
•   Achtung: Diese Aufgabe ist anfällig für Endlosschleifen.
     */

    public static String everyNth(String s, int n) {
        char[] str = s.toCharArray();
        String str2 = "";
        for (int i = 0; i < str.length; ) {
            str2 += str[i];
            i += n;
        }
        return str2;
    }

    /*Schreiben Sie nun bitte eine Methode pwdgen() zum Generieren von Passwörtern.
    • Passwörter sollen dabei aus einem Satz gebildet werden.
    • Worte in dem Satz sind durch ein oder mehrere Leerzeichen voneinander getrennt.
    • Für jedes Wort soll abwechselnd der erste oder letzte Buchstabe des Wortes genommen werden. • Die Anzahl an Worten soll an den Anfang des Passworts gesetzt werden.
     Aufrufbeispiele finden Sie in der main()-Methode. Hinweise:
    • Die String-Methode split() ist sicher hilfreich.
    • Beachten Sie, dass Sätze mit Leerzeichen beginnen oder enden können.
     */
    public static String pwdgen(String s) {
        String pwd = "";
        boolean front = true;
        for (String w : s.trim().split(" +")) {
            if (w.isEmpty()) continue;
            pwd += front ? w.charAt(0) : w.charAt(w.length() - 1);
            front = !front;
        }
        return pwd.length() + pwd;
    }

    /*
    Entwickeln Sie nun bitte eine Methode sameStarChar(), die für eine Zeichenkette prüft, ob bei allen
    ’*’ Zeichen, das jeweils linke und rechte gleich sind.
     */
    public static boolean sameStarChar(String s) {
        int i = 1;
        while (i < s.length() - 1) {
            if (s.charAt(i) == '*' && s.indexOf("*") == 0) {
                return false;
            } else if (s.charAt(i) == '*' && !(s.charAt(i - 1) == s.charAt(i + 1))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /*
     Eine vollständige Klammerung bedeutet: Jeder geöffneten Klammer muss eine schließende Klammer folgen.
      Darüber hinaus müssen die runden Klammern korrekt verschachtelt sein. Andere Zeichen sind zu ignorieren.
     */
    public static boolean checkBrackets(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count += 1;
            } else if (str.charAt(i) == ')') {
                count -= 1;
            }
        }
        if (count == 0) return true;

        return false;
    }

    public static String starOut(String str) {

        String s = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != '*' && str.charAt(i + 1) != '*') {
                str = str.substring(0, i - 1) + str.substring(i + 2);
            } else if (str.charAt(i) == '*' && str.charAt(i - 1) == '*') {
                str = str.substring(0, i - 2) + str.substring(i + 2);
            } else if (str.charAt(i) == '*' && str.charAt(i + 1) == '*') {
                str = str.substring(0, i - 1) + str.substring(i + 3);
            }
        }
        return str;
         /*
        int len = str.length();
        String finalString = "";

        for (int i = 0; i < len; i++) {
            if (i == 0 && str.charAt(i) != '*')
                finalString += str.charAt(i);

            if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*')
                finalString += str.charAt(i);

            if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*')
                finalString = finalString.substring(0, finalString.length() - 1);
        }
        return finalString;
        */
    }

    /**
     * prüfen, ob Array aufsteigend sortiert ist
     *
     * @param arr
     */
    public static boolean scoresIncreasing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) return false;
            }
        }
        return true;
    }

    /**
     * List zurückgeben, bei der zuerst gerade und dann ungerade Zahlen stehen
     *
     * @param list
     */
    public static List<Integer> evenOdd(List<Integer> list) {
        List<Integer> neueListe = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                neueListe.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                neueListe.add(list.get(i));
            }
        }
        return neueListe;
    }

    /**
     * Prüft, ob eine gegebene Zahl eine Primzahl ist.
     *
     * @param number
     */
    public static boolean isPrim(int number) {
        if (!(number % 2 == 0) && number != 1) {
            return true;
        }
        return false;
    }

    /**
     * rzeugt eine Liste aller aufsteigen sortierten Primzahlen bis zu einer oberen Schran-
     * ke.
     *
     * @param number
     */
    public static List<Integer> primsUntil(int number) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= number; i++) {
            if (isPrim(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static String columnize(List<Integer> list, int n) {
        String text = "";
        int s = n - 1;
        for (int i = 0; i < list.size(); i++) {
            text += list.get(i) + "\t";
            if (i == s) {
                text += "\n";
                s += n;
            }
        }
        return text;
    }

    public static List<Integer> armstrongs(int number) {
        return null;

    }

    /**
     * Return true if the array contains, somewhere, three increasing adjacent
     * numbers like .... 4, 5, 6, ... or 23, 24, 25.
     */

    public static boolean trippleUp(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] + 1 == array[i + 1] && array[i + 1] + 1 == array[i + 2]) {
                return true;
            }
        }
        return false;
    }

    public static int minimum(int[] list) {
        int merk = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < merk) {
                merk = list[i];
            }
        }
        return merk;
    }

    public static int maximum(int[] list) {
        int merk = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > merk) {
                merk = list[i];
            }
        }
        return merk;
    }

    /**
     * Sie sollen nun einen Methode topping() schreiben, die für einen Bringdienst ein paar Bereinigungen auf Bestellungen vornimmt.
     * Bestellungen werden als Map codiert.
     * • TauchtinderBestellung"icecream"auf,sollderselbeWertauchfür"yoghurt"gesetztwerden.
     * • TauchtinderBestellung"spinach"auf,solldieserEintraggelöschtwerden(niemandmagSpinat).
     * topping() soll die ursprüngliche Bestellung nicht modifizieren, sondern eine neue modifizierte Bestel-
     * lung erzeugen.
     *
     * @param map
     * @return
     */
    public static Map<String, String> topping(Map map) {
        Map<String, String> newMap = new TreeMap<>();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            if (me.getKey().equals("ice cream")) {
                newMap.put((String) me.getKey(), (String) me.getValue());
                newMap.put("yoghurt", (String) me.getValue());
            } else if (me.equals("spinach")) {
                newMap.remove("spinach");
            } else {
                newMap.put((String) me.getKey(), (String) me.getValue());
            }
        }
        return newMap;
    }

    /**
     * @param str
     */
    public static Map<String, Integer> wordCount(String str) {
        Map<String, Integer> hashMap = new HashMap<>();
        String[] words = str.toLowerCase().split("\\s");
        for (String word : words) {
            // Asking whether the HashMap contains the
            // key or not. Will return null if not.
            Integer integer = hashMap.get(word);
            if (integer == null) {
                // Storing the word as key and its
                // occurrence as value in the HashMap.
                hashMap.put(word, 1);
            } else {
                // Incrementing the value if the word
                // is already present in the HashMap.
                hashMap.put(word, integer + 1);
            }
        }
        return hashMap;
    }

    /**
     * Entwickeln Sie nun bitte eine Methode wordAppend(). Diese soll eine Liste von Strings durchlaufen, um
     * einen Ausgabestring zu erzeugen. Gehen Sie dabei wie folgt vor:
     * Immer wenn ein String zum 2., 4., 6., usw. mal in der Liste auftaucht,
     * soll der String an den Ausgabestring gehängt werden.
     * Wenn kein String doppelt vorkommt, soll die leere Zeichenkette zurückgegeben werden.
     */

    static String wordAppend(List<String> list) {
        String finalResult = null;
        Set<String> set = new HashSet<>(list);
        for (String r : set) {
            if (Collections.frequency(list, r) >= 2 && Collections.frequency(list, r) % 2 == 0) {
                int o = Collections.frequency(list, r);
                int q = o / 2;
                Optional<String> result1 = Stream.generate(() -> r).limit(q).reduce((a, b) -> a + b);
                if (result1.isPresent()) {
                    finalResult = result1.get();
                }
            }
        }
        if (finalResult == null) {
            return " ";
        }
        return finalResult;
    }

}