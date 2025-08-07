package encapsulation.afpa;

public class Livre {

    //variable
    private String titre, auteur;
    private int nbPages;
    private int nbPagesTotals;

    //constructeur par defaut
    public Livre() {
    }

    //constructeur
    public Livre(String titre, String auteur, int nbPages) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = nbPages;
    }

    //constructeur pour nombre total de page
    public Livre(int nbPages) {
        this.nbPagesTotals += nbPages;
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

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public void afficher() {
        System.out.println("Titre : " + this.getTitre());
        System.out.println("Auteur : " + this.getAuteur());
        System.out.println("Nombre de Pages : " + this.getNbPages());
    }

    public void nbPagesTotals() {
        this.nbPages += nbPages;
    }


}
