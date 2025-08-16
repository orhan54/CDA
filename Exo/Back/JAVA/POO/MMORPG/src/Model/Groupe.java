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
            this.guerrier = new Guerrier(guerrier);
            this.voleur = new Voleur(voleur);
            this.soigneur = new Soigneur(soigneur);
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
        return "Groupe: " + nom + "\n" +
                "Guerrier: " + guerrier + "\n" +
                "=====================================================================" + "\n" +
                "Voleur: " + voleur + "\n" +
                "=====================================================================" + "\n" +
                "Soigneur: " + soigneur + "\n" +
                "=====================================================================";
    }
}
