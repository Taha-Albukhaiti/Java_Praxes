package einsendaufgabe.eins;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Diese Klasse bietet eine Benutzeroberflaeche fuer die Methoden aus
 * DateiManager.
 * 
 * @author
 * @author
 * @author
 *
 */
public class DateiManagerUI {

	private static DateiManager dateiManager = new DateiManager();

	/**
	 * Hauptprogrammschleife fuer die konsolenbasierte UI
	 * 
	 * @param args Startparameter-Array, unbenutzt
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// write your code here
		String userHome = System.getProperty("user.home");
		dateiManager.konvertiereHtmlUmlaute("umlaute.html", "umlaute_konvertieret.html");

		//dateiManager.erzeugeDatei("test2.txt");
		 ///dateiManager.kopiereDateiNach( "test.txt",
		 //"test2.txt");
		//dateiManager.konvertiereHtmlUmlaute("umlaute.html", "umlaute.html");

		// Abbruchbedingung fuer die Menueschleife int ziffer;
		// fuer Menueauswahl

		try {
			String eingabe;
			String eingabe2;
			Scanner scanner = new Scanner(System.in);
			System.out.println("\n(1) Verzeichnisstruktur erzeugen");
			System.out.println("(2) Datei kopieren");
			System.out.println("(3) Infos einer Datei oder Verzeichnis einlesen");
			System.out.println("(4) HTML-Datei einlesen");

			int ziffer = Integer.parseInt(scanner.nextLine()); // Menueauswahl einlesen switch
			switch (ziffer) {
				case 1:
					System.out.println("Name des Verzeichnis? ");
					eingabe = scanner.nextLine();
					dateiManager.erstelleVerzeichnis(eingabe);
					main(args);
					break;
				case 2:
					System.out.println("Quelldateipfad eingeben: ");
					eingabe = scanner.nextLine();
					System.out.println("Zieldateipfad eingeben: ");
					eingabe2 = scanner.nextLine();

					dateiManager.kopiereDateiNach(eingabe, eingabe2);
					main(args);
					break;
				case 3:
					System.out.println("Geben Sie den Pfad zur Datei/des Ordners ein: ");
					eingabe = scanner.nextLine();
					DateiInfos dateiInfos = dateiManager.gibDateiInfos(eingabe);
					System.out.println(dateiInfos);
					main(args);
					break;
				case 4:
					System.out.println("Welche HTML-Datei moechten Sie einlesen? ");
					eingabe = scanner.nextLine();
					dateiManager.konvertiereHtmlUmlaute(eingabe, eingabe);
					main(args);
					break;
			}
			scanner.close();
		} catch (NumberFormatException e) {
			System.err.println("Fehler bei der Eingabe der Nummer: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
