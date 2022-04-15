package streams;


import streams.UtilitiesArrayFiles;

import java.io.*;
import java.util.Arrays;

public class Testing {


    public static void main(String[] args) throws IOException {
        String userHome = System.getProperty("user.home");
        File testDatei = new File("test22.txt");
        testDatei.createNewFile();
        testDatei.setWritable(true);
       // schreibeTextInDatei("test22.txt");

        int[] da = new int[]{2, 33, 44, 55, 66, 66, 77, 77, 77, 77};
        UtilitiesArrayFiles.writeArrayToFile(da, "test22.txt");
        int[] m = UtilitiesArrayFiles.readInArrayStream("/Users/taha/Downloads/Javalerneinheiten/test22.txt");
        System.out.println(Arrays.toString(m));
        for (int d : m){
            System.out.println(d);
        }
    }
}
