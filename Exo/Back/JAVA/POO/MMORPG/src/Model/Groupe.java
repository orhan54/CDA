package Model;

import java.util.ArrayList;
import java.util.List;

public class Groupe {

    private String nom;
    private Guerrier guerrier;
    private Voleur voleur;
    private Soigneur soigneur;

    private static List<Groupe> groupes = new ArrayList<Groupe>();

    public Groupe(String nom, Guerrier guerrier,  Voleur voleur, Soigneur soigneur) {
        try{
            this.nom = nom;
            this.guerrier = guerrier;
            this.voleur = voleur;
            this.soigneur = soigneur;
        }catch(Exception e){
            System.out.println("Erreur Groupe "+e.getMessage());
        }
    }

    //Getters et Setters


    public static List<Groupe> getGroupes() {
        return groupes;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Guerrier getGuerrier() {
        return this.guerrier;
    }

    public void setGuerrier(Guerrier guerrier) {
        this.guerrier = guerrier;
    }

    public Voleur getVoleur() {
        return this.voleur;
    }

    public void setVoleur(Voleur voleur) {
        this.voleur = voleur;
    }

    public Soigneur getSoigneur() {
        return this.soigneur;
    }

    public void setSoigneur(Soigneur soigneur) {
        this.soigneur = soigneur;
    }
}
