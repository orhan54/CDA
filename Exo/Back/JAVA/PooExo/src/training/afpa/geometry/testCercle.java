package training.afpa.geometry;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class testCercle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Abscisse du centre du cercle : ");
        double abscisse = sc.nextDouble();
        System.out.println("Ordonnee du centre du cercle : ");
        double ordonnee = sc.nextDouble();
        Point centre = new Point(abscisse, ordonnee);
        System.out.println("Rayon du cercle : ");
        double rayon = sc.nextDouble();
        Cercle cercle = new Cercle(centre, rayon);
        cercle.afficher();
        System.out.println("** Test d'appartenance au cercle **");
        System.out.println("Abscisse du point à tester : ");
        double abscissePoint = sc.nextDouble();
        System.out.println("Ordonnee du point à tester : ");
        double ordonneePoint = sc.nextDouble();
        Point test =  new Point(abscissePoint, ordonneePoint);
        cercle.testAppartenance(test);

    }
}