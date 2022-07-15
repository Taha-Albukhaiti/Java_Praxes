package trainig;

//import org.apache.commons.lang3.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alles {

    /*
     * --- 1 ---
     */
    public static String hello(String name) {
        name = name.trim();
        name = "Hello " + name + "!";
        return name;
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
     * @param prim
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
     * @param args
     */
    public static List<Integer> primsUntil(int number){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= number; i++){
            if(isPrim(i)){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
/*

        String greet = hello("Max");
        System.out.println(greet); // => "Hello Max!"
        System.out.println(hello("Moritz")); // => "Hello Moritz!"

        // Achten sie auf die Leerzeichen
        System.out.println(hello("Maren ")); // => "Hello Maren!"
        System.out.println(hello(" Tessa")); // => "Hello Tessa!"
        System.out.println(hello("")); // => "Hello!" }

        String result = endUp("Hello");
        System.out.println(result); // => "HeLLO"
        System.out.println(endUp("Hi there")); // => "Hi thERE"
        System.out.println(endUp("hi")); // => "HI"
        System.out.println("");

        String result1 = stringX("xxHix");
        System.out.println(result1); // => xHix
        System.out.println(stringX("abxxxcd")); // => abcd
        System.out.println(stringXx("xabxxxcdx")); // => xabcdx

        boolean result2 = stringE("Earth");
        System.out.println(result2); // => true
        System.out.println(stringE("Nonsense")); // => true
        System.out.println(stringE("This is nuts")); // => false
        System.out.println(stringE("This example contains nonsense")); // => false

        String result3 = makeTags("em", " Yay ");
        System.out.println(result3); // => "<em>Yay</em>"
        System.out.println(makeTags("CITE ", "Programmieren lernt man nur durch programmieren."));
        // => "<cite>Programmieren lernt man nur durch programmieren.</cite>"
        System.out.println(makeTags("", "No tags")); // => No tags
        System.out.println();
        boolean result4 = lastDigit(21, 12);
        System.out.println(result4); // => false
        System.out.println(lastDigit(121, 2001)); // => true
        System.out.println(lastDigit(31111, 2001));
        System.out.println();

        boolean result5 = isArmstrong(153);
        System.out.println(result5); // => true
        System.out.println(isArmstrong(999)); // => false
        System.out.println();

        int n = countArmstrongs(100);
        System.out.println(n); // => 10
        System.out.println(countArmstrongs(153)); // => 11
        System.out.println(countArmstrongs(1000)); // => 14

        int result6 = rotate(2, "Hello");
        System.out.println(result6); // => "loHel"
        System.out.println(rotate(3, "Hello")); // => "lloHe"
        System.out.println(rotate(6, "Hello")); // => "oHell"

        boolean result7 = noTripples("Hello World");
        System.out.println(result7); // => true
        System.out.println(noTripples("faaantastic")); // => false
        System.out.println(noTripples(2, "Hello World")); // => false

        int result8 = luckySum(1, 2, 3, 13, 4, 5, 6);
        System.out.println(result8); // => 6
        System.out.println(luckySum(1, 2, 3, 4)); // => 10

        boolean result9 = dividesSelf(128);
        System.out.println(result9); // => true
        System.out.println(dividesSelf(12)); // => true
        System.out.println(dividesSelf(102)); // => false
        int n1 = countDividesSelf(10);
        System.out.println(n1); // => 9
        System.out.println(countDividesSelf(100)); // => 23
        System.out.println(countDividesSelf(1000)); // => 79

        System.out.println(); // => 1
        System.out.println(countOccurences("Hello", "Hello World")); // => 1
        System.out.println(countOccurences("abc", "abc abc abc")); // => 3
        System.out.println(countOccurences("xx", "xxx")); // => 2
        System.out.println(countOccurences("aa", "aaaa")); // => 3
        System.out.println("Test");

        String result10 = everyNth("Miracle", 2);
        System.out.println(result10); // => "Mrce"
        System.out.println(everyNth("abcdefg", 2)); // => "aceg"
        System.out.println(everyNth("abcdefg", 3)); // => "adg"
        System.out.println(everyNth("Todsakdnhpuda", 4)); // => "adg"
        String pwd = pwdgen("Dies ist nur ein doofes Beispiel");
        System.out.println(pwd); // => "6Dtnndl"
        System.out.println(pwdgen("a b c")); // => 3abc

        boolean result11 = sameStarChar("xy*yzz");
        System.out.println(result11); // => true
        System.out.println(sameStarChar("xy*zzz")); // => false
        System.out.println(sameStarChar("*xa*az")); // => false

        boolean check = checkBrackets("()");
        System.out.println(check); // => true
        System.out.println(checkBrackets("(()(a)(()((c))))")); // => true
        System.out.println(checkBrackets("(()()")); // => false
        System.out.println(checkBrackets("(()")); // => false
        System.out.println(checkBrackets("a (()())a)")); // => false

        String result12 = starOut("ab*cd");
        System.out.println(result12); // => "ad"
        System.out.println(starOut("ab**cd")); // => "ad"
        System.out.println(starOut("sm*eilly")); // => "silly"
        System.out.println(starOut("sm****eilly")); // => "silly"

        int[] d1 = {1, 3, 4};
        boolean increasing = scoresIncreasing(d1);
        System.out.println(increasing); // => true
        int[] d2 = {1, 3, 2};
        System.out.println(scoresIncreasing(d2)); // => false
        int[] d3 = {1, 1, 4, 3};
        System.out.println(scoresIncreasing(d3)); // => false
        int[] d4 = {1};
        System.out.println(scoresIncreasing(d4)); // => true

        List<Integer> result13 = evenOdd(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(result13); // => [2, 4, 6, 1, 3, 5]
        System.out.println(evenOdd(Arrays.asList(5, 1, 3))); // => [5, 1, 3]
        System.out.println(evenOdd(Arrays.asList(4, 2, 6))); // => [4, 2, 6]
*/

        boolean prim = isPrim(7);
        System.out.println(prim); // => true
        System.out.println(isPrim(8)); // => false
        System.out.println(isPrim(13)); // => true

        List<Integer> prims = primsUntil(20);
        System.out.println(prims); // => [2, 3, 5, 7, 11, 13, 17, 19]
    }
}