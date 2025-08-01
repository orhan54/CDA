package training.afpa;

import java.util.Scanner;

public class Exo6 {

    public void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("   n°" + (i + 1) + ": " + tableau[i] + "   ");
        }
        System.out.println(" ");
    }

    public void trierTableau(int[] tableau, boolean ordreCroissant) {
        int n = tableau.length;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if ((ordreCroissant && tableau[j] > tableau[j + 1]) ||
                        (!ordreCroissant && tableau[j] < tableau[j + 1])) {
                    temp = tableau[j];
                    tableau[j] = tableau[j + 1];
                    tableau[j + 1] = temp;
                }
            }
        }
    }

    public void programme6() {
        final int taille = 10;
        int[] tableauEntiers = new int[taille];
        boolean ordreCroissant;

        // Remplir le tableau avec des valeurs aléatoires
        for (int i = 0; i < tableauEntiers.length; i++) {
            tableauEntiers[i] = (int) (Math.random() * (50 - (-50) + 1)) + (-50);
        }

        // Afficher le tableau non trié
        System.out.println("Tableau non trié :");
        afficherTableau(tableauEntiers);

        // Choix de l'utilisateur
        Scanner sc = new Scanner(System.in);
        System.out.println("Voulez-vous trier le tableau dans l'ordre croissant ? (Oui/Non)");
        String reponse = sc.nextLine().trim();

        ordreCroissant = reponse.equalsIgnoreCase("Oui");

        // Trier le tableau selon le choix
        trierTableau(tableauEntiers, ordreCroissant);

        // Afficher le tableau trié
        System.out.println("Tableau trié " + (ordreCroissant ? "par ordre croissant" : "par ordre décroissant") + " :");
        afficherTableau(tableauEntiers);

        System.out.println("Fin du programme !");
        sc.close();
    }
}
