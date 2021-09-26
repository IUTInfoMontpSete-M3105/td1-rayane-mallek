
import java.util.*;

/**
 *
 */
public class Etudiant extends Utilisateur {

    private String numINE;

    public Etudiant(String prenom, String nom, String adrpostale, String adrmail, String numINE) {
        super(prenom, nom, adrpostale, adrmail);
        this.numINE = numINE;
    }

    public Cours download() {
        // TODO implement here
        return null;
    }

    public Cours follow() {
        // TODO implement here
        return null;
    }

}