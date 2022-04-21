package dateiunddatenstroeme;

import java.io.File;
import java.io.IOException;

public class TestDirectory {
    /**
     * Informationen zum uebergebenen File-Objekt unter Verwendung von Methoden
     * der Klasse File anzeigen.
     *
     * @param testDatei File-Objekt zu dem Informationen angezeigt werden sollen
     */
    private static void zeigeFileInfos(File testFile) {
        System.out.println("\nInformationen:\n");
        System.out.println("Name= " + testFile.getName());
        System.out.println("Path= " + testFile.getPath());
        System.out.println("AbsolutePath= " + testFile.getAbsolutePath());
        System.out.println("Parent= " + testFile.getParent());
        System.out.println("exists= " + testFile.exists());
        System.out.println("canRead= " + testFile.canRead());
        System.out.println("canWrite= " + testFile.canWrite());
        System.out.println("isFile= " + testFile.isFile());
        System.out.println("isDirectory= " + testFile.isDirectory());
    }

    public static void main(String[] args) throws IOException {
        File n = new File("/Users/taha/Library/Mobile Documents/com~apple~CloudDocs/Documents/GDP2UEBUNG/VFH");
        System.out.println(n.mkdirs());
        File nn = n.createTempFile("Temp_Datei", ".tmp", n);
        nn.setWritable(true);
        zeigeFileInfos(nn);


    }
}
