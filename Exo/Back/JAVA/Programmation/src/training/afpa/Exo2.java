package training.afpa;

import java.util.Scanner;

public class Exo2 {

    // Calcule la moyenne des éléments du tableau
    public int calculerMoyenne(int[] tableau) {
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        return somme / tableau.length;
    }

    public void remplirTab() {
        int taille = 10;
        int[] tableau = new int[taille];
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir 10 valeurs positives :");

        // Remplir le tableau avec des saisies utilisateur
        for (int i = 0; i < taille; i++) {
            int saisie;
            do {
                System.out.print("Valeur " + (i + 1) + " : ");
                saisie = sc.nextInt();
                if (saisie < 0) {
                    System.out.println("Erreur : la valeur doit être positive.");
                }
            } while (saisie < 0);

            tableau[i] = saisie;
        }

        // Afficher les valeurs du tableau
        System.out.print("Valeurs saisies : ");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();

        // Calculer et afficher la moyenne
        int moyenne = calculerMoyenne(tableau);
        System.out.println("La moyenne des valeurs dans le tableau est : " + moyenne);
    }

}
