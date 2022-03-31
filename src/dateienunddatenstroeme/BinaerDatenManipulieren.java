package dateienunddatenstroeme;

import java.io.*;
/**
 * Bytes werden aus Bild-Datei gelesen; einzelne Bytes werden veraendert und
 * wieder in Datei gespeichert.
 * 
 * @author skalt
 * @version 2.0 07/2009
 */
public class BinaerDatenManipulieren {

	/**
	 * Main-Methode.
	 * 
	 * @param args Uebergabeparameter
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// Pruefen, ob zwei Uebergabeparameter bei Programmaufruf angegeben
		// wurden
		if (args.length != 2) {
			System.out.println("Fehler!\nAufruf des Programms ohne Dateiangaben.");
			System.exit(1);
		}

		// Dateinamen aus Uebergabeparametern lesen
		String bildDateiOriginal = args[0];
		String bildDateiGeand = args[1];

		/*
		 * // Dateiname des Originalbildes String bildDateiOriginal =
		 * "AbbWurfparabel.jpg"; // Dateigroesse - Angabe wichtig fuer Laenge des
		 * Byte-Arrays // die Dateigroesse ist klein genug um in ein int zu passen int
		 * dateiGroesse = (int) new File(bildDateiOriginal).length(); // Dateiname des
		 * Bildes mit den manipulierten Bytes String bildDateiGeand =
		 * "AbbWurfparabel_new.jpg";
		 */
		// Methode zum Manipulieren von Bytes imOriginalbild aufrufen
		manipuliereBytesInBild(bildDateiOriginal, bildDateiGeand);
	}

	/**
	 * Methode zum Manipuliere einzelner Bytes in einem Bild. Das manipulierte Bild
	 * wird unter dem uebergebenen neuen Dateinamen abgespeichert.
	 * 
	 * @param bildDateiOriginal Dateiname des Originalbildes
	 * @param bildDateiGeand    Dateiname des Bildes mit den manipulierten Bytes
	 * @param int               dateiGroesse Dateigroesse des Originalbildes in Byte
	 * @throws IOException
	 */
	public static void manipuliereBytesInBild(String bildDateiOriginal, String bildDateiGeand) throws IOException {
		// Datei einlesen - Eingabestroeme oeffnen
		FileInputStream fiStream = new FileInputStream(bildDateiOriginal);
		DataInputStream diStream = new DataInputStream(fiStream);

		// Byte-Array entsprechend der Dateigroesse des Originalbilds erzeugen
		byte[] byteA = new byte[diStream.available()];
		// Bytes mittels read() in das Byte-Array einlesen
		diStream.read(byteA);
		// Eingabestrom schliessen
		diStream.close();

		// Bytes an einzelnen Positionen aendern
		byteA[60] = -126;
		byteA[1060] = 126;
		byteA[1400] = -112;

		byteA[40000] = 1;
		byteA[40001] = 1;
		byteA[40002] = 1;
		byteA[40003] = 1;
		byteA[40004] = 1;
		byteA[40005] = 1;
		byteA[40006] = 1;
		byteA[40007] = 1;
		byteA[40008] = 1;
		byteA[40009] = 1;
		byteA[40010] = 1;
		byteA[40011] = 1;
		byteA[40012] = 1;

		// neue Datei erzeugen - Ausgabestroeme oeffnen
		FileOutputStream foStream = new FileOutputStream(bildDateiGeand);
		DataOutputStream doStream = new DataOutputStream(foStream);

		// Bytes in neue Datei speichern
		doStream.write(byteA);
		// Bytes aus internem Puffer in den FileOutputStream schreiben
		doStream.flush();
		// Ausgabestrom schliessen
		doStream.close();

		// Benutzerausgabe
		System.out.println("Geändertes Bild wurde in die Datei '" + bildDateiGeand + "' gespeichert.");
	}
}