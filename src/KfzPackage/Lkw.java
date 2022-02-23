package src.KfzPackage;

import src.GpsPackage.Gps;
import src.MitarbeiterPackage.Fahrer;

import java.util.Arrays;
import java.util.List;

// Lastkraftwagen
public class Lkw
        extends Kfz {

    private double ladeflaeche;

    private double ladung = 0;

    public Lkw(double tankGroesse, Gps aktuellePosition, double ladeflaeche) {
        super(tankGroesse, aktuellePosition);
        setLadeflaeche(ladeflaeche);
    }

    public void beladen(double menge) {

    }

    public void entladen(double menge) {

    }

    public boolean einsteigenFahrer(Fahrer fahrer) {
        List<String> erlaubteKlassen = Arrays.asList(
                FS_KRAFTFAHRZEUG_GROSS,
                FS_BUS_MINI,
                FS_BUS_GROSS);

        boolean istErlaubt = erlaubteKlassen.contains(fahrer.getFuehrerscheinKlasse());

        if (istErlaubt) {
            istErlaubt = super.einsteigenFahrer(fahrer);
        }

        return istErlaubt;
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
