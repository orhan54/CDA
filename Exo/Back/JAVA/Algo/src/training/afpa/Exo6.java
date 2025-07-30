
package training.afpa;

import java.util.Scanner;

public class Exo6 {

    // Correction : méthode avec un paramètre
    public int CalculFactorielle(int n) {
        int resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }
        return resultat;
    }

    public void remplissageTab() {
        int[][] tabFactorielle = new int[2][10];
        int resultat;
        int x;

        // Remplissage de la première ligne du tableau (nombres de 1 à 10)
        for (int i = 0; i < 10; i++) {
            tabFactorielle[0][i] = i + 1;
        }

        // Remplissage de la deuxième ligne du tableau (factorielles de 1 à 10)
        for (int i = 0; i < 10; i++) {
            tabFactorielle[1][i] = CalculFactorielle (i + 1);
        }

        // Lecture de la valeur entrée par l'utilisateur
        System.out.print("Pour quelle valeur entière souhaitez-vous la factorielle ? (entre 1 et 10) : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        if (x < 1 || x > 10) {
            System.out.println("Erreur : x doit être compris entre 1 et 10.");
        } else {
            resultat = tabFactorielle[1][x -1];
            System.out.println("La factorielle de " + x + " est : " + resultat);
        }
    }
}