package einsendeaufgabedrei;

import java.util.HashMap;

/**
 * @author Taha Al-Bukhaiti
 */
public class TelefonMap {
    private static HashMap<String, Telefoneintrag> eintraege = new HashMap<>();

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
    public boolean eintragEinfuegen(String name, String nummer) {

        if (name != null && nummer != null) {
            if (!eintraege.containsKey(name) && !eintraege.containsValue(nummer)) {
                eintraege.put(name, new Telefoneintrag(name, nummer));
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
        return eintraege.size();
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
            eintraege.replace(string, new Telefoneintrag(string, string2));
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
        if (!eintraege.containsKey(string)) return null;
        return eintraege.get(string).getNummer();
    }

    /**
     * Nach dem Name bzw. Key anhand dessen Value suchen.
     *
     * @param string
     * @return
     */
    public String nameSuchen(String string) {
        String telefoneintrag;
        for (String str : eintraege.keySet()) {
            telefoneintrag = eintraege.get(str).getNummer();
            if (telefoneintrag.equals(string)) {
                return str;
            }
        }
        return null;
    }


}

