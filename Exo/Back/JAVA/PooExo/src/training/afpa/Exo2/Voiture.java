package training.afpa.Exo2;

public class Voiture {
    private String marque;
    private double price;

    //Construct defaut
    public Voiture() {
    }

    public Voiture(String marque, double price) {
        this.marque = marque;
        this.price = price;
    }

    //Getters et Setters
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double pPrice) {
        this.price = pPrice;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String pMarque) {
        this.marque = pMarque;
    }

    //methode afficher
    public void afficher() {
        System.out.println("Marque : " + getMarque());
        System.out.println("Prix : " + getPrice());
    }






}
