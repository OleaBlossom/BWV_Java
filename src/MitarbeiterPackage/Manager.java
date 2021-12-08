package src.MitarbeiterPackage;

public class Manager extends Bueroarbeiter {

    private double bonusSatz;

    public Manager(String newName, int newId, double festgehalt, double bonusSatz) {
        super(newName, newId, festgehalt);
        setBonusSatz(bonusSatz);
    }

    @Override
    protected void setId(int newId) {
        if (newId < 0) {
            newId = newId * -1;
        }

        newId %= 100;

        super.setId(newId + 5000);
    }

    public double getBonusSatz() {
        return this.bonusSatz;
    }

    public void setBonusSatz(double amount) {
        this.bonusSatz = amount;
    }

    public double berechneBonus() {
        return getFestgehalt() * getBonusSatz() / 100;
    }
}
