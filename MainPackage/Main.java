package MainPackage;
import MitarbeiterPackage.Mitarbeiter;

public class Main {

  public static void main(String[] args) {
    Mitarbeiter myObj = new Mitarbeiter("name", 1);
    myObj.setId(15);
    System.out.println(myObj.getId());
  }
}