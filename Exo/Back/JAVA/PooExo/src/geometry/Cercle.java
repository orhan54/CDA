package geometry;

import java.util.Scanner;

public class Cercle {

    Point centrePoint;
    double rayon;

    //construct du cercle
    public Cercle(Point centrePoint, double rayon) {
        this.centrePoint = centrePoint;
        this.rayon = rayon;
    }

    // methode pour calculer perimetre
    public double perimetre() {
        return 2 * Math.PI * this.rayon;
    }

    public double surface() {
        double surface;
        surface = Math.PI * this.rayon * this.rayon;
        return surface;
    }

    // test si le point appartient aub cercle ou non
    public void testAppartenance(Point p) {
        double diffAbscisse = this.centrePoint.getAbscisse() - p.getAbscisse();
        double diffOrdonnee = this.centrePoint.getOrdonnee() - p.getOrdonnee();
        double dist = Math.sqrt(diffAbscisse * diffAbscisse + diffOrdonnee * diffOrdonnee);
        if(dist <= this.rayon) {
            System.out.println("Le point (" + p.getAbscisse() + ", " + p.getOrdonnee() + ") appartient au cercle ");
        }else {
            System.out.println("Le point (" + p.getAbscisse() + ", " + p.getOrdonnee() + ") n'appartient pas au cercle ");
        }
    }

    public void afficher() {
        System.out.println("Cercle de centre (" + this.centrePoint.getAbscisse() + ", " + this.centrePoint.getOrdonnee() + ") et de rayon " + this.rayon);
        System.out.println("Perimetre du cercle : " + this.perimetre());
        System.out.println("Surface du cercle : " + this.surface());
    }



}
