package ahaslibrary;

public class _Rekursion {

    public static String allStarRekursion(String str) {
        if (str.length() <= 1)
            return str;
        return str.charAt(0) + "*" + allStarRekursion(str.substring(1));
    }

    public static String allStarRekursion(String str, char spi) {
        if (str.length() <= 1)
            return str;
        String s = Character.toString(spi);
        return str.charAt(0) + s + allStarRekursion(str.substring(1));
    }
    
}
