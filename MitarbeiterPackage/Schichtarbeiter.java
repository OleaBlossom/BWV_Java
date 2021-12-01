package MitarbeiterPackage;

public class Schichtarbeiter
        extends Mitarbeiter
{

    public Schichtarbeiter(String $newName, int $newId) {
        super($newName, $newId);
        validateId();
    }

    private void validateId() {
        int $currentId = this.getId();

        $currentId %= 1000;

        super.setId($currentId + 3000);
    }
}
