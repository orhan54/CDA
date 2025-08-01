package training.afpa;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6 {
    int[] tableau;

    public void afficherTableau(int []tableau) {
        for(int i=0; i<tableau.length; i++) {
            System.out.print("   n°" + (i+1) + ": " +  tableau[i] + "   ");
        }
        System.out.println(" ");
    }

    public void trierTableau(int []tableau) {
        boolean permuter;
        int n = tableau.length;
        int temp;

        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(tableau[j]>tableau[j+1]) {
                    temp = tableau[j];
                    tableau[j] = tableau[j+1];
                    tableau[j+1] = temp;
                }
            }
        }
    }

    public void programme6() {
        final int taille = 10;
        int[] tableauEntiers = new int[taille];
        boolean ordreCroissant;


        // Afficher le tableau non trié
        System.out.println("Tableau non trié : ");

        // Remplir le tableau avec des valeurs aléatoires
        for(int i=0; i<tableauEntiers.length; i++) {
            tableauEntiers[i] =(int) (Math.random() * (50 - (-50) + 1)) + (-50);
            System.out.print("   n°" + (i+1) + ": " + tableauEntiers[i] + "   ");
        }

        System.out.println(" ");

        System.out.println("Voulez-vous trier le tableau dans l'ordre croissant ? (Oui/Non)");
        Scanner sc = new Scanner(System.in);
        String reponse = sc.nextLine();

        if(reponse.equals("Oui")) {
            ordreCroissant = true;
        }else{
            ordreCroissant = false;
        }

        //trier le tableau
        trierTableau(tableau);

        //afficher  le tableau trjié
        System.out.println("Tableau trié :");
        afficherTableau(tableauEntiers);

        System.out.println("Fin du programme !");
        sc.close();

    }

}
