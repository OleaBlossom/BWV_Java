package src.VerwaltungPackage;

import src.KfzPackage.*;
import src.MitarbeiterPackage.*;

import java.util.*;

public class Unternehmensverwaltung {

    private ArrayList<Kfz> fuhrpark;
    private ArrayList<Mitarbeiter> personalliste;
    private LinkedList<Schichtarbeiter> personallisteSchichtarbeiter;
    private TreeSet<Abteilung> abteilungen;

    public Unternehmensverwaltung(
            ArrayList<Kfz> fuhrpark,
            ArrayList<Mitarbeiter> personalliste,
            LinkedList<Schichtarbeiter> personallisteSchichtarbeiter,
            TreeSet<Abteilung> abteilungen) {
        setFuhrpark(fuhrpark);
        setPersonalliste(personalliste);
        setPersonallisteSchichtarbeiter(personallisteSchichtarbeiter);
        setAbteilungen(abteilungen);
    }


    public ArrayList<Kfz> getFuhrpark() {
        return fuhrpark;
    }

    public void setFuhrpark(ArrayList<Kfz> fuhrpark) {
        this.fuhrpark = fuhrpark;
    }

    public ArrayList<Mitarbeiter> getPersonalliste() {
        return personalliste;
    }

    public void setPersonalliste(ArrayList<Mitarbeiter> personalliste) {
        this.personalliste = personalliste;
    }

    public LinkedList<Schichtarbeiter> getPersonallisteSchichtarbeiter() {
        return personallisteSchichtarbeiter;
    }

    public void setPersonallisteSchichtarbeiter(LinkedList<Schichtarbeiter> personallisteSchichtarbeiter) {
        this.personallisteSchichtarbeiter = personallisteSchichtarbeiter;
    }

    public TreeSet<Abteilung> getAbteilungen() {
        return abteilungen;
    }

    public void setAbteilungen(TreeSet<Abteilung> abteilungen) {
        this.abteilungen = abteilungen;
    }

    // TODO: 06.04.2022 add arbeitstag() and add() + remove() for each collection
}
