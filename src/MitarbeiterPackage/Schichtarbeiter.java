package src.MitarbeiterPackage;

public class Schichtarbeiter
        extends Mitarbeiter {

    private double stundenSatz;
    private int anzahlStunden;

    public Schichtarbeiter(String newName, int newId, double stundenSatz) {
        super(newName, newId);
        setStundenSatz(stundenSatz);
    }

    @Override
    protected void setId(int newId) {
        if (newId < 0) {
            newId = newId * -1;
        }

        newId %= 1000;

        super.setId(newId + 3000);
    }

    public int getAnzahlStunden() {
        return this.anzahlStunden;
    }

    public void setAnzahlStunden(int stunden) {
        this.anzahlStunden = stunden;
    }

    public double getStundenSatz() {
        return stundenSatz;
    }

    public void setStundenSatz(double stundenSatz) {
        this.stundenSatz = stundenSatz;
    }

    public double einkommen() {
        return getStundenSatz() * getAnzahlStunden();
    }
}
