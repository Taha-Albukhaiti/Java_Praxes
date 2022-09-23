package saxanddom.dom;//--------------------------------------
//dom.DOMBsp.java
//1.0
//--------------------------------------

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class DOMBsp       // 2
{
    Document doc;           // 3

    // ---- main ----
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println
                    ("Aufruf: DOMBsp01 <dateiname>");
            System.exit(1);
        }
        new DOMBsp(args);     // 4
    }

    // ---- constructor ----
    public DOMBsp(String[] ar)  // 5
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // 6
        factory.setNamespaceAware(true);
        try {
            DocumentBuilder parser = factory.newDocumentBuilder(); // 7
            doc = parser.parse(ar[0]);  // 8
            dokumentAusgeben();   // 9

        } catch (Throwable t) {
            t.printStackTrace();
        }
        System.exit(0);       // 10
    }

    // ---- Baumstruktur auf mehrere Arten auslesen ---
    public void dokumentAusgeben() { // 11
        System.out.println("\n### Beispiel 1 ###\n");
        System.out.println(doc.getDocumentElement().getNodeValue()); // 12

        System.out.println("\n### Beispiel 2 ###\n");
        NodeList nList = doc.getElementsByTagName("*");  // 13
        int anzNode = nList.getLength();  // 14
        for (int x = 0; x < anzNode; x++) { // 15
            System.out.println("" + x + " " + nList.item(x)); // 16
        }

        System.out.println("\n### Beispiel 3 ###\n");
        Element rootElement = doc.getDocumentElement(); // 17
        NodeList nList2 =       // 18
                rootElement.getChildNodes();
        int anzNode2 = nList2.getLength();
        for (int x = 0; x < anzNode2; x++)  // 19
        {
            if (nList2.item(x).getNodeType() ==  // 20
                    Node.COMMENT_NODE)
                System.out.println(nList2.item(x));
        }
    }
}

