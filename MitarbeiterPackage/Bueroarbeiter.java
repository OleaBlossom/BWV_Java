package MitarbeiterPackage;

public class Bueroarbeiter
        extends Mitarbeiter {
    public Bueroarbeiter(String newName, int newId) {
        super(newName, newId);
    }

    @Override
    protected void setId(int newId) {
        newId %= 1000;

        super.setId(newId + 3000);
    }
}
