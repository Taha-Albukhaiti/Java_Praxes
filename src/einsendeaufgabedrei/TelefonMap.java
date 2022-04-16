package einsendeaufgabedrei;

import java.awt.font.FontRenderContext;
import java.util.*;

public class TelefonMap {
    private static HashMap<String, String> eintraege = new HashMap<>();

    /**
     * Leert die Liste
     */
    public void leeren() {
        eintraege.clear();
    }


    /**
     * Fügt die Objekte von Telefoneintrag in einer Liste
     *
     * @param name
     * @param nummer
     * @return
     */
    public  boolean eintragEinfuegen(String name, String nummer) {

        if (name != null && nummer != null) {
            // Telefoneintrag tele = new Telefoneintrag(name, nummer);
            if (!eintraege.containsKey(name) && !eintraege.containsValue(nummer)) {
                eintraege.put(name, nummer);
                return true;
            }
        }
            return false;
    }

    /**
     * gibt die Grösse zurück
     *
     * @return
     */
    public Object groesse() {
        return eintraege.size() ;
    }

    /**
     * Aendert den Nummer
     *
     * @param string
     * @param string2
     * @return
     */
    public boolean nummerAendern(String string, String string2) {

        if (eintraege.containsKey(string)) {
            eintraege.replace(string, string2);
           // var s = eintraege.computeIfPresent(string, (k, v) -> v = string2);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Löscht ein Eintrag
     *
     * @param string
     */
    public void eintragLoeschen(String string) {
        eintraege.remove(string);
    }

    /**
     * @param string
     * @return
     */
    public String nummerSuchen(String string) {

//containsValue(Object value)
        //Ausgabe
        Iterator it = eintraege.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if(entry.getKey().equals(string))
             return (String) entry.getValue();
        }
        return null;
    }

    /**
     * @param string
     * @return
     */
    public String nameSuchen(String string) {

        Iterator it = eintraege.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue().equals(string))
                return (String) entry.getKey();
        }
        return null;
    }
    public static void main(String[] args){

        Telefonliste telefonliste ;
        telefonliste = new Telefonliste();
        telefonliste.eintragEinfuegen("Max", "0178989898989");

/*  for (HashMap<>)
        Iterator it = eintraege.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey());
        }*/

    }
}

