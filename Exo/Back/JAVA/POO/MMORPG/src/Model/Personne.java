package Model;

public class Personne {

    //attributs de Personne
    private String nom;
    private int ptv = 100;
    private int lvl = 1;
    private String sexe;

    //constructeur de Personne
    public Personne(String nom, int ptv, int lvl, String sexe) {
        try{
            this.nom = nom;
            this.ptv = ptv;
            this.lvl = lvl;
            this.sexe = sexe;
        }catch (Exception e){
            System.out.println("Erreur sur la classe mere Personne");
        }

    }

    //constructeur avec 2 param
    public Personne(String nom, String sexe) {
        try{
            this.nom = nom;
            this.sexe = sexe;
        }catch (Exception e){
            System.out.println("Erreur sur la classe Personne");
        }

    }

    //Getters et Setters
    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPtv() {
        return this.ptv;
    }

    public void setPtv(int ptv) {
        this.ptv = ptv;
    }

    public int getLvl() {
        return this.lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getSexe() {
        return this.sexe;
    }

    @Override
    public String toString() {
        StringBuilder personne = new StringBuilder();
        personne.append("Nom : ").append(this.nom).append("\n");
        personne.append("Ptv : ").append(this.ptv).append("\n");
        personne.append("Lvl : ").append(this.lvl).append("\n");
        personne.append("Sexe : ").append(this.sexe).append("\n");

        return personne.toString();
    }

}
