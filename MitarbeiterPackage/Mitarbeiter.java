package MitarbeiterPackage;/* Erstellen und testen Sie anschließend folgende Klasse MitarbeiterPackage.Mitarbeiter:

o	MitarbeiterPackage.Mitarbeiter IDs sind immer positiv und vierstellig
 */

public class Mitarbeiter
{
    private int id;
    private String name;

    public Mitarbeiter(String $newName, int $newId)
    {
        setId($newId);
        setName($newName);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String $newName)
    {
        name = $newName;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int $newId)
    {
        if ($newId < 0)
        {
            $newId = $newId * -1;
        }

        if ($newId < 1000)
        {
            $newId = $newId + 1000;
        }

        id = $newId;
    }
}