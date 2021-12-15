package src.MainPackage;

import src.MitarbeiterPackage.Bueroarbeiter;
import src.MitarbeiterPackage.Manager;
import src.MitarbeiterPackage.Mitarbeiter;
import src.MitarbeiterPackage.Schichtarbeiter;
import src.VerwaltungPackage.Abteilung;

public class Main {

    public static void main(String[] args) {
        System.out.println("Mitarbeiter Section");
        Bueroarbeiter myObj = new Bueroarbeiter("First Employee", 1, 25000);
        System.out.println(myObj);

        Schichtarbeiter myObj2 = new Schichtarbeiter("Shift Worker", -5005, 25);
        myObj2.setAnzahlStunden(20);
        System.out.println(myObj2);

        Bueroarbeiter myObj3 = new Bueroarbeiter("Office Worker", 123456789, 8540);
        System.out.println(myObj3);

        Manager myObj4 = new Manager("Manager Person", 123456789, 10000, 12.5);
        System.out.println(myObj4);

        System.out.println("\n\nAbteilung Section");

        Abteilung myObj5 = new Abteilung("department", myObj4);
        System.out.println(myObj5.getLeiter());
        System.out.println(myObj5.getAlleMitarbeiter());
        myObj5.addMitarbeiter(myObj);
        myObj5.addMitarbeiter(myObj2);
        myObj5.addMitarbeiter(myObj3);
        printEmployeesOfAbteilung(myObj5);
        myObj5.removeMitarbeiter(myObj2);
        printEmployeesOfAbteilung(myObj5);


        System.out.println(myObj5.gehaltsliste());
    }

    public static void printEmployeesOfAbteilung(Abteilung abteilung) {
        String output = "";

        for (Mitarbeiter mitarbeiter : abteilung.getAlleMitarbeiter()) {
            output += mitarbeiter + ")\n";
        }
        System.out.println((output));
    }
}