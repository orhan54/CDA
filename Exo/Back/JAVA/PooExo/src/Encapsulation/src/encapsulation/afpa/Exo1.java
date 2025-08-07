package encapsulation.afpa;

public class Exo1 {

    //variable
    private String titre, auteur;
    private int nbPages;


    //constructeur
    public Exo1(String titre, String auteur, int nbPages) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = nbPages;
    }

    //Accesseur
    public String getTitre() {
        return this.titre;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public int getNbPages() {
        return this.nbPages;
    }


    //Modificatgeur
    public void setTitre(String pTitre) {
        this.titre = pTitre;
    }

    public void setAuteur(String pAuteur) {
        this.auteur = pAuteur;
    }

    public void setNbPages(int pNbPages) {
        this.nbPages = pNbPages;
    }

    public void afficher() {
        System.out.println("Titre : " + this.getTitre());
        System.out.println("Auteur : " + this.getAuteur());
        System.out.println("Nombre de Pages : " + this.getNbPages());
    }


}
