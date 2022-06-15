package de.taha.listen;

public class ArrayStack<E> implements Stack<E> {

    // Instanzvariablen
    private int top; // zeigt immer auf oberstes Element im Stapel
    private E[] stack; // die Stapel Elemente werden gespeichert

    // Konstruktoren

    /**
     * Ein leerer Stapel mit der Groesse max. wird erzeugt.
     *
     * @param max maximale Anzahl der Elemente im Stapel
     */
    public ArrayStack(int max) {
        top = -1;  // Initialwert fuer leeren Stapel
        stack = (E[]) new Object[max];
    }

    /**
     * Ein leerer Stapel mit Platz fuer 100 Objekte wird erzeugt.
     */
    public ArrayStack() {
        this(100);  // erster Konstruktur wird aufgerufen
    }

    @Override
    public void push(E e) throws FullStackException {
        if (!full()) {
            stack[++top] = e;
        } else {
            throw new FullStackException("Der Stack ist voll!");
        }
    }

    @Override
    public E pop() throws EmptyStackException {
        if (!empty()) {
            return stack[top--];
        } else {
            throw new EmptyStackException("Der Stack ist voll!");
        }
    }

    /**
     * Ueberprueft, ob der Stapel leer ist.
     *
     * @return boolean true falls der Stapel leer ist, false sonst
     */
    public boolean empty() {
        return (top == -1);
    }

    @Override
    public boolean full() {
        return !(top < stack.length - 1);
    }

    /**
     * Gibt die Stapel-Elemente, beginnend mit dem Obersten, und zwischen "[]"
     * als String zur�ck. Die Elemente werden mit ',' getrennt.
     * Wenn der Stapel leer ist, wird einfach "[]" zurueckgegeben.
     *
     * @return String Stapel-Inhalt
     */
    public String toString() {
        if (!empty()) {
            StringBuilder returnVal = new StringBuilder("[");
            for (int i = top; i > 0; i--) {
                returnVal.append(stack[i].toString() + ", ");
            }
            returnVal.append(stack[0].toString() + "]");
            return returnVal.toString();
        } else {
            return "[]";
        }
    }

    /**
     * Alternative Implementierung von toString
     * Mit der Benutzung der Java Bibliothek.
     *
     * @return
     */
    public String toStringSimple() {
        return java.util.Arrays.toString(stack);
    }
}

// Methoden
// ...