package einsendeaufgabedrei;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Telefonliste {
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

        if (name != null && nummer != null) {
            Telefoneintrag tele = new Telefoneintrag(name, nummer);
            for (Telefoneintrag eintraege2: eintraege) {
                if ((eintraege2.getName() == tele.getName()) && (eintraege2.getNummer() == tele.getNummer())) {
                    continue;


                }
                eintraege.add(tele);
                return true;
            }
        }
        return false;



/*
        for (int i = 0; i < eintraege.size(); i++){
            if (!((eintraege.get(i).getName()) == name) && !((eintraege.get(i).getNummer()) == nummer)){
                Telefoneintrag tele = new Telefoneintrag(name, nummer);
                eintraege.add(tele);
                return true;
            }
        }*/


     /*   //  if(!eintraege.contains(tele)) {
        Iterator<Telefoneintrag> it = eintraege.iterator();
        while (it.hasNext()) {

            if (!it.next().getName().equals(name) || !it.next().getNummer().equals(nummer)) {
                Telefoneintrag tele = new Telefoneintrag(name, nummer);
                eintraege.add(tele);
                return true;
            }
        }*/


        //   name != null && nummer != null
      /*  Telefoneintrag eintrag ;
        Iterator<Telefoneintrag> it = eintraege.iterator();
        while (it.hasNext()) {
            eintrag = it.next();*/

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
                //eintraege.set(i, setNummer(string2));
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

        Iterator<Telefoneintrag> it = eintraege.iterator();
        while (it.hasNext()) {
            Telefoneintrag eintrag = it.next();
            if (eintrag.getName().equals(string)) {
                it.remove();
            }
        }

    }

    /**
     * @param string
     * @return
     */
    public String nummerSuchen(String string) {
        Telefoneintrag eintrag = null;
        Iterator<Telefoneintrag> it = eintraege.iterator();
        while (it.hasNext()) {
            eintrag = it.next();
            if (eintrag.getName().equals(string)) {
                return eintrag.getNummer();
            }
        }
        return null;
    }

    /**
     * @param string
     * @return
     */
    public String nameSuchen(String string) {
        Telefoneintrag eintrag = null;
        Iterator<Telefoneintrag> it = eintraege.iterator();
        while (it.hasNext()) {
            eintrag = it.next();
            if (eintrag.getNummer().equals(string))
                return eintrag.getName();
        }
        return null;
    }

    public static void main(String[] args) {

        Iterator<Telefoneintrag> lit3 = eintraege.iterator();
        while (lit3.hasNext()) {
            System.out.println(lit3.next().toString());
        }

    }

}
