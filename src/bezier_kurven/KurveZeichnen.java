package bezier_kurven;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class KurveZeichnen {
    static double fak(double n) {
        if (n == 0) return 1;
        else
            return n * fak(n - 1);
    }

    public static double b(double u, int i) {
        return (fak(3) / fak(i) * fak(3 - i)) * Math.pow(u, i) * Math.pow((1 - u), 3 - i);
    }

    public static Map<Double, Double> berechnenBazierKurve(Point p0, Point p1, Point p2, Point p3) {

        double[] u = {0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1};
        Map<Double, Double> pointArrayList = new HashMap();

        for (double v : u) {
            double x = (b(v, 0) * p0.x) + (b(v, 1) * p1.x)
                    + (b(v, 2) * p2.x) + (b(v, 3) * p3.x);
            double y = (b(v, 0) * p0.x) + (b(v, 1) * p1.x)
                    + (b(v, 2) * p2.x) + (b(v, 3) * p3.x);
            pointArrayList.put(x, y);
        }
        return pointArrayList;
    }

    public static Map<Double, Double> berechnenBazierKurve2(Point p0, Point p1, Point p2, Point p3) {

        double[] u = {0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1};
        Map<Double, Double> pointArrayList = new HashMap();

        for (int i = 0; i < u.length; i++) {
            double x = (Math.pow(1 - u[i], 3) * p0.x) + (3 * u[i] * Math.pow(1 - u[i], 2) * p1.x)
                    + (3 * (u[i] * u[i]) * (1 - u[i]) * p2.x) + (Math.pow(u[i], 3) * p3.x);

            double y = (Math.pow(1 - u[i], 3) * p0.y) + (3 * u[i] * Math.pow(1 - u[i], 2) * p1.y)
                    + (3 * (u[i] * u[i]) * (1 - u[i]) * p2.y) + (Math.pow(u[i], 3) * p3.y);
            pointArrayList.put(x, y);
        }
        return pointArrayList;
    }

    public static void main(String[] args) {
        Map<Double, Double> map = berechnenBazierKurve2(new Point(1, 1),
                new Point(2, 4), new Point(4, 3), new Point(5, 0
                ));

        Map<Double, Double> sortedMap = new TreeMap<>(map);
        for (Map.Entry<Double, Double> entry : sortedMap.entrySet()) {
            String key = String.format("%.3f", entry.getKey());
            String value = String.format("%.3f", entry.getValue());
            System.out.println(key + " ; " + value);
        }
    }
}
