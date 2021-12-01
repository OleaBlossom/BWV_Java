package MainPackage;
import MitarbeiterPackage.Mitarbeiter;
import MitarbeiterPackage.Schichtarbeiter;

public class Main {

  public static void main(String[] args) {
    Mitarbeiter myObj = new Mitarbeiter("name", 1);
    System.out.println(myObj.getId());

    Schichtarbeiter myObj2 = new Schichtarbeiter("name", 1);
    System.out.println(myObj2.getId());
  }
}