package de.taha.listen;


/**
 * �berschrift: FullQueueException-Klasse Beschreibung: Exception-Klasse von der
 * beim Hinzuf�gen eines Elements auf eine volle Queue ein Objekt erzeugt wird.
 * Copyright: Copyright (c) 2002 Organisation: BHT-Berlin (Projektgruppe VFH)
 *
 * @author M.Esponda
 * @version 1.0
 */
public class FullQueueException extends Exception {

    /**
     * erzeugt ein FullQueueException-Objekt
     */

    public FullQueueException() {
    }

    /**
     * erzeugt ein FullQueueException-Objekt mit der Nachricht problem
     *
     * @param problem Nachricht der Ausnahme
     */

    public FullQueueException(String problem) {
        super(problem);
    }

}
