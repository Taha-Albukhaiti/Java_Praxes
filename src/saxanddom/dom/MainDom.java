package saxanddom.dom;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class MainDom {
    static Document doc;
    private static List<AdressePrivat> list = new ArrayList<>();
    private static List<AdresseGeschaeftlich> geschList = new ArrayList<>();
    private static String[] strings = {"privat", "Ahmad", "Molls", "Kandiso 23", "13341", "Hanvoer", "Deutschland"};

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Dateiname eingeben!! ");
        }
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            doc = documentBuilder.parse(args[0]);

            Element neuAdresse = kursElementErzeugen(doc);
            //in diesem Beispiel soll an einer bestimmten Stelle eingefuegt werden, daher eigene Methode hierfuer
            kursElementEinbinden(doc, neuAdresse);

            updateElement("USA");
            xmlSchreiben();

            documentAusgeben(doc);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        geschList.forEach(System.out::println);
        System.out.println();
        list.forEach(System.out::println);
    }

    /**
     * Gibt ein (ggf. modifiziertes) Dokument auf der Konsole aus.
     *
     * @param doc Das Dokument, das ausgegeben werden soll.
     * @throws IOException
     */
    public static void documentAusgeben(Document doc) throws IOException {
        AdresseGeschaeftlich geschaeftlich;
        AdressePrivat privat;
        NodeList nodeList = doc.getElementsByTagName("Kontakt");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                if (element.hasAttribute("typ")) {
                    String typ = element.getAttribute("typ");
                    if (typ.equals("privat")) {
                        privat = new AdressePrivat();
                        privat.setTyp(typ);
                        NodeList nodeList1 = element.getChildNodes();
                        for (int j = 0; j < nodeList1.getLength(); j++) {
                            Node n = nodeList1.item(j);
                            if (n.getNodeType() == Node.ELEMENT_NODE) {
                                Element element1 = (Element) n;
                                if (element1.getTagName().equals("Vorname")) {
                                    privat.setVorname(element1.getTextContent());
                                } else if (element1.getTagName().equals("Nachname")) {
                                    privat.setNachname(element1.getTextContent());
                                } else if (element1.getTagName().equals("Strasse")) {
                                    privat.setStrasse(element1.getTextContent());
                                } else if (element1.getTagName().equals("PLZ")) {
                                    privat.setPlz(element1.getTextContent());
                                } else if (element1.getTagName().equals("Ort")) {
                                    privat.setOrt(element1.getTextContent());
                                } else if (element1.getTagName().equals("Land")) {
                                    privat.setLand(element1.getTextContent());
                                }
                                System.out.println("Typ: " + typ + " " + element1.getTagName() + " : " + element1.getTextContent());
                            }
                        }
                        list.add(privat);

                    } else if (typ.equals("geschaeftlich")) {
                        geschaeftlich = new AdresseGeschaeftlich();
                        geschaeftlich.setTyp(typ);
                        NodeList nodeList1 = element.getChildNodes();
                        for (int j = 0; j < nodeList1.getLength(); j++) {
                            Node n = nodeList1.item(j);
                            if (n.getNodeType() == Node.ELEMENT_NODE) {
                                Element element1 = (Element) n;
                                if (element1.getTagName().equals("Vorname")) {
                                    geschaeftlich.setVorname(element1.getTextContent());
                                } else if (element1.getTagName().equals("Nachname")) {
                                    geschaeftlich.setNachname(element1.getTextContent());
                                } else if (element1.getTagName().equals("Strasse")) {
                                    geschaeftlich.setStrasse(element1.getTextContent());
                                } else if (element1.getTagName().equals("PLZ")) {
                                    geschaeftlich.setPlz(element1.getTextContent());
                                } else if (element1.getTagName().equals("Ort")) {
                                    geschaeftlich.setOrt(element1.getTextContent());
                                } else if (element1.getTagName().equals("Land")) {
                                    geschaeftlich.setLand(element1.getTextContent());
                                }
                                System.out.println("Typ: " + typ + " " + element1.getTagName() + " : " + element1.getTextContent());
                            }
                        }
                        geschList.add(geschaeftlich);
                    }
                }
            }
        }


    }

    /**
     * Erzeugt ein neues Kurselement anhand statisch hinterlegter Kursdaten.
     *
     * @param doc Das Document-Objekt, das zum Erzeugen der Knoten verwendet wird.
     */
    private static Element kursElementErzeugen(Document doc) {
        //Elemente erzeugen
        Element kontakt = doc.createElement("Kontakt");
        Element vorname = doc.createElement("Vorname");
        Element nachname = doc.createElement("Nachname");
        Element strasse = doc.createElement("Strasse");
        Element plz = doc.createElement("PLZ");
        Element ort = doc.createElement("Ort");
        Element land = doc.createElement("Land");

        //Attribute setzen
        kontakt.setAttribute("typ", strings[0]);

        //Texte setzen
        Node vornameText = doc.createTextNode(strings[1]);
        Node nachnameText = doc.createTextNode(strings[2]);
        Node strasseeText = doc.createTextNode(strings[3]);
        Node plzText = doc.createTextNode(strings[4]);
        Node ortText = doc.createTextNode(strings[5]);
        Node landText = doc.createTextNode(strings[6]);

        //Knoten verknuepfen
        kontakt.appendChild(vorname);
        kontakt.appendChild(nachname);
        kontakt.appendChild(strasse);
        kontakt.appendChild(plz);
        kontakt.appendChild(ort);
        kontakt.appendChild(land);

        vorname.appendChild(vornameText);
        nachname.appendChild(nachnameText);
        strasse.appendChild(strasseeText);
        plz.appendChild(plzText);
        ort.appendChild(ortText);
        land.appendChild(landText);

        return kontakt;
    }

    /**
     * Bindet ein Kurselement in ein Dokument ein, so dass die aufsteigende Reihenfolge
     * der Kursnummern erhalten bleibt.
     *
     * @param doc  Das Dokument, in das das Kurselement eingebunden werden soll.
     * @param addr Das einzubindende Kurselement.
     */
    private static void kursElementEinbinden(Document doc, Element addr) {
        //XPath-Suche nach Einfuegestelle
        Node nachfolgendeSchulung = null;
        Node adresse = null;

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();

            String expression = "//Kontakt";        //Elternknoten ermitteln
            adresse = (Node) xpath.evaluate(expression, doc, XPathConstants.NODE);

            //expression = "(//Schulungen/*[@nummer > " + kursdaten[0] + "])[1]";
            // nachfolgendeSchulung = (Node)xpath.evaluate(expression, doc, XPathConstants.NODE);
        } catch (XPathExpressionException xpe) {
            System.err.println(xpe);
        }
        if (nachfolgendeSchulung != null) {        //Kurs mit hoeherer Nummer gefunden
            adresse.insertBefore(addr, nachfolgendeSchulung);
        } else {                                //sonst am Ende einfuegen
            adresse.appendChild(addr);
        }
    }


    public static void updateElement(String landName) {

        NodeList alterInhalt = doc.getChildNodes();
        //for (int x = 0; x < list.getLength(); x++) {
        //  Node alterInhalt = list.item(x);
        //if (alterInhalt.getNodeValue().equals("Tast"))
        // if (alterInhalt.getNodeType() == Node.ELEMENT_NODE) {
        //  Element element = (Element) alterInhalt;
        //if (element.getAttribute("Typ").equals("privat")) {
        //  NodeList nodeList = element.getChildNodes();
        for (int j = 0; j < alterInhalt.getLength(); j++) {
            Node alterNodeInhalt = alterInhalt.item(j);
            if (alterNodeInhalt.getNodeType() == Node.ELEMENT_NODE) {
                Element neueElement = (Element) alterNodeInhalt;
                if (neueElement.getTagName().equals("Land")) {
                    if (neueElement.getTextContent().equals("Deutschland")) {
                        // if (neueElement.getTagName().equals("Land")) {
                        Text neuerInhalt = doc.createTextNode(landName);
                        neueElement.replaceChild(neuerInhalt, alterNodeInhalt);
                        alterInhalt.item(j).replaceChild(neuerInhalt, alterNodeInhalt);
                        // }
                    }
                }
            }
        }
    }
    //}
    //   }
    //}

    public static void xmlSchreiben() {
        TransformerFactory transFactory = TransformerFactory.newInstance();
        try {
            Transformer transformer = transFactory.newTransformer();

            DOMSource source = new DOMSource(doc);

            File neuesXML = new File("newXML" +
                    Calendar.getInstance(Locale.GERMANY).
                            getTimeInMillis() + ".xml");
            FileOutputStream output = new FileOutputStream(neuesXML);
            StreamResult result = new StreamResult(output);
            transformer.transform(source, result);  // 25
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}