package dateiunddatenstroeme;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Klasse zum Lesen von Objekten aus einer Datei.
 *
 * @author skalt
 * @version 3.0, 07/2009
 */
public class ObjektEingabeStrom {

    /**
     * Main-Methode.
     *
     * @param args Uebergabeparameter
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // Dateiname
        String dateiName = "ObjektAusgabeStromDatei";
        // Methode zum Testen des Objekt-Eingabestroms aufrufen
        testeObjektEingabeStrom(dateiName);
    }

    /**
     * Methode zum Testen eines Objekt-Eingabestroms.
     *
     * @param dateiName Name der Datei aus der Daten gelesen werden
     * @throws Exception
     */
    public static void testeObjektEingabeStrom(String dateiName)
            throws Exception {
        // Eingabestrom oeffnen
        FileInputStream fiStream = new FileInputStream(dateiName);
        ObjectInputStream oiStream = new ObjectInputStream(fiStream);

        // Erstes Objekte vom Typ ObjektAusgabeStrom aus dem Eingabestrom
        // einlesen
        ObjektAusgabeStrom einObjekt = (ObjektAusgabeStrom) oiStream
                .readObject();
        System.out.println(einObjekt.getVorname() + " " + einObjekt.getName());

        // Zweites Objekte vom Typ ObjektAusgabeStrom aus dem Eingabestrom
        // einlesen
        einObjekt = (ObjektAusgabeStrom) oiStream.readObject();
        System.out.println(einObjekt.getVorname() + " " + einObjekt.getName());
        oiStream.close();
    }
}