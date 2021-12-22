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
            newId = -newId;
        }

        if (newId < 1000) {
            newId = newId + 1000;
        }
        else if (newId > 9999) {
          newId = newId % 10000;
        }

        id = newId;
    }

    public abstract double einkommen();
}