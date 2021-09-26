
import java.util.*;

public class Enseignant extends Utilisateur {

    private int numem;
    private int harpege;

    public Enseignant(String prenom, String nom, String adrpostale, String adrmail, int numem, int harpege) {
        super(prenom, nom, adrpostale, adrmail);
        this.numem = numem;
        this.harpege = harpege;
    }

    public Devoir creerDevoir(String nom, String desc, Date deadline, int nbrPoints) {
        return new Devoir(nom, desc, deadline, nbrPoints);
    }

    public void attribuerNoteRendu(Rendu rendu, int note) {
        rendu.setNote(note);
    }


    public void donnerAvisRendu(Rendu rendu, String avis) {
        rendu.setAvis(avis);
    }


}