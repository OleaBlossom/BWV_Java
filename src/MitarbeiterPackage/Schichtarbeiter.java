package src.MitarbeiterPackage;

public class Schichtarbeiter
        extends Mitarbeiter {

    public Schichtarbeiter(String newName, int newId) {
        super(newName, newId);
    }

    @Override
    protected void setId(int newId) {
        if (newId < 0) {
            newId = newId * -1;
        }

        newId %= 1000;

        super.setId(newId + 3000);
    }
}
