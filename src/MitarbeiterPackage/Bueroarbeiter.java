package src.MitarbeiterPackage;

public class Bueroarbeiter
        extends Mitarbeiter {

    private double festgehalt;

    public Bueroarbeiter(String newName, int newId, double festgehalt) throws IllegalArgumentException {
        super(newName, newId);
        setFestgehalt(festgehalt);
    }


    @Override
    protected void setId(int newId) {
        newId = Math.abs(newId) % 1000 + 5000;

        super.setId(newId);
    }

    public double einkommen() {
        return getFestgehalt();
    }

    public double getFestgehalt() {
        return this.festgehalt;
    }

    public void setFestgehalt(double amount) throws IllegalArgumentException {
        if (festgehalt < 300) {
            this.festgehalt = amount;
        } else throw new IllegalArgumentException("Gehalt zu gering");
    }

    @Override
    public String toString() {
        return "Bueroarbeiter{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", festgehalt=" + festgehalt +
                ", einkommen=" + einkommen() +
                '}';
    }
}
