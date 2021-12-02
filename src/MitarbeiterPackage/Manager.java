package src.MitarbeiterPackage;

public class Manager extends Mitarbeiter {
    public Manager(String newName, int newId) {
        super(newName, newId);
    }

    @Override
    protected void setId(int newId) {
        if (newId < 0) {
            newId = newId * -1;
        }

        newId %= 100;

        super.setId(newId + 5000);
    }
}
