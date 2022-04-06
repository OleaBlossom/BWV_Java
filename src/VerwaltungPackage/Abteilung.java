package src.VerwaltungPackage;

import src.MitarbeiterPackage.Manager;
import src.MitarbeiterPackage.Mitarbeiter;

import java.util.*;

public class Abteilung {
    private String name;
    private Manager leiter;
    private ArrayList<Mitarbeiter> alleMitarbeiter;

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

    public String gehaltsliste() {
        StringBuilder output = new StringBuilder();
        Manager manager = getLeiter();
        output.append("Leiter: \n");
        output.append(manager.getName()).append(", ").append(manager.einkommen()).append("\n");
        output.append("Mitarbeiter: \n");
        for (Mitarbeiter mitarbeiter : getAlleMitarbeiter()) {
            output.append(mitarbeiter.getName()).append(", ").append(mitarbeiter.einkommen()).append("\n");
        }

        return output.toString();
    }
}
