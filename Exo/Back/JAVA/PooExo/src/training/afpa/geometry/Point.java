package training.afpa.geometry;

public class Point {

    // les attributs abscisse et ordonnee
    private double abscisse;
    private double ordonnee;

    public Point(double abscisse, double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }


    public double getAbscisse() {
        return this.abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonnee() {
        return this.ordonnee;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }



}
