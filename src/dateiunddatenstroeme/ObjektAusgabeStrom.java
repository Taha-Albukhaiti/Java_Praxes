package dateiunddatenstroeme;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Klasse zum Schreiben von Objekten in eine Datei.
 *
 * @author skalt
 * @version 3.0, 07/2009
 */
public class ObjektAusgabeStrom implements Serializable {

    // Eindeutige Kennung (UID) fuer die Klasse festlegen
    // notwendig fuer das Deserialisieren von Objekten dieser Klasse
    private static final long serialVersionUID = 123456789L;

    // Instanzvariablen deklarieren
    private String name;
    private String vorname;

    /**
     * Standard-Konstruktor.
     */
    public ObjektAusgabeStrom() {
    }

    /**
     * Konstruktor mit Parametern.
     *
     * @param name
     * @param vorname
     */
    public ObjektAusgabeStrom(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    /**
     * Getter + Setter Methoden
     */
    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    /**
     * Main-Methode.
     *
     * @param args Uebergabeparameter
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // Dateiname
        String dateiName = "ObjektAusgabeStromDatei";
        // Methode zum Testen des Objekt-Ausgabestroms aufrufen
        testeObjektAusgabeStrom(dateiName);
    }

    /**
     * Methode zum Testen eines Objekt-Ausgabestroms.
     *
     * @param dateiName Name der Datei in die Daten geschrieben werden
     * @throws IOException
     */
    public static void testeObjektAusgabeStrom(String dateiName)
            throws IOException {
        // Ausgabestrom oeffnen
        FileOutputStream foStream = new FileOutputStream(dateiName);
        ObjectOutputStream ooStream = new ObjectOutputStream(foStream);
        // Erzeugen und Schreiben von Objekten der Klasse in den Ausgabestrom
        // 1. Objekt
        ObjektAusgabeStrom einObjekt = new ObjektAusgabeStrom("Schmidt",
                "Konstantin");
        ooStream.writeObject(einObjekt);
        System.out.println(einObjekt.getVorname() + " " + einObjekt.getName());
        // 2. Objekt
        einObjekt = new ObjektAusgabeStrom("Troeger", "Bernd");
        ooStream.writeObject(einObjekt);
        System.out.println(einObjekt.getVorname() + " " + einObjekt.getName());
        // Ausgabestrom schliessen
        ooStream.flush();
        ooStream.close();
    }
}