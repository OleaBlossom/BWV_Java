package src.VerwaltungPackage;

import src.MitarbeiterPackage.Manager;
import src.MitarbeiterPackage.Mitarbeiter;

import java.util.*;

public class Abteilung {
    private String name;
    private Manager leiter;
    private List<Mitarbeiter> alleMitarbeiter;

    public Abteilung(String name, Manager leiter) {
        setName(name);
        setLeiter(leiter);
        alleMitarbeiter = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getLeiter() {
        return this.leiter;
    }

    public void setLeiter(Manager manager) {
        this.leiter = manager;
    }

    public Manager changeLeiter(Manager newManager) {
        Manager oldManager = this.leiter;
        this.leiter = newManager;
        return oldManager;
    }

    public List<Mitarbeiter> getAlleMitarbeiter() {
        return this.alleMitarbeiter;
    }

    public void addMitarbeiter(Mitarbeiter employee) {
        this.alleMitarbeiter.add(employee);
    }

    public void removeMitarbeiter(Mitarbeiter employee) {
        this.alleMitarbeiter.remove(employee);
    }
}
