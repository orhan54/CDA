package training.afpa.MMORPG.Model;

import java.util.ArrayList;

public class Soigneur extends Personnage {
    //stats Soigneur
    int force = 3;
    int defense = 2;

    //constructeur qui extends de Personnage
    public Soigneur(String nom, int lvl,  int pdv, Classe classe, Race race, int force, int defense) {
        super(nom, lvl, pdv, classe, race);
        this.force = force;
        this.defense = defense;
    }

    //ArrayList des Soigneurs
    ArrayList<String> soigneur = new ArrayList<String>(); // tab de tout les soigneurs stocker

    int getForce() {
        return this.force;
    }

    int getDefense() {
        return this.defense;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
