package MitarbeiterPackage;

public class Schichtarbeiter
        extends Mitarbeiter
{

    public Schichtarbeiter(String $newName, int $newId) {
        super($newName, $newId);
        setId($newId);
    }

    @Override
    public void setId(int $newId)
    {
        // todo: implement logic here
    }
}
