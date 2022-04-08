package test;

import static java.lang.Math.sqrt;

public class Gleichunge {

    public static String pqFormel(double x, double losezahl) {

        double x1, x2;
        var sqrt2 = sqrt((Math.pow(x, 2) / 4) - (losezahl));
        x1 = -(x / 2) + sqrt2;
        x2 = -(x / 2) - sqrt2;
        return "x1 = " + x1 + " x2 = " + x2;
    }

    public static boolean hornerSchema(double gedachteZahl, double x4, double x3, double x2, double x, double losezahl) {

        double n = x4 * gedachteZahl;
        x3 += n;
        x2 += x3 * gedachteZahl;
        x += x2 * gedachteZahl;
        losezahl += x * gedachteZahl;
        Double[] s = new Double[]{x4, x3, x2, x};
        if (losezahl == 0) {

            System.out.println(x4 + "x^3 " + x3 + "x^2 " + x2 + "x " + x + " = 0");
            String m = hornerSchema2(2, x4, x3, x2, x);

            if (m == "true3") {
                System.out.println("Rictig hornerSchema");
                return true;
            } else {
                System.out.println("Falsch hornerSchema");
            }
        } else {
            System.out.println("Falsch");
        }
        return false;
    }


    public static String hornerSchema2(double gedachteZahl, double x3, double x2, double x, double losezahl) {

        x2 += x3 * gedachteZahl;
        x += x2 * gedachteZahl;
        losezahl += x * gedachteZahl;
        if (losezahl == 0) {
            System.out.println(pqFormel(x2, x));
            return "true3";
        } else {
            return "falsch4";
        }

    }

    public static void main(String[] args) {
        System.out.println(pqFormel(4, 4));
        System.out.println(" ");
        boolean m = hornerSchema(1, 1, 2, -7, -8, 12);

    }
}

