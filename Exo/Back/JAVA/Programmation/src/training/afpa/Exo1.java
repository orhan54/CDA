package training.afpa;

import java.util.Random;

public class Exo1 {

    // Lire le max d’un tableau
    public int lireMaxTabEntier(int[] tableau) {
        int maxi = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > maxi) {
                maxi = tableau[i];
            }
        }
        return maxi;
    }

    // Remplir le tableau avec des valeurs aléatoires et afficher le max
    public void remplirTab() {
        int taille = 10;
        int[] tableau = new int[taille];
        Random rand = new Random();

        // Remplissage du tableau avec des entiers entre 0 et 99
        for (int i = 0; i < taille; i++) {
            tableau[i] = rand.nextInt(100);
        }

        // Affichage du tableau
        System.out.print("Contenu du tableau : ");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();

        // Recherche du max
        int maxi = lireMaxTabEntier(tableau);
        System.out.println("La valeur maximale dans le tableau est : " + maxi);
    }

    public static void main(String[] args) {
        Exo1 exo = new Exo1();
        exo.remplirTab();
    }
}
