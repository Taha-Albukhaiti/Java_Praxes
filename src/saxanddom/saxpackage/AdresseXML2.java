package saxanddom.saxpackage;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class AdresseXML2 extends DefaultHandler {

    private List<Adresse> adresseList = new ArrayList<>();

    private String str;
    private Adresse neuAdresse;
    private boolean inVorname = false;
    private boolean inNachname = false;
    private boolean inStrasse = false;
    private boolean inPlz = false;
    private boolean inOrt = false;
    private boolean inLand = false;


    @Override
    public void startDocument() {
        System.out.println("------------ Start Document ------------");
    }

    /*
     * Methode, die fuer Zeichendaten innerhalb eines Elements aufgerufen
     * wird.
     */
    @Override
    public void characters(char[] chars, int start, int len) throws SAXException {
        str = new String(chars, start, len);

    }


    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes attr) throws SAXException {
        //System.out.println("SAX Event: START ELEMENT[ " + localName + " ]");
        if (localName.equals("Kontakt")) {
            neuAdresse = new Adresse();
        }
        if (localName.equals("Vorname")) {
            inVorname = true;
        }
        if (localName.equals("Nachname")) {
            inNachname = true;
        }
        if (localName.equals("Strasse")) {
            inStrasse = true;
        }
        if (localName.equals("PLZ")) {
            inPlz = true;
        }
        if (localName.equals("Ort")) {
            inOrt = true;
        }
        if (localName.equals("Land")) {
            inLand = true;
        }

    }


    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {

        if (localName.equals("Vorname")) {
            neuAdresse.setVorname(str);
            inVorname = false;
        }
        if (localName.equals("Nachname")) {
            neuAdresse.setNachname(str);
            inNachname = false;
        }
        if (localName.equals("Strasse")) {
            neuAdresse.setStrasse(str);
            inStrasse = false;
        }
        if (localName.equals("PLZ")) {
            neuAdresse.setPlz(str);
            inPlz = false;
        }
        if (localName.equals("Ort")) {
            neuAdresse.setOrt(str);
            inOrt = false;
        }
        if (localName.equals("Land")) {
            neuAdresse.setLand(str);
            inLand = false;
        }

        if (localName.equals("Kontakt")) {
            adresseList.add(neuAdresse); //
            System.out.println(neuAdresse.toString());
            //System.out.println(adresseList.size());
        }
    }

    @Override
    public void endDocument() {
        System.out.println("------------ End Document ------------");
    }

    public void adressObject(String vor, String nach, String strasse, String plz, String ort, String land) {
        Adresse neu = new Adresse(vor, nach, strasse, plz, ort, land);
        System.out.println(neu.toString());
    }

    public List<Adresse> gerAdresse() {
        return adresseList;
    }


}
