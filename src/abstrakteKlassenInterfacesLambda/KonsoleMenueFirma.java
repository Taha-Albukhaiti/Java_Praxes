package abstrakteKlassenInterfacesLambda;

/**
 * Die Klasse KonsoleMenueFirma stellt die Oberflaeche zur Verwaltung einfacher
 * Firmendaten zur Verfuegung. Es koennen Kunden und Angestellte erfasst werden,
 * Gehaltskosten ausgegeben werden und die Adressen aller Personen ausgegeben
 * werden.
 * 
 * @author Agathe Merceron
 * @version 1.0
 */
public class KonsoleMenueFirma {

    /**
     * Willkommensmeldung und Programmauswahlmenue auf der Konsole ausgeben.
     * 
     * @param dieFirma
     */
    public static void menue(Firma dieFirma) {
        System.out
                .println(" *********************************************************");
        System.out.println("       Willkommen und viel Spass mit "
                + dieFirma.getName());
        System.out
                .println("                     Ihre FinanzSoft AG               ");
        System.out
                .println(" *********************************************************\n");

        int antwort = 0;

        do {
            System.out.println("Sie koennen jetzt:");
            System.out.println(" 1: Einen Kunden / eine Kundin eingeben");
            System.out
                    .println(" 2: Einen Angestellten / eine Angestellte eingeben");
            System.out.println(" 3: Die monatlichen Gehaltskosten ausgeben");
            System.out
                    .println(" 4: Die Adresse aller Angehoerigen der Firma ausgeben");
            System.out.println(" 5: Programm beenden");
            antwort = Konsole.getInputInt("\n Bitte waehlen Sie: ");
            switch (antwort) {
            case 1:
            case 2:
                if (!dieFirma.istVoll()) {
                    allesEinlesenUndSpeichern(antwort, dieFirma);
                } else {
                    System.out.println("Die Firma ist schon voll!");
                }
                break;
            case 3:
                System.out.println("Monatliche Gehaltskosten: "
                        + dieFirma.alleGehaelter());
                break;
            case 4:
                dieFirma.alleAdressenAusgeben();
                break;
            case 5:
                System.out.println("\n Danke und bis zum Naechsten Mal!\n\n");
                System.exit(0);
            default:
                System.out.println(" Falsche Eingabe");
                break;
            }
        } while (antwort != 5); // dieser Bedingung wird nie wahr wegen case 5.
    }

    /**
     * Die Methode allesEinlesenUndSpeichern() dient zum Einlesen von
     * Personendaten an der Konsole und zum Hinzufuegen einer Person in die Firma.
     * 
     * @param antwort ausgewahlter Menuepunkt
     * @param dieFirma aktuelles Firmen-Objekt
     */
    private static void allesEinlesenUndSpeichern(int antwort, Firma dieFirma) {
        // Personendatem abfragen
        String nachname = Konsole.getInputString(" Name: ");
        String vorname = Konsole.getInputString(" Vorname: ");
        char a = Konsole.getInputChar(" Ist die Person weiblich (j/n): ");
        boolean weiblich = (a == 'j' || a == 'J');
        String strasse = Konsole.getInputString(" Strasse: ");
        String hausnummer = Konsole.getInputString(" Hausnummer: ");
        String plz = Konsole.getInputString(" Postleitzahl: ");
        String ort = Konsole.getInputString(" Ort: ");

        // Menuepunkt 1 gewaehlt - Kunde anlegen
        if (antwort == 1) {
            Kunde k = new Kunde(nachname, vorname, strasse, hausnummer, ort,
                    plz, weiblich);
            dieFirma.addKunde(k);
        // sonst - Angestellten anlegen
        } else { 
            float gehalt = Konsole.getInputFloat(" Hoehe des Bruttogehalts: ");
            Angestellte ang = new Angestellte(nachname, vorname, strasse,
                    hausnummer, ort, plz, weiblich, gehalt);
            dieFirma.addAngestellte(ang);
        }
    }

    /**
     * Main-Methode.
     * 
     * @param args Uebergabeparameter
     */
    public static void main(String[] args) {
        // Instanz der Klasse Firma erstellen
        Firma myFirma = new Firma();
        menue(myFirma);
    }

}
