import java.util.*;

public class Devoir {

    public String nom;
    public String desc;
    public Date deadline;
    public int nbrPoints;

    public Devoir(String nom, String desc, Date deadline, int nbrPoints) {
        this.nom = nom;
        this.desc = desc;
        this.deadline = deadline;
        this.nbrPoints = nbrPoints;
    }

    public int afficherPoints() {
        return nbrPoints;
    }

}