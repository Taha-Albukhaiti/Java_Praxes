package abstrakteKlassenInterfacesLambda;//import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class IFigurSammlung {

    // Array fuer IFigur-Objekte
    private IFigur[] sammlung;
    private int anzahl; // tatsaechliche Anzahl von IFigur-Objekten

    /**
     * erstellt IFigurSammlung-Objekt mit der angegebenen Kapazitaet
     *
     * @param laenge, maximale Anzahl der Elemente fuer diese Sammlung
     */

    public IFigurSammlung(int laenge) {
        this.sammlung = new IFigur[laenge];
        anzahl = -1; // noch keine Elemente
    }

    /**
     * fuegt das IFigur-OBjekt hinzu, falls es noch Platz gibt. Wenn die Sammlung
     * voll ist, wird eine Meldung ausgegeben.
     *
     * @param f, ein IFigur-Objekt
     */

    public void addIFigur(IFigur f) {
        if (anzahl < sammlung.length - 1) {
            sammlung[++anzahl] = f;
        } else {
            System.out.println("Die Sammlung ist voll. Das Objekt wurde nicht hinzugefuegt");
        }
    }

    /**
     * gibt alle IFigur-Objekt zum Bildschirm aus, welche die Bedingung erfuellen,
     * die mit tester spezifiziert ist.
     *
     * @param tester, ein Predicate-Objekt, das eine Bedingung darstellt.
     */

    public void printSelektiv(Predicate<IFigur> tester) {

        for (IFigur f : this.sammlung) {
            if (tester.test(f)) {
                System.out.println(f);
            }
        }
    }

    /**
     * fuehrt die Aktion, die mit c spezifiziert ist auf alle Elemente, welche die
     * Bedigung erfuellen, die mit tester spezifiziert ist.
     *
     * @param tester, ein Predicate-Objekt, das eine Bedingung darstellt.
     * @param c,      ein Consumer-Objekt, das eine auszufuehrende Aktion darstellt.
     */

    public void runSelektiv(Predicate<IFigur> tester, Consumer<IFigur> c) {
        for (IFigur f : this.sammlung) {
            if (tester.test(f)) {
                c.accept(f);
            }
        }

    }

    @Override
    public String toString() {
//    	return Arrays.toString(sammlung); - zeigt null Objekte
        if (anzahl < 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < anzahl; i++) {
            sb.append(sammlung[i].toString() + ", ");
        }
        sb.append(sammlung[anzahl] + "]");
        return sb.toString();
    }

}
