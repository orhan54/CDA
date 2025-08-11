package training.afpa.MMORPG.Model;

public class Classe {

    //variable de classe
    private String classe;
    private String armes;
    private String armures;

    //constructeur de la classe avec les 3 parametres
    Classe(String classe, String armes, String armures) {
        this.setClasse(classe);
        this.setArmes(armes);
        this.setArmures(armures);
    }

    //Getters et Setters
    public String getClasse() {
        return this.classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getArmes() {
        return this.armes;
    }

    public void setArmes(String armes) {
        this.armes = armes;
    }

    public String getArmures() {
        return this.armures;
    }

    public void setArmures(String armures) {
        this.armures = armures;
    }


}
