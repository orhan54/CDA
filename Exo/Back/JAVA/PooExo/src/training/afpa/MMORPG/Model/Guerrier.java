package training.afpa.MMORPG.Model;

import java.util.ArrayList;

public class Guerrier extends Personnage{

    //variable du Guerrier
    int force = 3;
    int defense = 10;

    //constructeur Guerrier qui extends de Personnage
    public Guerrier(String nom, int lvl, int pdv, Classe classe, Race race, int force, int defense) {
        super(nom, lvl, pdv, classe, race);
        this.force = force;
        this.defense = defense;
    }

    //ArrayList des Guerriers
    ArrayList<String> guerrier = new ArrayList<String>(); // tab de tout les guerriers stocker

    //Getters et Setters de la specialisation guerrier
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
