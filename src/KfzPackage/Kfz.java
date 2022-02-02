package src.KfzPackage;

import src.GpsPackage.Gps;
import src.MitarbeiterPackage.Fahrer;
import src.MitarbeiterPackage.Mitarbeiter;

import java.util.*;

public abstract class Kfz {
    private double tankGroesse;
    private double tankinhalt;
    private Fahrer fahrer;
    private boolean motorAn = false;
    private Gps aktuellePosition;

    public static final String FS_MOPED = "AM";
    public static final String FS_MOTORRAD = "A";
    public static final String FS_KRAFTFAHRZEUG = "B";
    public static final String FS_KRAFTFAHRZEUG_GROSS = "C1";
    public static final String FS_BUS_MINI = "D1";
    public static final String FS_BUS_GROSS = "D";
    public static final String FS_TRACKER = "T";

    public Kfz(double tankGroesse, Gps aktuellePosition) {
        this.tankGroesse = tankGroesse;
        this.aktuellePosition = aktuellePosition;
    }

    public void fahrenZu(Gps ziel) {
        if (this.motorAn && this.fahrer != null) {
            this.aktuellePosition = ziel;
        }
    }

    public void parken() {
        this.motorAn = false;
        this.fahrer = null;
    }

    public double tanken(double liter) {
        double ueberlauf = 0;
        double total = this.tankinhalt + liter;

        if (total > this.tankGroesse) {
            ueberlauf = total - this.tankGroesse;
            this.tankinhalt = this.tankGroesse;
        }

        return ueberlauf;
    }

    public boolean einsteigenFahrer(Fahrer fahrer) {
        List<String> erlaubteKlassen = Arrays.asList(
                FS_KRAFTFAHRZEUG,
                FS_KRAFTFAHRZEUG_GROSS,
                FS_BUS_MINI,
                FS_BUS_GROSS);

        boolean istErlaubt = erlaubteKlassen.contains(fahrer.getFuehrerscheinKlasse());

        if (istErlaubt) {
            this.fahrer = fahrer;
        }

        return istErlaubt;
    }

    public Mitarbeiter aussteigung() {
        return this.fahrer;
    }

    public abstract double auslastung();
}
