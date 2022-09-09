package properties;








import java.beans.*;

public class Person {
    String name = "";
    boolean isBigamist;
    private PropertyChangeSupport changes = new PropertyChangeSupport(this);
    private VetoableChangeSupport vetos = new VetoableChangeSupport(this);

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changes.firePropertyChange("name", oldName, name);
    }

    public void setBigamist(boolean isBigamist) throws PropertyVetoException {
        boolean oldValue = this.isBigamist;
        vetos.fireVetoableChange("bigamist", oldValue, isBigamist);
        this.isBigamist = isBigamist;
        changes.firePropertyChange("bigamist", oldValue, isBigamist);
    }

    public String getName() {
        return name;
    }

    public boolean isBigamist() {
        return isBigamist;
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        changes.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        changes.removePropertyChangeListener(l);
    }

    public void addVetoableChangeListener(VetoableChangeListener l) {
        vetos.addVetoableChangeListener(l);
    }

    public void removeVetoableChangeListener(VetoableChangeListener l) {
        vetos.removeVetoableChangeListener(l);
    }

}

