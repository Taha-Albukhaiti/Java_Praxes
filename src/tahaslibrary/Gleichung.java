package tahaslibrary;

public class Gleichung {
/*
    public static String pqFormel(double x, double losezahl) {
        double x1, x2;
        var sqrt2 = sqrt((Math.pow(x, 2) / 4) - (losezahl));
        x1 = -(x / 2) + sqrt2;
        x2 = -(x / 2) - sqrt2;
        return "x1 = " + x1 + " x2 = " + x2;
    }
/*
    public static Double[] hornerSchema(double x4, double x3, double x2, double x, double losezahl) {

        Double[] s = new Double[4];
        for (int i = -3; i < 4; i++) {
            double n = x4 * i;
            x3 += n;
            x2 += x3 * i;
            x += x2 * i;
            losezahl += x * i;

            if (losezahl == 0) {
                s = new Double[]{x4, x3, x2, x};
                System.out.println(x4 + "x^3 " + x3 + "x^2 " + x2 + "x " + x + " = 0");
              //  Double[] m = hornerSchema2(x4, x3, x2, x);
                    return s;

            } else {
                System.out.println("Falsch ");
                break;
            }
        }
        return s;
    }

        /*
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
            } else {
                System.out.println("Falsch hornerSchema");
            }
        } else {
            System.out.println("Falsch ");
        }
        return s;
        */

/*
    public static Double[] hornerSchema2(double x3, double x2, double x, double losezahl) {
        Double[] s = new Double[0];
        for (int i = -3; i < 3; i++) {
            x2 += x3 * i;
            x += x2 * i;
            losezahl += x * i;
            if (losezahl == 0) {
                System.out.println(pqFormel(x2, x));
                s = new Double[]{x3, x2, x};
                return s;
            } else
                System.out.println("falscg");
        }
        return s;
    }
        /*
        x2 += x3 * gedachteZahl;
        x += x2 * gedachteZahl;
        losezahl += x * gedachteZahl;
        if (losezahl == 0) {
            System.out.println(pqFormel(x2, x));
            return "true3";
        } else
            return "falsch4";

         */

/*
    public static void main(String[] args) {
        //    System.out.println(pqFormel(4, 4));
        System.out.println(hornerSchema(1, 2, -7, -8, 12));
        boolean ende = false;
        int ziffer;
        double zahl1, zahl2, zahl3, zahl4, zahl5, gedachtZahl;
        Scanner in = new Scanner(System.in);
        while (!ende) {
            System.out.println("Wählen Sie Bitte aus1");
            System.out.println("1_ Funktion Hoch 4! ");
            System.out.println("2_ Funktion Hoch 3! ");
            System.out.println("3_ Funktion Hoch 2! mit pqFromel! ");
            System.out.println("4_ Beenden!");

            ziffer = in.nextInt();
            switch (ziffer) {

                case 1:
                    System.out.println("Tragen Sie die Zahlen ");
                    System.out.println("x^4 = ");
                    zahl1 = in.nextDouble();
                    System.out.println("x^3 = ");
                    zahl2 = in.nextDouble();
                    System.out.println("x^2 = ");
                    zahl3 = in.nextDouble();
                    System.out.println("x = ");
                    zahl4 = in.nextDouble();
                    System.out.println("losezahl = ");
                    zahl5 = in.nextDouble();
                    Double[] s = hornerSchema(zahl1, zahl2, zahl3, zahl4, zahl5);
                    for (int i = 0; i <s.length; i++){

                        System.out.println(s.[i] + "x^3 " + x3 + "x^2 " + x2 + "x " + x + " = 0");

                    }
                    break;
                case 2:
                    System.out.println("Programm wird beendet.");
                    ende = true;
                    break;

            }


        }

    }
    */
}

