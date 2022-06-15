package de.taha.listen;


/**
 * Warteschlange-Schnittstelle - Schnittstelle zur Implementierung der
 * Warteschlange
 * <p>
 * Da das Paket java.util schon das Interface Queue enthaelt
 * wird dieses Interface QueueGen genannt (Gen wie Generisch).
 *
 * @author A. Merceron
 * @version 1.1, 09/2009
 */
public interface QueueGen<E> {

    /**
     * Wenn die Warteschlange nicht voll ist, wird das Element 'e' als letztes
     * Element der Warteschlange eingefuegt, ansonsten wird ein
     * FullQueueException-Objekt erzeugt.
     *
     * @param e zu speicherndes Element
     * @throws FullQueueException
     */
    public void enqueue(E e) throws FullQueueException;

    /**
     * Wenn die Warteschlange nicht leer ist, wird das erste Element der
     * Warteschlange entfernt und als Ergebnis zurueckgegeben, andernfalls wird
     * ein EmptyQueueException-Objekt erzeugt.
     *
     * @return entferntes Element
     * @throws EmptyQueueException
     */
    public E dequeue() throws EmptyQueueException;

    /**
     * Wenn die Warteschlange nicht leer ist, wird das erste Element der
     * Warteschlange gelesen und als Ergebnis zurueckgegeben, ansonsten wird ein
     * EmptyQueueException-Objekt erzeugt.
     *
     * @return erstes Element der Warteschlange
     * @throws EmptyQueueException
     */
    public E head() throws EmptyQueueException;

    /**
     * Ueberprueft, ob die Warteschlange leer ist.
     *
     * @return boolean true wenn die Warteschlange leer ist, false sonst.
     */
    public boolean empty();

    /**
     * Ueberprueft, ob die Warteschlange voll ist.
     *
     * @return boolean true wenn die Warteschlange voll ist, false sonst.
     */
    public boolean full();

    /**
     * Liefert eine Darstellung der Warteschlange als Zeichenkette.
     *
     * @return die Darstellung als Zeichenkette.
     */
    @Override
    public String toString();
}