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
public class SAXAufgabe2 {
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
        private boolean printData = false;
		
    
        /*
		 * Methode die am Anfang des XML-Dokuments aufgerufen wird.
		 */
        /*
		@Override
		public void startDocument() {
			System.out.println("Start");
		}
		*/
		/*
		 * Methode die am Ende des XML-Dokuments aufgerufen wird.
		 */
	    /*
		@Override
		public void endDocument() {
			System.out.println("Ende");
		}
*
            // Flag, ob Daten ausgegeben werden sollen oder nicht
            private boolean printData = false;

            /**
             * Methode, die am Anfang eines Elements aufgerufen wird.
             */
            public void startElement(String namespaceURI, String localName,
                    String qualifiedName, Attributes attrs) {
                // Elementnamen ermitteln
                String elementName = localName.equals("") ? qualifiedName
                        : localName;
                // Pruefen, ob Element zu den Kontaktdaten gehoert
                if (elementName.equals("Vorname") || elementName.equals("Nachname")
                        || elementName.equals("Strasse")
                        || elementName.equals("PLZ") || elementName.equals("Ort")
                        || elementName.equals("Land")) {
                    // Flag fuer Ausgabe der Daten auf true setzen
                    printData = true;
                }

                // Schleife ueber alle Attribute des Elements
                for (int i = 0; i < (attrs == null ? 0 : attrs.getLength()); i++) {
                    String attribut = attrs.getLocalName(i);
                    if (attribut.equals(""))
                        attribut = attrs.getQName(i);
                    // Daten ausgeben wenn Attribut "typ" ist
                    if (attribut.equals("typ")) {
                        System.out.println("*************************");
                        System.out.println("Kontakttyp: " + attrs.getValue(i));
                    }
                }
            }

            /**
             * Methode, die fuer Zeichendaten innerhalb eines Elements aufgerufen
             * wird.
             */
            public void characters(char[] chars, int start, int len) {
                // Daten ausgeben wenn Ausgabeflag gesetzt ist
                if (printData) {
                    System.out.println(new String(chars, start, len));
                    printData = false;
                }
            }
	}
        
}
