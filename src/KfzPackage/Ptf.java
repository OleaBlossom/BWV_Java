package src.KfzPackage;

import src.GpsPackage.Gps;
import src.MitarbeiterPackage.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// PersonenTransportFahrzeug
public class Ptf
        extends Kfz {

    private int sitze;
    private ArrayList<Mitarbeiter> passagiere = new ArrayList<Mitarbeiter>();

    public Ptf(double tankGroesse, Gps aktuellePosition, int sitze) {
        super(tankGroesse, aktuellePosition);
        setSitze(sitze);
    }

    public boolean einsteigen(Mitarbeiter passagier) {
        boolean result = false;

        if (passagiere.size() < sitze && !passagiere.contains(passagier)) {
            this.passagiere.add(passagier);
            result = true;
        }

        return result;
    }

    public boolean einsteigenFahrer(Fahrer fahrer) {
        List<String> erlaubteKlassen = Arrays.asList(
                FS_KRAFTFAHRZEUG,
                FS_KRAFTFAHRZEUG_GROSS,
                FS_BUS_MINI,
                FS_BUS_GROSS);

        boolean istErlaubt = erlaubteKlassen.contains(fahrer.getFuehrerscheinKlasse());

        if (istErlaubt) {
            istErlaubt = super.einsteigenFahrer(fahrer);
        }

        return istErlaubt;
    }

    public Mitarbeiter aussteigen(int vonSitplatz) {
        return passagiere.get(vonSitplatz);
    }

    public void parken() {
        // todo: finish implementing this
        this.setPassagiere(new ArrayList<>());
    }

    private void setPassagiere(ArrayList<Mitarbeiter> passagiere) {
        this.passagiere = passagiere;
    }

    public void setSitze(int sitze) {
        this.sitze = sitze;
    }

    public int getSitze() {
        return sitze;
    }

    public double auslastungBerechnen() {
        double sitzeBesetzt = passagiere.size();
        double sitze = this.sitze + 1;

        if (this.getFahrer() != null) {
            sitzeBesetzt += 1;
        }

        return sitzeBesetzt / sitze;
    }
}
