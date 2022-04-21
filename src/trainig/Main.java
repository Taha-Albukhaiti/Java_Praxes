package trainig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class Main {

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
     * die prüft, ob eine Zahl selbstteilend ist. Eine Zahl ist selbstteilend,
     * wenn alle ihre Stellen die Zahl ganzzahlig teilt.
     *
     * @param x
     * @return
     */
    public static boolean dividesSelf(int x) {
        for (int val = x; val != 0; val /= 10) {
            int digit = val % 10;
            if (digit == 0 || x % digit != 0)
                return false;
        }

        return true;
    }

    /**
     * Gibt an, wieviele sich selbstteilende Zahlen es ab 0 bis zu einer oberen Schranke gibt.
     *
     * @param x
     * @return
     */
    public static int countDividesSelf(int x) {
        int s;
        for (int val = x; val != 0; val /= 10) {
            int digit = val % 10;
            if (digit == 0 || x % digit != 0)
                ;
        }
        return 1;
    }

    /**
     * ie zählt, wie häufig eine Zeichenkette a in einer anderen Zeichenkette b vorkommt. Sich überlagernde
     * Zeichenketten sind erlaubt. D.h. “xx” ist als zweimal in “xxx” vorhanden zu zählen.
     * Leere Zeichenketten sind nicht zu zählen.
     *
     * @param a
     * @param b
     * @return
     */
    public static int countOccurences(String a, String b) {
        int temp = 0;

        char[] chars = a.toCharArray();
        while ( temp < chars.length ){
            for (int j = 0; j < b.length(); j++) {
                if (b.charAt(j) == chars[temp]) {
                    temp += 1;
                }
            }
        }



        return 1;
    }

    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        /*
         * --- 1 ---
         */
        String greet = hello("Max");
        System.out.println(greet); // => "Hello Max!"
        System.out.println(hello("Moritz")); // => "Hello Moritz!"

        // Achten sie auf die Leerzeichen
        System.out.println(hello("Maren ")); // => "Hello Maren!"
        System.out.println(hello(" Tessa")); // => "Hello Tessa!"
        System.out.println(hello("")); // => "Hello!" }

        /*
         * --- 2 ---
         */
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

    }
}