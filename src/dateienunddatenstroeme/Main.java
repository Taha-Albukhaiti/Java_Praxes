package dateienunddatenstroeme;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File f1 = new File("/Users/taha/Library/Mobile Documents/com~apple~CloudDocs/Documents/GDP2UEBUNG");
		System.out.println(f1.toString());
		System.out.println(" ");

		File testDatei;
		try {
			// Datei erzeugen
			testDatei = TestFile.erzeugeDatei("TestFile.txt");
			// Dateiinformationen anzeigen
			TestFile k = new TestFile();
			k.zeigeFileInfos(testDatei);
			TestFile.verweigereZugriff(testDatei);
			System.out.println("\nInformationen nach Aenderung des Schreibzugriff:");
			TestFile.zeigeFileInfos(testDatei);
			
			// Ausgabestroeme erzeugen und miteinander verbinden
			BufferedWriter bWriter = new BufferedWriter(new FileWriter(testDatei));
			String rr = "ASFSAf asfasf ASFasf ";
			bWriter.write(rr);
			bWriter.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		

	}
}
