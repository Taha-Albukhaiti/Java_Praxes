package de.taha.listen;


/**
 * �berschrift: EmptyQueueException-Klasse Beschreibung: Exception-Klasse von der
 * beim Entfernen eines Elements einer leeren Queue ein Objekt erzeugt wird.
 * Copyright: Copyright (c) 2002 Organisation: BHT-Berlin (Projektgruppe VFH)
 *
 * @author M.Esponda
 * @version 1.0
 */

public class EmptyQueueException extends Exception {

    /**
     * erzeugt ein EmptyQueueException-Objekt
     */

    public EmptyQueueException() {
    }

    /**
     * erzeugt ein EmptyQueueException-Objekt mit der Nachricht reason
     *
     * @param reason Nachricht der Ausnahme
     */

    public EmptyQueueException(String reason) {
        super(reason);
    }
}