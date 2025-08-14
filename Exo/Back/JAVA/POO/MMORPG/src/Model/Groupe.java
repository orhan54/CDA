package Model;

import java.util.ArrayList;
import java.util.List;

public class Groupe {

    private String nom;
    private Guerrier guerrier;
    private Voleur voleur;
    private Soigneur soigneur;

    private static List<Groupe> groupes = new ArrayList<Groupe>();

    public Groupe(String nom, String guerrier, String voleur, String soigneur) {
        try{
            this.nom = nom;
            this.guerrier = getGuerrier(nom);
            this.voleur = getVoleur(nom);
            this.soigneur = getSoigneur(nom);
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

    public Guerrier getGuerrier(String nom) {
        return this.guerrier;
    }

    public void setGuerrier(Guerrier guerrier) {
        this.guerrier = guerrier;
    }

    public Voleur getVoleur(String nom) {
        return this.voleur;
    }

    public void setVoleur(Voleur voleur) {
        this.voleur = voleur;
    }

    public Soigneur getSoigneur(String nom) {
        return this.soigneur;
    }

    public void setSoigneur(Soigneur soigneur) {
        this.soigneur = soigneur;
    }

    @Override
    public String toString() {
        this.setNom(this.nom);
        this.setGuerrier(this.guerrier);
        this.setVoleur(this.voleur);
        this.setSoigneur(this.soigneur);
        return this.nom;
    }
}
