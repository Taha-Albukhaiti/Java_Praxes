package abstrakteKlassenInterfacesLambda;


public class IFigurSammlungTester {

    public static void main(String[] args) {
        IFigurSammlung meineSammlung = new IFigurSammlung(4);
        meineSammlung.addIFigur(new Kreis(3.1));
        meineSammlung.addIFigur(new Rechteck(1, 2));
        meineSammlung.addIFigur(new Kreis(4, "Rosa"));
        meineSammlung.addIFigur(new Rechteck(3, 4, "Lila"));
        meineSammlung.addIFigur(new Kreis(2));
        System.out.println(meineSammlung);
        System.out.println("\n");
        meineSammlung.printSelektiv(f -> f instanceof Kreis);
        System.out.println("\n");
        meineSammlung.printSelektiv(f -> f.getFarbe().equals("Rot"));

        meineSammlung.runSelektiv(f -> f instanceof Kreis, f -> ((Kreis) f).radiusIncrease(0.5));
    }

}

