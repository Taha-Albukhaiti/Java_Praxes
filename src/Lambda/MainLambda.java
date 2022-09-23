package Lambda;

import java.util.function.*;

public class MainLambda {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello! ";
        String s = supplier.get();
        System.out.println(s);
        Function<Integer, Integer> function = i -> i * 2;
        int ss = function.apply(3);
        System.out.println(ss);
        Consumer<String> customer = is -> System.out.println("Hallo " + is + "!");
        customer.accept("Taha");
        Predicate<String> predicate = s1 -> s1.equals("Mai");
        System.out.println(predicate.test("Mai"));
        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x * y + 2;
        System.out.println(biFunction.apply(2, 3));

    }

}
