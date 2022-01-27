package src.KfzPackage;

import src.GpsPackage.Gps;
import src.MitarbeiterPackage.Fahrer;
import src.MitarbeiterPackage.Mitarbeiter;

public abstract class Kfz {
    private double tankGroesse;
    private double tankinhalt;
    private Fahrer fahrer;
    private boolean motorAn;
    private Gps aktuellePosition;

    public Kfz(double tankGroesse, Gps aktuellePosition) {
        this.tankGroesse = tankGroesse;
        this.aktuellePosition = aktuellePosition;
    }

    public void fahrenZu(Gps ziel) {

    }

    public void parken() {

    }

    public double tanken(double liter) {
        this.tankinhalt = this.tankinhalt + liter;

        return liter;
    }

    public boolean einsteigenFahrer(Fahrer fahrer) {
        this.fahrer = fahrer;
        return true;
    }

    public Mitarbeiter aussteigung() {
        return this.fahrer;
    }

    public abstract double auslastung();
}
