package xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Klasse zum Ausgeben eines XML-Dokuments auf der Konsole unter der Benutzung
 * des DOM Parsers.
 *
 * @author Prof. Dr. Andreas Solymosi, Sandra Kaltofen
 */
public class DOMAusgabe {
    // Pfad und Name der XML Datei die ausgegeben werden soll
    private static String XMLDateiName = "adressen2.xml";

    /**
     * Main Methode.
     *
     * @param args Uebergabeparameter
     */
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        // Uebergebene XML-Datei parsen
        Document dokument = builder.parse(new File(XMLDateiName));
        // DOM Baum durchlaufen und ausgeben


        traversieren(dokument.getDocumentElement(), "");
    }

    /**
     * Methode zum Durchlaufen und Ausgeben des DOM Baums.
     *
     * @param e     aktuelles Element
     * @param ebene String fuer die Einrueckung der Ebenen
     */
    private static void traversieren(Element e, String ebene) {
        System.out.println(ebene + e.getNodeName());


        //Scanner s = new Scanner(System.in);
        //System.out.println("Wollen Sie die Private oder geschaeftliche Daten? ");

        //String cc = s.next();
        //if(e.getAttributeNode(ebene).equals(cc)) {}


        // Kindelemente des uebergebenen Elements ermitteln
        NodeList children = e.getChildNodes();
        
        /*
        for (int i = 0; i < children.getLength(); i++) {
            Node knoten = children.item(i);
            // Knoten ist ein ELEMENT_NODE
            if(children.getNodeType() =="geschaeftlich" ) {
            if (knoten.getNodeType() == Node.ELEMENT_NODE)
                // Rekursiver Aufruf von traversieren fuer aktuelles Element
                traversieren((Element) knoten, ebene + " ");
            // Knoten ist ein TEXT_NODE
            else if (knoten.getNodeType() == Node.TEXT_NODE) {
                String inhalt = knoten.getTextContent();
                if (inhalt.trim().length() > 0) // leerer Inhalt?
                    System.out.println(ebene + " :" + inhalt);
            } else
                // kein ELEMENT_NODE, kein TEXT_NODE
                System.out.println(ebene + knoten);
        }
        }*/
    }

}