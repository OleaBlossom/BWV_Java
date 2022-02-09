package src.KfzPackage;

import src.GpsPackage.Gps;
import src.MitarbeiterPackage.Mitarbeiter;

public class Lkw
        extends Kfz {


    private double ladeflaeche;

    private double ladung = 0;

    public Lkw(double tankGroesse, Gps aktuellePosition, double ladeflaeche) {
        super(tankGroesse, aktuellePosition);
        setLadeflaeche(ladeflaeche);
    }

    public boolean beladen(double qm) {
        return false;
    }

    public boolean entladen(double qm) {
        return false;
    }

    @Override
    public double auslastungBerechnen() {
        return 0;
    }


    public double getLadeflaeche() {
        return this.ladeflaeche;
    }

    public void setLadeflaeche(double ladeflaeche) {
        this.ladeflaeche = ladeflaeche;
    }

    public double getLadung() {
        return ladung;
    }

    public void setLadung(double ladung) {
        this.ladung = ladung;
    }
}
