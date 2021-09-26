
import java.util.*;

public class Enseignant extends Utilisateur {

    private int numem;
    private int harpege;

    public Enseignant(String prenom, String nom, String adrpostale, String adrmail, int numem, int harpege) {
        super(prenom, nom, adrpostale, adrmail);
        this.numem = numem;
        this.harpege = harpege;
    }

    public void creerDevoir() {
        ;
    }

    public void attribuerRendu(Rendu rendu) {
        // TODO implement here
    }


    public void donnerAvisRendu(Rendu rendu) {
        // TODO implement here
    }


}