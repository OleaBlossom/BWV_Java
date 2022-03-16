package src.MitarbeiterPackage;

public abstract class Mitarbeiter
        implements Comparable<Mitarbeiter> {
    private int id;
    private String name;

    public Mitarbeiter(String newName, int newId) {
        boolean isValid = validate(newId);

        if (isValid) {
            setId(newId);
            setName(newName);
        } else {
            throw new IllegalArgumentException("please refer to the schema for creating a user id");
        }
    }

    public boolean validate(int id) {
        return (id >= 1000) && (id <= 9999);
    }

    public String getName() {
        return name;
    }

    protected void setName(String newName) {
        name = newName;
    }

    @Override
    public int compareTo(Mitarbeiter m) {
        return getName().compareToIgnoreCase(m.getName());
    }

    public int getId() {
        return id;
    }

    protected void setId(int newId) {
        id = newId;
    }

    public abstract double einkommen();
}