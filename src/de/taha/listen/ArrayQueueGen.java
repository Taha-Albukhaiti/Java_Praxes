package de.taha.listen;


/**
 * Implementierung der Queue-Schnittstelle als Reihung (Array).
 *
 * @author A. Merceron - Umstellung auf generic
 * @version 1.1, 10/2009
 */
public class ArrayQueueGen<E> implements QueueGen<E> {

    // Instanzvariablen
    // Fuer die
    // Implementierung unseres Stapels benutzen wir eine Reihung (queue), in der die
    // Queue-Elemente gespeichert werden und zwei Zeiger (head und tail), die auf
    // das erste Element(head) bzw. den ersten freien Platz in der Queue (tail)
    // zeigen.
    private int head; // erstes Element in der Queue
    private int tail; // erster freie Platz
    private E[] queue; // Hier werden die Warteschlangen Elemente gespeichert

    // Konstruktoren

    /**
     * Eine leere Queue wird mit der Groe�e max. erzeugt
     *
     * @param max maximale Anzahl der Elemente in der Warteschlange
     */
    public ArrayQueueGen(int max) {
        head = 0; // Initialwert fuer leere Warteschlange
        tail = 0; // Initialwert fuer leere Warteschlange
        queue = (E[]) new Object[max];
    }

    /**
     * Ein leere Queue mit Platz f�r 100 Objekte wird erzeugt.
     */
    public ArrayQueueGen() {
        this(100); // erster Konstruktur wird aufgerufen
    }

    // Methoden

    /**
     * Ueberprueft, ob die Warteschlange leer ist.
     *
     * @return boolean true wenn die Warteschlange leer ist, false sonst.
     */
    @Override
    public boolean empty() {
        return (head == tail);
    }

    /**
     * Ueberprueft, ob die Warteschlange voll ist.
     *
     * @return boolean true wenn die Warteschlange voll ist, false sonst.
     */
    @Override
    public boolean full() {
        return ((tail == queue.length - 1) && (head == 0))
                || (head == (tail + 1));
    }

    /**
     * Wenn die Warteschlange nicht voll ist, wird das Element 'e' als letztes
     * Element der Warteschlange eingefuegt, ansonsten wird ein
     * FullQueueException-Objekt erzeugt.
     *
     * @param e
     * @throws FullQueueException
     */
    @Override
    public void enqueue(E e) throws FullQueueException {
        if (!full()) {
            queue[tail] = e;
            if (++tail == queue.length) {
                tail = 0;
            }
        } else {
            throw new FullQueueException("Die Queue ist voll!");
        }
    }

    /**
     * Wenn die Warteschlange nicht leer ist, wird das erste Element der
     * Warteschlange entfernt und als Ergebnis zurueckgegeben, andernfalls wird
     * ein EmptyQueueException-Objekt erzeugt.
     *
     * @return E
     * @throws EmptyQueueException
     */
    @Override
    public E dequeue() throws EmptyQueueException {
        if (!empty()) {
            E e = queue[head];
            if (++head == queue.length)
                head = 0;
            return e;
        } else {
            throw new EmptyQueueException("Der Queue ist leer");
        }
    }

    /**
     * Wenn die Warteschlange nicht leer ist, wird das erste Element der
     * Warteschlange gelesen und als Ergebnis zurueckgegeben, ansonsten wird ein
     * EmptyQueueException-Objekt erzeugt.
     *
     * @return E
     * @throws EmptyQueueException
     */
    @Override
    public E head() throws EmptyQueueException {
        if (!empty()) {
            return queue[head];
        } else {
            throw new EmptyQueueException("Die Queue ist leer");
        }
    }

    /**
     * Gibt die Warteschlange-Elemente zwischen "[]"
     * als String zur�ck. Die Elemente werden mit ',' getrennt.
     * Wenn der Warteschlange leer ist, wird einfach "[]" zurueckgegeben.
     *
     * @return die Darstellung als Zeichenkette.
     */
    @Override
    public String toString() {
        if (!empty()) {
            StringBuilder returnVal = new StringBuilder("[");
            if (head < tail) {
                for (int i = head; i < tail - 1; i++) {
                    returnVal.append(queue[i].toString() + ", ");
                }
                returnVal.append(queue[tail - 1].toString() + "]");
            } else {
                // think of a shorter solution using %
                if (tail != 0) {
                    for (int i = head; i < queue.length; i++) {
                        returnVal.append(queue[i].toString() + ", ");
                    }
                    for (int i = 0; i < tail - 1; i++) {
                        returnVal.append(queue[i].toString() + ", ");
                    }
                    returnVal.append(queue[tail - 1].toString() + "]");
                } else {
                    for (int i = head; i < queue.length - 1; i++) {
                        returnVal.append(queue[i].toString() + ", ");
                    }
                    returnVal.append(queue[queue.length - 1].toString() + "]");
                }
            }

            return returnVal.toString();
        } else {
            return "[]";
        }
    }
}