package einsendeaufgabedrei;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
    public boolean eintragEinfuegen(String name, String nummer) {

        if (name != null && nummer != null) {
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
            eintraege.replace(string, string2);
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
        return eintraege.get(string);
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
}

