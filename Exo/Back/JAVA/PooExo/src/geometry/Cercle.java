package geometry;

import java.util.Scanner;

public class Cercle {

    int centrePoint;
    double rayon;

    //construct du cercle
    public Cercle(int centrePoint, double rayon) {
        this.centrePoint = centrePoint;
        this.rayon = rayon;
    }

    // methode pour calculer perimetre
    public double perimetre() {
        return centrePoint + rayon;
    }

    public double surface() {
        int rayon;
        double surface, pi=3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Rayon: ");
        rayon = input.nextInt();
        surface = pi * rayon * rayon;
        System.out.println("Surface du cercle : " + surface);
        return surface;
    }

    // test si le point appartient aub cercle ou non
    public void testAppartenance() {

    }

    public void afficher() {

    }



}
