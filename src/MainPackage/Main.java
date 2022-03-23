package src.MainPackage;

import src.GpsPackage.Gps;
import src.KfzPackage.*;
import src.MitarbeiterPackage.*;
import src.VerwaltungPackage.Abteilung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.Math.round;
import static java.util.Collections.*;

public class Main {

    public static void main(String[] args) {
        testMitarbeiter();
    }

    public static void testKfz() {
        System.out.println("\n\n");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Kfz Section");
        System.out.println("---------------------------------------------------------------");
        System.out.println("\n");

        Gps london = new Gps(51.58, -0.11);

        Lkw truck1 = new Lkw(80, london, 13.6);
        Lkw truck2 = new Lkw(80, london, 13.6);
        Lkw truck3 = new Lkw(80, london, 13.6);
        Lkw truck4 = new Lkw(80, london, 13.6);

        ArrayList<Lkw> listOfTrucks = new ArrayList<>();
        listOfTrucks.add(truck1);
        listOfTrucks.add(truck2);
        listOfTrucks.add(truck3);
        listOfTrucks.add(truck4);

        for (Lkw truck : listOfTrucks) {
            Random r = new Random();
            double d = r.nextInt(13) + ((double) r.nextInt(6) / 10);

            truck.beladen(d);
            int roundedPercent = (int) round(truck.auslastungBerechnen() * 100);
            System.out.println(roundedPercent);
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("sorting ...");
        System.out.println("---------------------------------------------------------------");

        sort(listOfTrucks);

        for (Kfz vehicle : listOfTrucks) {
            int roundedPercent = (int) round(vehicle.auslastungBerechnen() * 100);
            System.out.println(roundedPercent);
        }
    }

    public static void testMitarbeiter() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("Mitarbeiter Section");
        System.out.println("---------------------------------------------------------------");
        System.out.println("\n");
        Bueroarbeiter firstEmployee = new Bueroarbeiter("First Employee", 5000, 25000);
        System.out.println(firstEmployee);

        Schichtarbeiter shiftWorker = new Schichtarbeiter("Shift Worker", 3005, 25);
        shiftWorker.setAnzahlStunden(20);
        System.out.println(shiftWorker);

        Bueroarbeiter officeWorker = new Bueroarbeiter("Office Worker", 5001, 8540);
        System.out.println(officeWorker);

        Manager managerPerson = new Manager("Manager Person", 5999, 100000, 12.5);
        System.out.println(managerPerson);

        ArrayList<Mitarbeiter> listOfMitarbeiter = new ArrayList<>();
        listOfMitarbeiter.add(firstEmployee);
        listOfMitarbeiter.add(shiftWorker);
        listOfMitarbeiter.add(officeWorker);
        listOfMitarbeiter.add(managerPerson);

        System.out.println(listOfMitarbeiter);

        Mitarbeiter.IncomeComparator comparator = new Mitarbeiter.IncomeComparator();

        sort(listOfMitarbeiter);
        System.out.println("---------------------------------------------------------------");
        System.out.println("sorting by name ...");
        System.out.println("---------------------------------------------------------------");
        System.out.println(listOfMitarbeiter);

        listOfMitarbeiter.sort(comparator);
        System.out.println("---------------------------------------------------------------");
        System.out.println("sorting by income ...");
        System.out.println("---------------------------------------------------------------");
        System.out.println(listOfMitarbeiter);

        System.out.println("\n\n");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Abteilung Section");
        System.out.println("---------------------------------------------------------------");
        System.out.println("\n");

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
    }

    public static void printEmployeesOfAbteilung(Abteilung abteilung) {
        String output = "";

        for (Mitarbeiter mitarbeiter : abteilung.getAlleMitarbeiter()) {
            output += mitarbeiter + ")\n";
        }
        System.out.println((output));
    }
}