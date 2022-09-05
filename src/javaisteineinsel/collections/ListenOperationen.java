package javaisteineinsel.collections;

import java.awt.*;
import java.util.List;
import java.util.*;

public class ListenOperationen {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("0 1 2 3 4 5 6 7 8 9".split(" ")));
        stringList.subList(2, stringList.size() - 2).clear();
        // Rückwärts Ausgeben
        for (ListIterator<String> it = stringList.listIterator(stringList.size());
             it.hasPrevious(); ) {
            System.out.println(it.previous() + " ");
        }
        for (int i = stringList.size() - 1; i >= 0; i--) {
            System.out.println(stringList.get(i));
        }
        for (String s : stringList) {
            System.out.println(s.hashCode());
        }
        /*
        List<String> list = new ArrayList<>() {
            @Override
            public void removeRsnge(int fromInfex, int toIndex) {
                super.removeRange(fromInfex, toIndex);
            }
        };

         */
        System.out.println();
        List<Integer> integerList = new LinkedList<>();
        integerList.addAll(Arrays.asList(2, 4, 6, 8, 10, 12, 14));
        System.out.println(Collections.max(integerList));
        System.out.println();

        String s = "Lila :-) Lala :-) Ola :-)";
        int i = Collections.frequency(Arrays.asList(s.split("\\s")), ":-)");
        System.out.println(i);

        ArrayList<Point> pointArrayList = new ArrayList<>(Arrays.asList(new Point(1, 2), new Point(2, 1)));
        Point[] points = pointArrayList.toArray(new Point[pointArrayList.size()]);
        for (Point p : points) {
            System.out.println(p.toString());
        }
    }
}
