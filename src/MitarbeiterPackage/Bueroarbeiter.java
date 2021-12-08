package src.MitarbeiterPackage;

public class Bueroarbeiter
        extends Mitarbeiter {

    private double festgehalt;

    public Bueroarbeiter(String newName, int newId, double festgehalt) {
        super(newName, newId);
        setFestgehalt(festgehalt);
    }


    @Override
    protected void setId(int newId) {
        if (newId < 0) {
            newId = newId * -1;
        }

        newId %= 1000;

        super.setId(newId + 5000);
    }

    public double einkommen() {
        return getFestgehalt();
    }

    public double getFestgehalt() {
        return this.festgehalt;
    }

    public void setFestgehalt(double amount) {
        this.festgehalt = amount;
    }
}
