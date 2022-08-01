package tahaslibrary;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

public class _MethodsWithFiles {
    /**
     * Liefert Informationen über die Datei/das Verzeichnis zurueck, die/das sich am
     * angegebenen Pfad befindet.
     *
     * @param dateiname Der Datei- oder Verzeichnispfad, ueber den Infos gewuenscht sind
     * @return string mit den gewuenschten Informationen (koennen
     * anschliessend z. B. per toString() ausgegeben werden)
     */
    public static String dateiInfo(String dateiname) {
        String text = null;
        File file = new File(dateiname);
        if (file.exists() | file.isDirectory() | file.isFile()) {
            text = "Absloute Path: " + file.getAbsolutePath() + "\n"
                    + "Name: " + file.getName() + "\n"
                    + "Existiert: " + file.exists() + "\n"
                    + "Größe: " + file.length() + "\n"
                    + "ist Datei: " + file.isFile() + "\n"
                    + "Lesezugriff: " + file.canRead() + "\n"
                    + "Letzte Änderung: " + LocalDateTime.ofInstant(Instant.ofEpochSecond(file.lastModified()),
                    ZoneId.systemDefault());
        }

        return text;
    }

    /**
     * Bei Uebergabe eines vollstaendigen (absoluten) Verzeichnispfades erstellt die
     * Methode eine neue Verzeichnisstruktur auf dem Rechner; bereits existierende
     * Verzeichnisse gleichen Namens werden beibehalten.
     *
     * @param pfad Der absolute Verzeichnispfad, der erstellt werden soll
     */
    public static void erstelleVerzeichnis(String pfad) {
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
    public static void kopiereDateiNach(String quelldateipfad, String zieldateipfad) {
        BufferedReader br = null;
        BufferedWriter bw;
        String text;
        try {
            br = new BufferedReader(new FileReader(quelldateipfad));
            bw = new BufferedWriter(new FileWriter(zieldateipfad));
            text = br.readLine();
            while (text != null) {
                bw.write(text);
                text = br.readLine();
            }
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Datei '" + quelldateipfad + "' wurde in die Datei '" + zieldateipfad + "' kopiert.");
    }

    public static String dateiLesen(String datei_name) {
        BufferedReader bf = null;
        String text = null;
        try {
            bf = new BufferedReader(new FileReader(datei_name));
            while (bf.ready()) {
                text = bf.readLine();
            }
            return text;

        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            try {
                bf.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return text;
    }

    public static void dateiLoeschen(String file_name) {
        Path path = Paths.get(file_name);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void dateiErzeugen(String dateiname) {
        File datei = new File(dateiname);
        try {
            datei.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void dateiSchreiben(String datei_name, String text) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(datei_name));
            bw.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.flush();
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static String readFrom(File file) {
        if (!file.exists()) {
            return null;
        }
        String str = "";
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader(file));
            while (bf.ready()) {
                str += bf.readLine();
            }
        } catch (Exception e) {
            System.out.println("Scheiß Exception " + e.getMessage());
        } finally {
            try {
                if (bf != null) {
                    bf.close();
                }
            } catch (IOException e) {
                System.out.println("Scheiß Exception: " + e.getMessage());
            }
        }
        return str;
    }

    public static Map<Character, Integer> countChars(String str) {
        Map<Character, Integer> hashMap = new HashMap<>();
        String s = str.replaceAll(" ", "");
        char[] words = s.toCharArray();
        for (char word : words) {
            hashMap.merge(word, 1, Integer::sum);
        }
        return hashMap;
    }

    public static Map<Character, Integer> countChars(String str, String text) {
        Map<Character, Integer> hashMap = new HashMap<>();
        String ss = null;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 1; j < text.length(); j++) {
                if (str.charAt(i) == text.charAt(j))
                    ss = str.replace(str.charAt(i), ' ');
            }
        }
        System.out.println("Die neue String ist: " + ss);
        String s = ss.replaceAll(" ", "");
        char[] words = s.toCharArray();
        for (char word : words) {
            hashMap.merge(word, 1, Integer::sum);
        }
        return hashMap;
    }
}
