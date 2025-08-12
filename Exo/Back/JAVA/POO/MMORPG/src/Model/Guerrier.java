package Model;

import java.util.ArrayList;
import java.util.List;

public class Guerrier extends Personne{

    // attribut avec point de force du guerrier
    private int pdf = 3;

    //mon tableau pour enregister les guerriers
    private static List<Guerrier> guerriers = new ArrayList<>();

    //construteur du gerrier
    public Guerrier(String nom, int ptv, int lvl, String sexe) {
        super(nom, ptv, lvl, sexe);
        this.setPdf(pdf);
    }

    //constructeur avec 2 param de la classe mere
    public Guerrier(String nom, String sexe, int pdf) {
        super(nom, sexe);
        this.setPdf(pdf);
    }

    public static List<Guerrier> getGuerriers() {
        return guerriers;
    }

    //Getters et Setters
    public int getPdf() {
        return this.pdf;
    }

    public void setPdf(int pdf) {
        this.pdf = pdf;
    }

    @Override
    public String toString() {
        return super.toString() + " "
                + this.getPdf();
    }
}
