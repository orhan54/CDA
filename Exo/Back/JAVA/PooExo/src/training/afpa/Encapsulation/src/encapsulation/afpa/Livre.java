package encapsulation.afpa;

public class Livre {

    //variable
    private String titre, auteur;
    private int nbPages;
    private int nbPagesTotals;
    private double prix;
    boolean prixFixe;

    //constructeur par defaut
    public Livre() {
    }

    //constructeur avec titre auteur et pages
    public Livre(String titre, String auteur, int nbPages) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = nbPages;
    }

    //constructeur avec titre et auteur
    public Livre(String titre, String auteur) {
        this.auteur = auteur;
        this.titre = titre;
    }

    //constructeur pour nombre total de page
    public Livre(int nbPages) {
        this.nbPagesTotals += nbPages;
    }

    //constructeur pour le prix
    public Livre(double prix, String titre) {
        this.prix = prix;
        this.titre = titre;
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

    public double getPrix() {
        return this.prix;
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

    public void setPrix(double prix) {
        if (prix < 0) {
            System.out.println("Impossible de saisir un prix negatif : ");
        } else if (!prixFixe) {
            this.prix = prix;
            prixFixe = true;
        }else{
            System.out.println("Impossible de modifier un prix deja entree : ");
        }
    }



    public void afficher() {
        System.out.println("Titre : " + this.getTitre());
        System.out.println("Auteur : " + this.getAuteur());
        System.out.println("Nombre de Pages : " + this.getNbPages() + " pages");
    }

    public void afficherPrix() {
        System.out.println("Le livre " + this.getTitre() + " coute : " + this.getPrix() + "€");
    }

    public void afficheToi() {
        this.titre = getTitre();
        this.auteur = getAuteur();
        this.nbPages = getNbPages();
    }

    public void nbPagesTotals() {
        this.nbPages += nbPages;
    }


}
