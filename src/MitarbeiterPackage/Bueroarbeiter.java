package src.MitarbeiterPackage;

public class Bueroarbeiter
        extends Mitarbeiter {

    public Bueroarbeiter(String newName, int newId) {
        super(newName, newId);
    }

    @Override
    protected void setId(int newId) {
        if (newId < 0) {
            newId = newId * -1;
        }

        newId %= 1000;

        super.setId(newId + 5000);
    }
}
