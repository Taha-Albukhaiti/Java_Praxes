package tahaslibrary;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class _LambdaUebung {
    public static void main(String[] args) {
        // Eine Funktion, die einen String-Wert erhält und auf einen Double-Wert abbildet
        Function<String, Double> stringToDouble = Double::parseDouble;
        System.out.println(stringToDouble.apply("3.1"));
        // Eine Funktion, die einen Double-Wert x auf x3 + 2x abbildet.
        Function<Double, Double> doubleDoubleFunction = x -> x * x * x + x * 2;
        System.out.println(doubleDoubleFunction.apply(2.0));
        // Eine Funktion, die einen Integer-Wert Anzahl erhält und Anzahl oft „Ich mag Java!“ Auf
        // der Konsole ausgibt.
        Consumer<Integer> consumer = n -> {
            for (int i = 0; i < n; i++) {
                System.out.println("Ich mag Java!");
            }
        };
        consumer.accept(5);
        // Eine Funktion bildet n auf eine zufällige gerade Zahl von 0 bis n ab.
        Function<Integer, Integer> integerIntegerFunction = n -> new Random().nextInt(n + 1);
        System.out.println(integerIntegerFunction.apply(5));
        //Eine parameterlose Funktion, die ein zufälliges EU-Land als String zurückgibt
        Supplier<Laender> laenderSupplier = () ->
                Laender.values()[new Random().nextInt(Laender.values().length)];
        System.out.println(laenderSupplier.get());
        //Eine Funktion, die prüft, ob es sich bei einer gegeben Integer-Zahl um eine Quadratzahl
        //handelt.
        Predicate<Integer> integerPredicate =
                i -> i == (int) Math.sqrt(i) * (int) Math.sqrt(i);
        System.out.println(integerPredicate.test(4));
    }
}
