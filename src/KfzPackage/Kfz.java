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
        setTankGroesse(tankGroesse);
        this.aktuellePosition = aktuellePosition;
    }

    private void setTankGroesse(double tankGroesse) {

        if (tankGroesse > 0) {
            this.tankGroesse = tankGroesse;
        } else {
            System.out.println("please ensure the tank can contain a positive number of liters");
        }
    }

    public void fahrenZu(Gps ziel) {
        if (this.motorAn && this.fahrer != null) {
            this.aktuellePosition = ziel;
        }
    }

    public Fahrer parken() {
        this.motorAn = false;
        return this.aussteigen();
    }

    public double tanken(double liter) throws IllegalArgumentException {

        double ueberlauf = 0;
        if (liter > 0) {

            double total = this.tankinhalt + liter;

            if (total > this.tankGroesse) {
                ueberlauf = total - this.tankGroesse;
                this.tankinhalt = this.tankGroesse;
                System.out.println("Oops. The tank overflowed by " + ueberlauf + " liters.");
            }
        } else {
            throw new IllegalArgumentException("please only fill the tank with a positive number of liters");
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

    public Fahrer aussteigen() {
        Fahrer ausgestiegenerFahrer = this.fahrer;
        this.fahrer = null;
        return ausgestiegenerFahrer;
    }

    public abstract double auslastungBerechnen();
}
