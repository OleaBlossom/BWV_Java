package src.MitarbeiterPackage;

public class Manager extends Bueroarbeiter {

    private double bonusSatz;

    public Manager(String newName, int newId, double festgehalt, double bonusSatz) throws IllegalArgumentException {
        super(newName, newId, festgehalt);
        setBonusSatz(bonusSatz);
    }

    @Override
    public boolean validate(int id) {
        return (id >= 5000) && (id < 6000);
    }

    public double getBonusSatz() {
        return this.bonusSatz;
    }

    public void setBonusSatz(double amount) {
        if (amount > 0) {
            this.bonusSatz = amount;
        }
    }

    public double berechneBonus() {
        return getFestgehalt() * this.bonusSatz / 100;
    }

    public double einkommen() {
        return getFestgehalt() + berechneBonus();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", festgehalt=" + getFestgehalt() +
                ", bonusSatz=" + bonusSatz +
                ", einkommen=" + einkommen() +
                '}';
    }
}
