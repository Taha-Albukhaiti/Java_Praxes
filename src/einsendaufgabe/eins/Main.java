package einsendaufgabe.eins;

public class Main {
    public static double summieren(int n) {
        int k = 0;
        if (n == k) return 1;
        return (double) (1 / Math.pow(2, n) + summieren(--n));
    }

    public static void main(String[] args) {
        System.out.println(summieren(60));
    }
}
