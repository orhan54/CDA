package training.afpa;

import java.util.Scanner;

public class Exo2 {

    Scanner sc = new Scanner(System.in);

    public void factoTantQue() {
        System.out.print("Saisir un nombre entier pour la factorielle : ");

        // bloc variables
        int valeurSaisie;
        int resultat = 1;
        valeurSaisie = sc.nextInt();
        int compteur = valeurSaisie;

        if(valeurSaisie == 0 || valeurSaisie == 1) {
            System.out.println("La factorielle de " + valeurSaisie + " est : " + resultat);
        } else {
            while (compteur > 1) {
                resultat = resultat * compteur;
                compteur--;
            }
            System.out.println("La factorielle de " + valeurSaisie + " est : " + resultat);
        }
    }

    public void factoRepeter() {
        System.out.print("Saisir un nombre entier pour la factorielle avec repeter : ");

        //bloc variable et initialisation
        int valeurSaisie;
        int resultat = 1;
        int compteur;

        valeurSaisie = sc.nextInt();
        compteur = valeurSaisie;

        if (valeurSaisie == 0 || valeurSaisie == 1) {
            System.out.println("La factorielle de " + valeurSaisie + " est : " + resultat);
        }else{
            do {
                resultat = resultat * compteur;
                compteur--;
            }while(compteur > 1);
        }
        System.out.println("La factorielle de " + valeurSaisie + " est : " + resultat);
    }

    public void factoPour() {
        System.out.print("Saisir un nombre entier pour la factorielle avec la boucle Pour : ");
        int valeurSaisie;
        int resultat = 1;
        int compteur;

        valeurSaisie = sc.nextInt();
        compteur = valeurSaisie;

        if (valeurSaisie == 0 || valeurSaisie == 1) {
            System.out.println("La factorielle de " + valeurSaisie + " est : " + resultat);
        }else {
            for (int i = 0; i <= (compteur+1); i++) {
                resultat = resultat * compteur;
                compteur--;
            }
        }
        System.out.println("Le resultat avec pour est : " + resultat);
    }
}
