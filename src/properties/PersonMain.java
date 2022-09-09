package properties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.printf("Property '%s': '%s' -> '%s' '%n", evt.getPropertyName(), evt.getOldValue(), evt.getNewValue());
            }
        });
        /*
        person.setName("Uli");
        person.setName("Uli");
        person.setName("Max");
         */

        try {
            person.setBigamist(true);
            person.setBigamist(false);
        } catch (PropertyVetoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        person.addVetoableChangeListener(new VetoableChangeListener() {
            @Override
            public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
                if ("bigamist".equals(evt.getPropertyName()) && (Boolean) evt.getNewValue()) {
                    System.out.println("Old: " + evt.getOldValue() + " Neu: " + evt.getNewValue());
                    throw new PropertyVetoException("Nimm zwei ist nichts für mich! ", evt);
                }
            }
        });

        try {
            person.setBigamist(true);
        } catch (PropertyVetoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}
