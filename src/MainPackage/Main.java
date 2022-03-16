package src.MainPackage;

import src.MitarbeiterPackage.Bueroarbeiter;
import src.MitarbeiterPackage.Manager;
import src.MitarbeiterPackage.Mitarbeiter;
import src.MitarbeiterPackage.Schichtarbeiter;
import src.VerwaltungPackage.Abteilung;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Mitarbeiter Section");
        Bueroarbeiter firstEmployee = new Bueroarbeiter("First Employee", 5000, 25000);
        System.out.println(firstEmployee);

        Schichtarbeiter shiftWorker = new Schichtarbeiter("Shift Worker", 3005, 25);
        shiftWorker.setAnzahlStunden(20);
        System.out.println(shiftWorker);

        Bueroarbeiter officeWorker = new Bueroarbeiter("Office Worker", 5001, 8540);
        System.out.println(officeWorker);

        Manager managerPerson = new Manager("Manager Person", 5999, 100000, 12.5);
        System.out.println(managerPerson);

        System.out.println("\n\nAbteilung Section");

        Abteilung onlyDepartment = new Abteilung("only department", managerPerson);
        System.out.println(onlyDepartment.getLeiter());
        System.out.println(onlyDepartment.getAlleMitarbeiter());
        onlyDepartment.addMitarbeiter(firstEmployee);
        onlyDepartment.addMitarbeiter(shiftWorker);
        onlyDepartment.addMitarbeiter(officeWorker);
        printEmployeesOfAbteilung(onlyDepartment);
        onlyDepartment.removeMitarbeiter(shiftWorker);
        printEmployeesOfAbteilung(onlyDepartment);


        System.out.println(onlyDepartment.gehaltsliste());

        ArrayList<Mitarbeiter> listOfMitarbeiter = new ArrayList<>();
        listOfMitarbeiter.add(firstEmployee);
        listOfMitarbeiter.add(shiftWorker);
        listOfMitarbeiter.add(officeWorker);
        listOfMitarbeiter.add(managerPerson);

        System.out.println(listOfMitarbeiter);

        sort(listOfMitarbeiter);

        System.out.println(listOfMitarbeiter);

    }

    public static void printEmployeesOfAbteilung(Abteilung abteilung) {
        String output = "";

        for (Mitarbeiter mitarbeiter : abteilung.getAlleMitarbeiter()) {
            output += mitarbeiter + ")\n";
        }
        System.out.println((output));
    }
}