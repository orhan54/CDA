package training.afpa;

import java.util.Scanner;

public class Exo1 {

    // leture de scanner pour les 3 fonctions suivante !!
    Scanner sc = new Scanner(System.in);

    public void calculTantque() {

        System.out.print("Saisir un nombre entier : ");

        //bloc variable et initialisation
        int valeurSaisie = sc.nextInt();
        int resultat = 0;
        int compteur = 1;

        while (compteur <= valeurSaisie) {
            resultat = resultat + compteur;
            compteur++;
        }

        System.out.println("Resultat avec tantque est : " + resultat);
        sc.close();
    }

    public void calculDoWhile() {

        System.out.print("Saisir un nombre entier : ");

        //bloc variable et initialisation
        int valeurSaisie = sc.nextInt();
        int resultat = 0;
        int compteur = 1;

        do {

            resultat = resultat + compteur;
            compteur++;
        } while (compteur <= valeurSaisie);

        System.out.println("Resultat avec jusqu'a est : " + resultat);
        sc.close();
    }

    public void calculFor() {

        System.out.print("Saisir un nombre entier : ");

        //bloc variable et initialisation
        int resultat = 0;
        int valeurSaisie = sc.nextInt();

        for (int i = 0; i <= valeurSaisie; i++) {
            resultat = resultat + i;
        }

        System.out.println("Resultat avec pour est : " + resultat);
    }

}