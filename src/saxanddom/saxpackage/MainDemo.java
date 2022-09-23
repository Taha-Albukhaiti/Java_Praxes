package saxanddom.saxpackage;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.IOException;

public class MainDemo {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Dateiname eingeben! < *.xml > ");
        }

        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        parserFactory.setNamespaceAware(true);

        try {
            SAXParser saxParser = parserFactory.newSAXParser();
            saxParser.parse(new FileInputStream(args[0]), new AdresseXML2());

        } catch (SAXException | ParserConfigurationException | IOException e) {
            System.out.println(e.getMessage());
            e.getStackTrace();
        }


    }
}
