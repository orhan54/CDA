package training.afpa.MMORPG.Model;

public class Arme {

    //variables de l'arme
    String nom;
    String qualite;
    int attaque;
    int defense;
    int critique;

    //constructeur de l'arme avec les 4 parametres
    public Arme(String nom, String qualite, int attaque, int defense, int critique) {
        this.setNom(nom);
        this.setQualite(qualite);
        this.setAttaque(attaque);
        this.setDefense(defense);
        this.setCritique(critique);
    }

    //Getters et Setters
    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getQualite() {
        return this.qualite;
    }
    public void setQualite(String qualite) {
        this.qualite = qualite;
    }

    public int getAttaque() {
        return this.attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getCritique() {
        return this.critique;
    }

    public void setCritique(int critique) {
        this.critique = critique;
    }


}
