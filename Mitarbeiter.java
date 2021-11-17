/* Erstellen und testen Sie anschließend folgende Klasse Mitarbeiter:

getter and setter for each property
toString */

public class Mitarbeiter
{
    private int id;
    private String name;

    public Mitarbeiter(String $newName, int $newId)
    {
        setId($newId)
    }

    public String getName()
    {
        return name;
    }

    public void setName(String $newName)
    {
        name = $newName;
    }

    public int getId() {
        return id;
    }

    public void setId( int $newId) {
        id = $newId;
    }
}