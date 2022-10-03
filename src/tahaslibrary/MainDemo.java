package tahaslibrary;

import java.util.List;

import static tahaslibrary._Lambdas.*;

public class MainDemo {
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
        s

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
        /*

        boolean prim = isPrim(7);
        System.out.println(prim); // => true
        System.out.println(isPrim(8)); // => false
        System.out.println(isPrim(13)); // => true
        List<Integer> prims;
        prims = primsUntil(20);
        System.out.println(prims); // => [2, 3, 5, 7, 11, 13, 17, 19]

        String output = columnize(prims, 3);
        System.out.println(output);
        //2 3 5
        //7 11 13
        //17 19
        // Entspricht der Zeichenkette: "2\t3\t5\n7\t11\t13\n17\t19"
        prims = primsUntil(40);
        System.out.println(columnize(prims, 5));

        List<Integer> lance = armstrongs(500);
        System.out.println(lance);
        // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407]

        // Map<Integer, List<Integer>> grouped = groupByLength(lance); System.out.println(grouped);
        // {1=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9], 3=[153, 370, 371, 407]}


        int[] a1 = {1, 9, 4, 5, 6, 2, 1, 3};
        int[] a2 = {6, 2, 3, 4};
        int[] a3 = {1, 2, 4};
        int[] a4 = {3, 2, 1};
        System.out.println(trippleUp(a1)); // => true
        System.out.println(trippleUp(a2)); // => true
        System.out.println(trippleUp(a3)); // => false
        System.out.println(trippleUp(a4)); // => false


        int[] arr = {4, 3, 6, 2, 9, 4};
        System.out.println(minimum(arr));
        System.out.println(maximum(arr));


        Map<String, String> order1 = new TreeMap<>();
        order1.put("ice cream", "cherry");
        Map<String, String> order2 = new TreeMap<>();
        order2.put("spinach", "dirt");
        order2.put("ice cream", "cherry");
        Map<String, String> order3 = new TreeMap<>();
        order3.put("yoghurt", "salt");
        System.out.println(topping(order1));// => { "ice cream"="cherry", "yoghurt"="cherry" }
        // System.out.println(order1);         // => { "ice cream"="cherry" }
        System.out.println(topping(order2));// => { "ice cream"="cherry", "yoghurt"="cherry" }
        // System.out.println(order2);         // => { "spinach"="dirt", "ice cream"="cherry" }
        System.out.println(topping(order3));// => { "yoghurt"="salt" }
        // System.out.println(order3);         // => { "yoghurt"="salt" }



        Map<String, Integer> result = wordCount("aa BB cC Aa Cc Bb aA AA");
        System.out.println(result);
        // => { "aa": 4, "bb": 2, "cc": 2 }
        System.out.println(wordCount("Ein kleines Beispiel"));
        // => { "ein": 1, "kleines": 1, "beispiel": 1 }



        List<String> example = Arrays.asList("a", "b", "a");
        String results = wordAppend(example);
        System.out.println(results); // -> "a"
        System.out.println(wordAppend(Arrays.asList("a", "b", "a", "c", "a", "d", "a"))); // -> "aa"
        System.out.println(wordAppend(Arrays.asList("a", "", "a"))); // -> "a"
        System.out.println(wordAppend(Arrays.asList("", "a", "a", "b", "a", "a", "a"))); // -> "a"

        // Aufruf von readFrom()

        File f = new File("lorem.txt");

        String content = readFrom(f);
        String lorem = content.substring(0, 21);
        System.out.println(lorem);// => Lorem ipsum dolor sit
        // Rückgabe von readFrom() im Fehlerfall
        System.out.println(readFrom(new File("gibtesnicht.txt"))); // => null
        // Default-Aufruf von countChars()
        Map<Character, Integer> occurences = countChars(lorem);
        System.out.println(occurences);
        // => {d=1, e=1, i=2, l=2, m=2, o=3, p=1, r=2, s=2, t=1, u=1}
        // Aufruf von countChars() mit vorgegebenen Zeichen
        System.out.println(countChars(lorem, "AeIoU")); // => {e=1, i=2, o=3, u=1}

        String result = allStarRekursion("Hello");
        System.out.println(result); // => H*e*l*l*o
        System.out.println(allStarRekursion("abc")); // => a*b*c
        System.out.println(allStarRekursion("ab")); // => a*b
        System.out.println(allStarRekursion("ab", '-')); // => a-b


        System.out.println(cleanString("yyzzza")); // => yza
        System.out.println(cleanString("aabbbcdd")); // => abcd
        System.out.println(cleanString("Hello")); // => Helo

        List<Integer> values = Arrays.asList(1, 2, 3);
        String operation = join(values, "+");
        System.out.println(operation); // => 1+2+3
        int sum = sumRekursiv(values);
        System.out.println(operation + "=" + sum); // => 1+2+3=6

        int n = countSubstring("Hello World", "Hello");
        System.out.println(n); // => 1
        System.out.println(countSubstring("Hello World", "l")); // => 3
        System.out.println(countSubstring("xxx", "xx")); // => 2

        int sum1 = sumDigits(123);
        System.out.println(sum1); // => 6
        System.out.println(sumDigits(99996)); // => 42
        System.out.println(sumDigits(-123)); // => -6

        List<String> examples = Arrays.asList(
                "Dies", "ist", "nur", "ein", "Beispiel"
        );
        List<String> result = without.apply(examples, "nur");
        System.out.println(result); // => ["Dies", "ist", "ein", "Beispiel"] }


        List<_Student> students = Arrays.asList(
                new _Student("Ali", 2.3),
                new _Student("Taha", 2.1),
                new _Student("Qusai", 2.1),
                new _Student("Lara", 1.3),
                new _Student("Ahmad", 1.2)
        );

        double averageNote = students.stream().
                mapToDouble(_Student::getNote).average().orElse(-1);
        System.out.println(averageNote);
         */

        int result2 = nthDigit.apply(4321, 0);
        System.out.println(result2); // => 3
        System.out.println(nthDigit.apply(4321, 5)); // => null

        String result22 = blank.apply("aello World", "aell");
        System.out.println(result22); // => _ell_ ___l_
        System.out.println(blank.apply("abc def ghj", "a")); // => a__ ___ ___

        String resultl = blank2.apply("Hello World", "ell");
        System.out.println(resultl); // => _ell_ ___l_
        System.out.println(blank2.apply("abc def ghj", "a")); // => a__ ___ ___

        System.out.println(isPrim.test(4)); // => false
        System.out.println(isPrim.test(7)); // => true

        List<Integer> result12 = primes.apply(20);
        System.out.println(result12); // => [2, 3, 5, 7, 11, 13, 17, 19]
        System.out.println(primes.apply(3)); // => [2]
        String output = columnize.apply(result12, 3);
        System.out.println(output);
        //2 3 5
        //7 11 13
        //17 19

    }
}
