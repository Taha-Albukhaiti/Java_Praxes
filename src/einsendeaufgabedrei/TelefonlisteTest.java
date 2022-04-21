package einsendeaufgabedrei;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


//TelefonlisteTest mit drei Testfaellen
@RunWith(Enclosed.class)
public class TelefonlisteTest {

    // private static Telefonliste telefonliste = new Telefonliste();
    private static TelefonMap telefonliste = new TelefonMap();

    public static class TelefonlisteTestLeereListe {

        @After
        public void listeLeeren() {
            telefonliste.leeren();
        }

        @Test
        public void testEintragEinfuegenReturn() {
            assertTrue(telefonliste.eintragEinfuegen("Max", "0175 987654321"));
        }

        @Test
        public void testEintragEinfuegenReturnNull() {
            assertFalse(telefonliste.eintragEinfuegen(null, null));
        }

        @Test
        public void testEintragEinfuegenGroesse() {
            telefonliste.eintragEinfuegen("Max", "0175 987654321");
            assertEquals(1, telefonliste.groesse());
        }

        @Test
        public void testNummerAendernReturn() {
            assertFalse(telefonliste.nummerAendern("Max", "0151 12345678"));
        }

        public void testNummerAendernReturnNull() {
            assertFalse(telefonliste.nummerAendern(null, "0151 12345678"));
        }

        @Test
        public void testNummerAendernGroesse() {
            telefonliste.nummerAendern("Max", "0151 12345678");
            assertEquals(0, telefonliste.groesse());
        }

        @Test
        public void testEintragLoeschenGroesse() {
            telefonliste.eintragLoeschen("Max");
            assertEquals(0, telefonliste.groesse());    //vorher leer, nachher leer
        }

        @Test
        public void testEintragLoeschenNull() {
            telefonliste.eintragLoeschen(null);
            assertEquals(0, telefonliste.groesse());    //vorher leer, nachher leer
        }

        @Test
        public void testNummerSuchen() {
            assertEquals(null, telefonliste.nummerSuchen("Max"));
        }

        @Test
        public void testNummerSuchenNull() {
            assertEquals(null, telefonliste.nummerSuchen(null));
        }

        @Test
        public void testNameSuchen() {
            assertEquals(null, telefonliste.nameSuchen("0175 987654321"));
        }

        @Test
        public void testNameSuchenNull() {
            assertEquals(null, telefonliste.nameSuchen(null));
        }
    }

    public static class TelefonlisteTestEinEintrag {

        @Before
        public void init() {
            telefonliste.eintragEinfuegen("Max", "0175 987654321");
        }

        @After
        public void listeLeeren() {
            telefonliste.leeren();
        }

        @Test
        public void testEintragEinfuegenReturn() {
            assertTrue(telefonliste.eintragEinfuegen("Eva", "0163 1234567"));
        }

        @Test
        public void testEintragEinfuegenGroesse() {
            telefonliste.eintragEinfuegen("Eva", "0163 1234567");
            assertEquals(2, telefonliste.groesse());
        }

        @Test
        public void testEintragEinfuegenDoppeltReturn() {
            assertFalse(telefonliste.eintragEinfuegen("Max", "0175 987654321"));
        }

        @Test
        public void testEintragEinfuegenDoppeltGroesse() {
            telefonliste.eintragEinfuegen("Max", "0175 987654321");
            assertEquals(1, telefonliste.groesse());
        }

        @Test
        public void testNummerAendernReturn() {
            assertTrue(telefonliste.nummerAendern("Max", "0151 12345678"));
        }

        @Test
        public void testNummerAendernGroesse() {
            telefonliste.nummerAendern("Max", "0151 12345678");
            assertEquals(1, telefonliste.groesse());
        }

        @Test
        public void testNummerAendernUnbekanntReturn() {
            assertFalse(telefonliste.nummerAendern("Eva", "0163 1234567"));
        }

        @Test
        public void testNummerAendernUnbekanntGroesse() {
            telefonliste.nummerAendern("Eva", "0163 1234567");
            assertEquals(1, telefonliste.groesse());
        }

        @Test
        public void testEintragLoeschen() {
            telefonliste.eintragLoeschen("Max");
            assertEquals(0, telefonliste.groesse());
        }

        @Test
        public void testEintragLoeschenUnbekannt() {
            telefonliste.eintragLoeschen("Eva");
            assertEquals(1, telefonliste.groesse());
        }

        @Test
        public void testNummerSuchen() {
            assertEquals("0175 987654321", telefonliste.nummerSuchen("Max"));
        }

        @Test
        public void testNummerSuchenUnbekannt() {
            assertEquals(null, telefonliste.nummerSuchen("Eva"));
        }

        @Test
        public void testNameSuchen() {
            assertEquals("Max", telefonliste.nameSuchen("0175 987654321"));
        }

        @Test
        public void testNameSuchenUnbekannt() {
            assertEquals(null, telefonliste.nameSuchen("0163 1234567"));
        }
    }

    public static class TelefonlisteTestMehrereEintraege {

        @Before
        public void init() {
            telefonliste.eintragEinfuegen("Max", "0175 987654321");
            telefonliste.eintragEinfuegen("Ida", "0152 11001100");
            telefonliste.nummerAendern("Ida", "0152 38375866");    //um spaeter testen zu koennen, ob Wert korrekt geaendert wurde
            telefonliste.eintragEinfuegen("Eva", "0163 1234567");
        }

        @After
        public void listeLeeren() {
            telefonliste.leeren();
        }

        @Test
        public void testEintragEinfuegenReturn() {
            assertTrue(telefonliste.eintragEinfuegen("Ulf", "0151 2345678"));
        }

        @Test
        public void testEintragEinfuegenGroesse() {
            telefonliste.eintragEinfuegen("Ulf", "0151 2345678");
            assertEquals(4, telefonliste.groesse());
        }

        @Test
        public void testEintragEinfuegenDoppeltReturn() {
            assertFalse(telefonliste.eintragEinfuegen("Ida", "0152 38375866"));
        }

        @Test
        public void testEintragEinfuegenDoppeltGroesse() {
            telefonliste.eintragEinfuegen("Ida", "0152 38375866");
            assertEquals(3, telefonliste.groesse());
        }

        @Test
        public void testNummerAendernReturn() {
            assertTrue(telefonliste.nummerAendern("Ida", "0156 3456789"));
        }

        @Test
        public void testNummerAendernGroesse() {
            telefonliste.nummerAendern("Ida", "0156 3456789");
            assertEquals(3, telefonliste.groesse());
        }

        @Test
        public void testNummerAendernUnbekanntReturn() {
            assertFalse(telefonliste.nummerAendern("Ulf", "0151 2345678"));
        }

        @Test
        public void testNummerAendernUnbekanntGroesse() {
            telefonliste.nummerAendern("Ulf", "0151 2345678");
            assertEquals(3, telefonliste.groesse());
        }

        @Test
        public void testEintragLoeschen() {
            telefonliste.eintragLoeschen("Ida");
            assertEquals(2, telefonliste.groesse());
        }

        @Test
        public void testEintragLoeschenUnbekannt() {
            telefonliste.eintragLoeschen("Ulf");
            assertEquals(3, telefonliste.groesse());
        }

        @Test
        public void testNummerSuchen() {
            assertEquals("0152 38375866", telefonliste.nummerSuchen("Ida"));
        }

        @Test
        public void testNummerSuchenUnbekannt() {
            assertEquals(null, telefonliste.nummerSuchen("Ulf"));
        }

        @Test
        public void testNameSuchen() {
            assertEquals("Ida", telefonliste.nameSuchen("0152 38375866"));
        }

        @Test
        public void testNameSuchenUnbekannt() {
            assertEquals(null, telefonliste.nameSuchen("0151 2345678"));
        }
    }
}
