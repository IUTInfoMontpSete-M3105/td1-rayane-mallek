
import java.util.*;

public class Utilisateur {

    private String nom;
    private String prenom;
    private String adrpost;
    private String adrmail;

    public Utilisateur(String prenom, String nom, String adrpost, String adrmail) {
        this.prenom = prenom;
        this.nom = nom;
        this.adrpost = adrpost;
        this.adrmail = adrmail;
    }



    /**
     * @return
     */
    public void consulterNotes(Rendu r) {
        r.getNote();
    }

    /**
     * @return
     */
    public void consulterDevoirs(Devoir d) {
        return;
    }

    /**
     * @return
     */
    public Cours consulterCours() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int afficherPoints() {
        // TODO implement here
        return 0;
    }

}