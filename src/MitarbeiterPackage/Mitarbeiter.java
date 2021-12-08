package src.MitarbeiterPackage;

public abstract class Mitarbeiter {
    private int id;
    private String name;

    public Mitarbeiter(String newName, int newId) {
        setId(newId);
        setName(newName);
    }

    public String getName() {
        return name;
    }

    protected void setName(String newName) {
        name = newName;
    }

    public int getId() {
        return id;
    }

    protected void setId(int newId) {
        if (newId < 0) {
            newId = newId * -1;
        }

        if (newId < 1000) {
            newId = newId + 1000;
        }

        id = newId;
    }

    public abstract double einkommen();
}