package xml;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * Klasse zum Ausgeben eines XML-Dokuments auf der Konsole unter der Benutzung
 * des SAX Parsers.
 * 
 * @author Prof. Dr. Andreas Solymosi, Sandra Kaltofen
 */
public class SAXAusgabe {
    // Pfad und Name der XML-Datei die ausgegeben werden soll
    private static String XMLDateiName = "adressen2.xml";
    
    /*
     * Main Methode.
     * 
     * @param args Uebergabeparameter
     */
    public static void main(String[] args) {
        // zu parsende XML-Datei
        File eineDatei = new File(XMLDateiName);
        // Sax Ereignis Handler erzeugen
        MyDefaultHandler handler = new MyDefaultHandler();

        try {
            // SAXParserFactory erzeugen
            SAXParserFactory factory = SAXParserFactory.newInstance();
            // SAXParser erzeugen
            SAXParser parser = factory.newSAXParser();
            // XML-Dokument parsen unter Verwendung des implementierten
            // Ereignishandlers
            parser.parse(eineDatei, handler);
            
        // ExceptionHandling    
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    /*
     * Implementation des Handlers fuer Sax-Ereignisse.
     */
    private static class MyDefaultHandler extends DefaultHandler {
        /*
         * Methode die am Anfang des XML-Dokuments aufgerufen wird.
         */
    	@Override 
        public void startDocument() {
            System.out.println("Start");
        }

        /*
         * Methode die am Ende des XML-Dokuments aufgerufen wird.
         */
    	@Override
        public void endDocument() {
            System.out.println("Ende");
        }

        /*
         * Methode die am Anfang eines Elements aufgerufen wird.
         */
    	@Override 
        public void startElement(String namespaceURI, String localName,
                String qualifiedName, Attributes attrs) {
            // Elementnamen ermitteln
            String elementName = localName.equals("") ? qualifiedName
                    : localName;
            // Elementnamen ausgeben
            System.out.print("<" + elementName);

            // Schleife ueber alle Attribute des Elements
            for (int i = 0; i < (attrs == null ? 0 : attrs.getLength()); i++) {
                String attribut = attrs.getLocalName(i);
                if (attribut.equals(""))
                    attribut = attrs.getQName(i);
                System.out.print(" " + attribut + "=\"" + attrs.getValue(i)
                        + "\"");
            }
            // Element schliessen
            System.out.print(">");
        }

        /*
         * Methode, die am Ende eines Elements aufgerufen wird.
         */
    	@Override 
        public void endElement(String namespaceURI, String localName,
                String qualifiedName) {
            // End-Element ausgeben
            System.out.print("</" + qualifiedName + ">");
        }

        /*
         * Methode, die fuer Zeichendaten innerhalb eines Elements aufgerufen
         * wird.
         */
    	@Override 
        public void characters(char[] chars, int start, int len) {
            System.out.print(new String(chars, start, len));
        }
    }
}
