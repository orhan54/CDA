package training.afpa.MMORPG.Model;

public class Personnage {

    //variable
    private String nom;
    private int lvl = 1;
    private int pdv = 100;
    private String Classe;
    private String Race;

    //constructeur d'un personnage
    public Personnage(String nom, int lvl, int pdv, String Classe, Race Race) {
        this.setNom(nom);
        this.setLvl(lvl);
        this.setPdv(pdv);
        this.setClasse(String.valueOf(Classe));
        this.setRace(String.valueOf(Race));
    }

    //Getters et Setters des parametres du constructeur
    String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getLvl() {
        return this.lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
        int exp = 100;
        for (int i = 1; i < exp; i++) {
            this.lvl += 1;
        }
    }

    public int getPdv() {
        return this.pdv;
    }

    public void setPdv(int pdv) {
        this.pdv = pdv;
    }

    public String getClasse() {
        return this.Classe;
    }

    public void setClasse(String Classe) {
        this.Classe = Classe;
    }

    public String getRace() {
        return this.Race;
    }

    public void setRace(String Race) {
        this.Race = Race;
    }

    @Override
    public String toString() {
        return "Je m'appelle " + getNom() + " voici mon level " + getLvl() + ", j'ai pas beaucoup de point de vie " + getPdv() + " et je joue la classe " + getClasse();
    }

}
