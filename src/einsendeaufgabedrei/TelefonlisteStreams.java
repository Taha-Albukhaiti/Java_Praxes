package einsendeaufgabedrei;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Taha Al-Bukhaiti
 */
public class TelefonlisteStreams {
    private static List<Telefoneintrag> eintraege = new LinkedList<>();

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
        if ((name == null) || (nummer == null)) {
            return false;
        }

        for (Telefoneintrag ein : eintraege) {
            if (ein.getName().equals(name) && ein.getNummer().equals(nummer)) {
                return false;
            }
        }
        Telefoneintrag tele = new Telefoneintrag(name, nummer);
        eintraege.add(tele);
        return true;
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
        for (int i = 0; i < eintraege.size(); i++) {
            if (eintraege.get(i).getName().equals(string)) {
                eintraege.get(i).setNummer(string2);
                return true;
            }
        }
        return false;
    }

    /**
     * Löscht ein Eintrag
     *
     * @param string
     */
    public void eintragLoeschen(String string) {
        eintraege.removeIf(t -> t.getName().equals(string));
    }

    /**
     * Sucht der Nummer anhand des Names aus
     *
     * @param string
     * @return
     */
    public String nummerSuchen(String string) {

        Telefoneintrag eintrag;
        for (Telefoneintrag telefoneintrag : eintraege) {
            eintrag = telefoneintrag;
            if (eintrag.getName().equals(string)) {
                return eintrag.getNummer();
            }
        }
        return null;
    }

    /**
     * Sucht der Name anhand des Nummeres aus
     *
     * @param string
     * @return
     */
    public String nameSuchen(String string) {
        Telefoneintrag eintrag;
        Iterator<Telefoneintrag> it = eintraege.iterator();
        while (it.hasNext()) {
            eintrag = it.next();
            if (eintrag.getNummer().equals(string))
                return eintrag.getName();
        }
        return null;
    }


}
