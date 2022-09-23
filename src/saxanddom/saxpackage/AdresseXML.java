package saxanddom.saxpackage;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class AdresseXML extends DefaultHandler {

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
    }


    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {

        if (localName.equals("Vorname")) {
            neuAdresse.setVorname(str);
        }
        if (localName.equals("Nachname")) {
            neuAdresse.setNachname(str);
        }
        if (localName.equals("Strasse")) {
            neuAdresse.setStrasse(str);
        }
        if (localName.equals("PLZ")) {
            neuAdresse.setPlz(str);
        }
        if (localName.equals("Ort")) {
            neuAdresse.setOrt(str);
        }
        if (localName.equals("Land")) {
            neuAdresse.setLand(str);
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

    public List<Adresse> gerAdresse() {
        return adresseList;
    }


}
