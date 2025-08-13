package Model;

import java.util.ArrayList;
import java.util.List;

public class Soigneur extends Personne {

    private int pdm = 3; // attribut que pour le soigneur point de magie

    private static List<Soigneur> soigneurs = new ArrayList<Soigneur>();

    //constructeur pour le Soigneur
    Soigneur(String nom, int ptv, int lvl, String race, String sexe) {
        super(nom, ptv, lvl, race, sexe);
        this.setPdm(pdm);
    }

    //constructeur avec 2 param de la classe mere
    public Soigneur(String nom, String race, String sexe, int pdm) {
        super(nom, race, sexe);
        this.setPdm(pdm);
    }

    public static List<Soigneur> getSoigneurs() {
        return soigneurs;
    }

    //Getters et Setters
    public int getPdm() {
        return this.pdm;
    }

    public void setPdm(int pdm) {
        this.pdm = pdm;
    }

    @Override
    public String toString() {
        return super.toString() + " "
                + this.getPdm();
    }

}
