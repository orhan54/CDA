package geometry;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class testCercle {
    public static void main(String[] args) {

        int centrePoint = 0;
        double rayon = 0;

        Point point = new Point(centrePoint, rayon);
        point.setAbscisse(centrePoint);
        point.setOrdonnee(rayon);
        Cercle cercle = new Cercle(centrePoint, rayon);
        cercle.surface();

    }
}