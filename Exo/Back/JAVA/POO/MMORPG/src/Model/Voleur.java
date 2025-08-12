package Model;

import java.util.ArrayList;
import java.util.List;

public class Voleur extends Personne {

    //attribut du voleur
    private int pagi = 3; // point agilite du voleur

    public static List<Voleur> voleurs = new ArrayList<Voleur>();

    public Voleur(String nom, int ptv, int lvl, String sexe, int pagi) {
        super(nom, ptv, lvl, sexe);
        this.setPagi(pagi);
    }

    // constructeur avec 2 parame de la classe mere
    public Voleur(String nom, String sexe, int pagi) {
        super(nom, sexe);
        this.setPagi(pagi);
    }

    public static List<Voleur> getVoleurs() {
        return voleurs;
    }

    //Setters et Getters
    public int getPagi() {
        return this.pagi;
    }

    public void setPagi(int pagi) {
        this.pagi = pagi;
    }

    @Override
    public String toString() {
        return super.toString() + " "
                + this.getPagi();
    }

}
