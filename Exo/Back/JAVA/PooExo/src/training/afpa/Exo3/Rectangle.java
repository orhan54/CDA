package training.afpa.Exo3;

import java.util.Scanner;

public class Rectangle {

    //les attributs
    private double longueur;
    private double largeur;
    private double surface;
    private double perimetre;

    // Scanner pour lecture clavier
    Scanner sc = new Scanner(System.in);

    // construct avec 2 parametres
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Getters et Setters
    public double getLongueur() {
        return this.longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return this.largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    // methode pour calcul de surface
    public void surface() {
        surface = this.getLongueur() * this.getLargeur();
    }

    // methode pour calcul de perimetre
    public void perimetre() {
        perimetre = (this.getLongueur() + this.getLargeur()) * 2;
    }

    // methode pour afficher
    public void afficher() {
        System.out.println("Surface d'un rectangle de " + getLongueur() + " de longueur et " + getLargeur() + " de largeur est de : " + surface);
        System.out.println("Perimetre d'un rectangle de " + getLongueur() + " de longueur et " + getLargeur() + " de largeur est de : " + perimetre);
    }





}
