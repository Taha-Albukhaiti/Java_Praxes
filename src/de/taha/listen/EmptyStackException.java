package de.taha.listen;

/**
 * �berschrift:         EmptyStackException-Klasse
 * Beschreibung:        Exception-Klasse von der beim Zugriff
 * auf einen leeren Stack ein Objekt erzeugt wird.
 * Organisation: BHT-Berlin (Projektgruppe VFH)
 *
 * @author M.Esponda
 * @version 1.0
 */
public class EmptyStackException extends Exception {

    /**
     * erzeugt ein EmptyStackException-Objekt
     */

    public EmptyStackException() {
    }

    /**
     * erzeugt ein EmptyStackException-Objekt mit den Nachricht reason
     *
     * @param reason die Nachricht der Ausnahme
     */

    public EmptyStackException(String reason) {
        super(reason);
    }
}