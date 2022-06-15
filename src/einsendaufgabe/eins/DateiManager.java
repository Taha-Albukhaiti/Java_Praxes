package einsendaufgabe.eins;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Scanner;

/**
 * @author
 * @author
 * @author
 */
public class DateiManager {

    private PathToDateiInfosMapper pathToDateiInfosMapper;

    private Map<Character, String> characters;

    public DateiManager() {
        this.pathToDateiInfosMapper = new PathToDateiInfosMapper();
        this.characters = Map.of('ä', "&auml;", 'ö', "&ouml;", 'ü', "&uuml;", 'Ä', "&Auml;", 'Ö', "&Ouml;", 'Ü',
                "&Uuml;", 'ß', "&szlig;");
    }

    /**
     * Bei Uebergabe eines vollstaendigen (absoluten) Verzeichnispfades erstellt die
     * Methode eine neue Verzeichnisstruktur auf dem Rechner; bereits existierende
     * Verzeichnisse gleichen Namens werden beibehalten.
     *
     * @param pfad Der absolute Verzeichnispfad, der erstellt werden soll
     */
    public void erstelleVerzeichnis(String pfad) {
        try {
            Path directoryPath = Path.of(pfad);
            Files.createDirectories(directoryPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Kopiert die Datei mit dem angegebenen (absoluten) Quelldateipfad in eine
     * Datei mit dem angegebenen (absoluten) Zieldateipfad (d. h. der Zieldateiname
     * ist mit anzugeben).
     *
     * @param quelldateipfad Der Quelldateipfad
     * @param zieldateipfad  Der Zieldateipfad inkl. des Zieldateinamens
     */
    public void kopiereDateiNach(String quelldateipfad, String zieldateipfad) {
        // Einfache Ein- und Ausgabestroeme oeffnen


        try {
            FileInputStream in = new FileInputStream(quelldateipfad);
            FileOutputStream out = new FileOutputStream(zieldateipfad);
            long dateiLaenge = (new File(quelldateipfad)).length();
            // Byte-Array, in das Daten eingelesen werden sollen, erzeugen
            byte[] b = new byte[(int) dateiLaenge];
            int len;
            // Daten aus Quelldatei einlesen und in Zieldatei schreiben
            while ((len = in.read(b)) > 0) {
                out.write(b, 0, len);
            }
            try {
                out.close(); // Einfache Ein- und Ausgabestroeme schliessen
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Benutzerinformation
        System.out.println("Datei '" + quelldateipfad + "' wurde in die Datei '" + zieldateipfad + "' kopiert.");

    }

    /**
     * Liefert Informationen über die Datei/das Verzeichnis zurueck, die/das sich am
     * angegebenen Pfad befindet.
     *
     * @param pfad Der Datei- oder Verzeichnispfad, ueber den Infos gewuenscht sind
     * @return DateiInfos-Objekt mit den gewuenschten Informationen (koennen
     * anschliessend z. B. per toString() ausgegeben werden)
     */
    public DateiInfos gibDateiInfos(String pfad) {
        return pathToDateiInfosMapper.toValue(pfad);
    }

    /**
     * Liest die (HTML-)Datei mit dem angegebenen (absoluten) Quelldateipfad ein,
     * ersetzt die darin enthaltenen Umlaute, sofern vorhanden, durch die zugehörige
     * Entity-Schreibweise (&auml; , &ouml; , &uuml; , &Auml; , &Ouml; , &Uuml; ,
     * &szlig;) und schreibt das Ergebnis in eine (HTML-)Datei mit dem angegebenen
     * (absoluten) Zieldateipfad.
     *
     * @param quelldateipfad der HTML-Datei
     * @param zieldateipfad  der HTML-Datei
     */
    public void konvertiereHtmlUmlaute(String quelldateipfad, String zieldateipfad) {
        String encoding = StandardCharsets.UTF_8.name();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(quelldateipfad), encoding))) {

            File line = erzeugeDatei(zieldateipfad);
            String line2 = zieldateipfad;
            while ((line2 = reader.readLine()) != null) {
                System.out.println(line2);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

		/*
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(quelldateipfad))) {
			FileWriter fileWriter = new FileWriter(zieldateipfad, true);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				for (Map.Entry<Character, String> characterStringEntry : characters.entrySet()) {
					Character key = characterStringEntry.getKey();
					String value = characterStringEntry.getValue();
					if (line.contains(Character.toString(key))) {
						line = line.replace(Character.toString(key), value);
					}
				}
				fileWriter.write(line);
			}
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		 */


    }

    // +++

    /**
     * Methode zum Erzeugen einer neuen Datei mit dem uebergebenen Dateinamen.
     *
     * @param dateiName Name der zu erzeugenden Datei
     * @return erzeugtes File-Objekt
     * @throws IOException
     */
    public File erzeugeDatei(String dateiName) throws IOException {
        // Dateiobjekt mit entsprechendem Namen erzeugen
        File testDatei = new File(dateiName);
        // leere Datei erzeugen
        testDatei.createNewFile();
        testDatei.setWritable(true);
        return testDatei;
    }

    public void liestDatei(String name) {
        try {
            File myFile = new File(name);
            Scanner readFile = new Scanner(myFile);

            while (readFile.hasNextLine()) {
                String data = readFile.nextLine();
                System.out.println(data);
            }
            readFile.close();
        } catch (FileNotFoundException x) {
            System.out.println("An error occurred.");
            x.printStackTrace();
        }
    }
}
