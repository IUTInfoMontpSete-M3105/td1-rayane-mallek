
import java.util.*;

/**
 * 
 */
public class Rendu {

    public String avis;
    public int note;

    public Rendu() {
        ; // le rendu est vide à sa création, la note et l'avis sera donnée grâce aux méthodes dans Enseignant
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setAvis(String avis){
        this.avis = avis;
    }
}