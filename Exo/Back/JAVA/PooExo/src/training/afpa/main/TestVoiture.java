package training.afpa.main;

import training.afpa.Exo2.Voiture;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestVoiture {
    public static void main(String[] args) {

        double prix;
        String marque;

        // creation d'une instance voiture
        //Voiture voiture = new Voiture();
        // creation du scanner de lecture clavier
        Scanner sc = new Scanner(System.in);

        // demande de la marque
        System.out.println("Saisir marque de la voiture : ");
        // set la marque
        //voiture.setMarque(sc.next());
        marque = sc.nextLine();

        // demande du prix
        System.out.println("Saisir prix de la voiture : ");
        // set du prix
        //voiture.setPrice(sc.nextDouble());
        prix = sc.nextDouble();

        // affichage
        Voiture voiture = new Voiture(marque, prix);
        voiture.afficher();
    }
}