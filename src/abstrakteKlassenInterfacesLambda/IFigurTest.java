package abstrakteKlassenInterfacesLambda;

import java.util.Arrays;


public class IFigurTest  {
    public static void main(String[] args) {
        IFigur[] far = new IFigur[5];
        far[0] = new Kreis(3.1);
        far[1] = new Rechteck(1, 2);
        far[2] = new Kreis(4, "Rosa");
        far[3] = new Rechteck(3, 4, "Lila");
        far[4] = new Kreis(2);
        System.out.println(Arrays.toString(far));
        //Arrays.sort(far, new IFigur.FlaechenComparator());
        Arrays.sort(far, (o1, o2) -> (int) (o1.getFlaeche() - o2.getFlaeche()));
        // Arrays.sort(far, (IFigur o1, IFigur o2) ->
        //{ return (int) (o1.getFlaeche() - o2.getFlaeche());});
        System.out.println(Arrays.toString(far));

    }

}