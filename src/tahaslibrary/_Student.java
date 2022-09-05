package tahaslibrary;

public class _Student {
    private String name;
    private double note;

    public _Student(String name, double note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", note=" + note +
                '}';
    }
}
