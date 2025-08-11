package training.afpa.MMORPG.Model;

import java.util.ArrayList;

public class Voleur extends Personnage {
    //variable Voleur
    int force = 5;
    int defense = 4;
    int agilite = 8;

    //constructeur du voleur qui extends du Personnage
    public Voleur(String nom, int lvl, int pdv, Classe classe, Race race, int force, int defense, int agilite) {
        super(nom, lvl, pdv, String.valueOf(classe), race);
        this.force = force;
        this.defense = defense;
        this.agilite = agilite;
    }

    //ArrayList des Voleurs
    ArrayList<String> voleur = new ArrayList<String>(); // tab de tout les voleurs stocker

    //getters et Setters
    int getForce() {
        return this.force;
    }

    int getDefense() {
        return this.defense;
    }

    int getAgilite() {
        return this.agilite;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }
}
