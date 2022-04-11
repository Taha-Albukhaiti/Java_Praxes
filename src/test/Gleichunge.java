package test;

import static java.lang.Math.sqrt;

public class Gleichunge {

    static String pqFormel(double x, double losezahl) {

        double x1, x2;
        var sqrt2 = sqrt((Math.pow(x, 2) / 4) - (losezahl));
        x1 = -(x / 2) + sqrt2;
        x2 = -(x / 2) - sqrt2;
        return "x1 = " + x1 + " x2 = " + x2;
    }

    static String hornerSchemaI(double x4, double x3, double x2, double x, double losezahl) {

        int i = 0;
        while (i < 10) {
            x3 += x4 * i;
            x2 += x3 * i;
            x += x2 * i;
            losezahl += x * i;
            //Double[] s = new Double[]{x4, x3, x2, x};
            if (losezahl == 0) {
                String m = hornerSchemaII(i + 1, x4, x3, x2, x);
                return x4 + "x^3 " + x3 + "x^2 " + x2 + "x " + x + " = 0" + "\n" + m;
            } else
                i++;
        }
        return "false";
    }


    static String hornerSchemaII(double probierteZahl, double x3, double x2, double x, double losezahl) {
        x2 += x3 * probierteZahl;
        x += x2 * probierteZahl;
        losezahl += x * probierteZahl;
        if (losezahl == 0) {
            String pq = pqFormel(x2, x);
            return x3 + "x^2 " + x2 + "x " + x + " = 0" + "\n" + pq;
        } else
            return "falsch";
    }

    static String hornerSchemaIII(double x4, double x3, double x2, double x, double losezahl) {
        int i = 0;
        do {
            x3 += x4 * i;
            x2 += x3 * i;
            x += x2 * i;
            losezahl += x * i;
            //Double[] s = new Double[]{x4, x3, x2, x};
            System.out.println(x4 + x3 + x2 + x);
            if (losezahl == 0) {
                String m = hornerSchemaIV(x4, x3, x2, x);
                return x4 + "x^3 " + x3 + "x^2 " + x2 + "x " + x + " = 0" + "\n" + m;
            } else
                i++;
        }while (i < 10);
        return "false";
    }


    static String hornerSchemaIV(double x3, double x2, double x, double losezahl) {
        int j = 0;
        do {
            //System.out.println(j);
            x2 += x3 * j;
            x += x2 * j;
            losezahl += x * j;
          //  System.out.println(losezahl);
            if (losezahl == 0) {
                String pq = pqFormel(x2, x);
                return x3 + "x^2 " + x2 + "x " + x + " = 0" + "\n" + pq;
            } else {
                j++;
            }

        }while (j < 10);
        return "falsch";
    }


    public static void main(String[] args) {
        // System.out.println(pqFormel(4, 4));
        System.out.println(" ");
        String s = hornerSchemaI(1, 2, -7, -8, 12);
        System.out.println(s);

        System.out.println(" ");
        String m = hornerSchemaIII(1, 2, -7, -8, 12);
        System.out.println(m);

    }
}

