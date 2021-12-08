package src.MainPackage;
import src.MitarbeiterPackage.Bueroarbeiter;
import src.MitarbeiterPackage.Manager;
import src.MitarbeiterPackage.Mitarbeiter;
import src.MitarbeiterPackage.Schichtarbeiter;

public class Main {

  public static void main(String[] args) {
    Mitarbeiter myObj = new Mitarbeiter("name", 1);
    System.out.println(myObj.getId());

    Schichtarbeiter myObj2 = new Schichtarbeiter("name", -5005, 25);
    System.out.println(myObj2.getId());

    Bueroarbeiter myObj3 = new Bueroarbeiter("name", 123456789, 8540);
    System.out.println(myObj3.getId());

    Manager myObj4 = new Manager("name", 123456789, 10000, 12.5);
    System.out.println(myObj4.getId());
    System.out.println(myObj4.berechneBonus());
  }
}