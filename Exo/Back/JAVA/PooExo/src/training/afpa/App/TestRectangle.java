package training.afpa.App;

import training.afpa.Exo3.Rectangle;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestRectangle {
    public static void main(String[] args) {

        double longueur;
        double largeur;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez la longueur du rectangle : ");
        longueur = sc.nextDouble();

        System.out.println("Entrez la largeur du rectangle : ");
        largeur = sc.nextDouble();


        Rectangle rectangle = new Rectangle(longueur, largeur);
        rectangle.setLongueur(longueur);
        rectangle.setLargeur(largeur);
        rectangle.surface();
        rectangle.perimetre();
        rectangle.afficher();
        sc.close();

    }
}