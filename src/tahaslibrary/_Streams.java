package tahaslibrary;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.util.List;
import java.util.*;
import java.util.function.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _Streams {
    public static void main(String[] args) {

        List<String> examples = Arrays.asList(
                "Dies", "ist", "nur", "ein", "Beispiel"
        );
        examples.stream().
                filter(e -> !e.equals("nur")).
                filter(x -> x.length() > 3).
                toList().
                forEach(System.out::println);
        System.out.println();

        examples.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });
        for (String str : examples) {
            System.out.println(str);
        }
        System.out.println();

        examples.replaceAll(String::toUpperCase);
        examples.forEach(System.out::println);
        System.out.println();

        examples.replaceAll(String::toUpperCase);
        examples.forEach(System.out::println);


        IntStream.rangeClosed(1, 100).limit(4).map(x -> x * x).forEach(System.out::println);
        IntStream.rangeClosed(1, 100).limit(4).map(new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand * operand;
            }
        }).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println(value);
            }
        });

        Predicate<Character> isDigit = Character::isDigit;
        List<Character> list = new ArrayList<>(Arrays.asList('1', 'a'));
        list.removeIf(isDigit);
        list.forEach(System.out::println);


        List<String> list2 = new ArrayList<>(Arrays.asList("2", "L", " ", ""));
        list2.removeIf(Pattern.compile("\\d+").asPredicate().or(String::isEmpty).or(s -> s.equals(" ")));
        System.out.println(list2);

        List<Package> packageList = Arrays.asList(Package.getPackages());
        packageList.sort(Comparator.comparing(Package::getName));
        System.out.println(packageList.size());

        Map<String, Integer> map = new HashMap<>();
        map.put("Manila", 25);
        map.put("Leipzig", -5);
        map.forEach((s, i) -> System.out.printf("%s hat %d Grad%n", s, i));

        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1, "tAHa");
        integerStringMap.put(2, "Ali");
        BiFunction<Integer, String, String> stringStringBiFunction = (i, s) -> s.toUpperCase();
        integerStringMap.replaceAll(stringStringBiFunction);
        System.out.println(integerStringMap);
        getPowerOfTwoStream().forEach(System.out::println);

        Runnable runnable = System.out::println;
        ActionListener listener = ActionEvent::getActionCommand;
        Supplier<String> supplier = () -> "Hello Welt! ";
        Consumer<Point> consumer = s -> System.out.println("1" + s + "2");
        Comparator<_Student> comparator = (s, a) -> (int) (s.getNote() - a.getNote());
        consumer.accept(new Point());
        System.out.println(comparator.compare(new _Student("Max", 3.3), new _Student("Taha", 1.0)));

        List<Integer> integerList = new ArrayList<>(Arrays.asList(2, 3, 4));
        System.out.println(doubling(integerList));

        List<String> integerList1 = new ArrayList<>(Arrays.asList("xaa", "nzym", "axadxx"));
        System.out.println(noYY(integerList1));
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 4));
        System.out.println(two2(nums));

    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.get("a").length() > map.get("b").length()) {
            map.put("c", map.get("a"));
        } else if (map.get("a").length() < map.get("b").length()) {
            map.put("c", map.get("b"));
        }
        return map;
    }


    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(n -> (int) Math.pow(n, 2) + 10)
                .filter(n -> Integer.toString(n).charAt(Integer.toString(n).length() - 1) != '5' & Integer.toString(n).charAt(Integer.toString(n).length() - 1) != '6')
                .collect(Collectors.toList());
    }


    public static List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(s -> s * 2)
                .filter(s -> Boolean.parseBoolean(String.valueOf(!s.toString().endsWith(String.valueOf(2))))).collect(Collectors.toList());
    }


    public static List<String> noYY(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.endsWith("y") & !s.contains("yy"))
                .map(s -> s + "y")
                .collect(Collectors.toList());
    }


    public static List<String> noZ(List<String> strings) {
        return strings.stream().filter(s -> !s.contains("z")).collect(Collectors.toList());

    }

    public static List<String> noX(List<String> strings) {
        return strings.stream().map(s -> s.replaceAll("x", "")).collect(Collectors.toList());
    }


    public List<String> copies3(List<String> strings) {
        return strings.stream().map(s -> s + s + s).toList();
    }


    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(s -> s * s).collect(Collectors.toList());
    }

    public static Stream<BigInteger> getPowerOfTwoStream() {
        return Stream.iterate(1, n -> n + 1).limit(6).map(n -> BigInteger.TWO.pow(n));
    }

    public OptionalInt maxSpan(int[] nums) {
        return IntStream.of(nums)
                .max();
    }

}
