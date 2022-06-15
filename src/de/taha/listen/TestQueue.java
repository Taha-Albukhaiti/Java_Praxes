package de.taha.listen;


/**
 * Testklasse zur Klasse ArrayQueueGen
 *
 * @author M.Esponda
 * @version 3.0
 */
public class TestQueue {

    public static void main(String[] args) {
        QueueGen<Integer> fs = new ArrayQueueGen<Integer>(4);
        // QueueGen<Integer> fs = new ListQueueGen<Integer>();
        try {
            System.out.println(fs); // Queue-Inhalt ausgeben
            // toString()-Methode wird implizit aufgerufen

            // Elemente hinzufuegen
            System.out.println("fs.enqueue 3");
            fs.enqueue(3); // auto boxing
            System.out.println(fs);
            System.out.println("fs.enqueue 7, 1");
            fs.enqueue(Integer.valueOf(7));
            fs.enqueue(Integer.valueOf(1));
            System.out.println(fs);

            // Element entfernen
            System.out.println("fs.dequeue " + fs.dequeue());
            System.out.println(fs);
            // Element hinzufuegen
            System.out.println("fs.enqueue 1");
            fs.enqueue(Integer.valueOf(1));
            System.out.println(fs);
            System.out.println("fs.dequeue " + fs.dequeue());
            // Element hinzufuegen
            System.out.println("fs.enqueue 1");
            fs.enqueue(Integer.valueOf(1));
            System.out.println(fs);
            // Elemente entfernen
            System.out.println("fs.dequeue " + fs.dequeue());
            System.out.println("fs.dequeue " + fs.dequeue());
            System.out.println(fs);
            // Element hinzufuegen
            System.out.println("fs.enqueue 1, 2");
            fs.enqueue(Integer.valueOf(1));
            fs.enqueue(Integer.valueOf(2));
            System.out.println(fs);
            // Elemente entfernen
            System.out.println("fs.dequeue " + fs.dequeue());
            System.out.println("fs.dequeue " + fs.dequeue());
            System.out.println("fs.dequeue " + fs.dequeue());
            System.out.println(fs);
        } catch (EmptyQueueException | FullQueueException e) {
            System.out.println(e);
        }
        ;
    }
}