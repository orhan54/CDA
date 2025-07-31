package training.afpa;

import java.util.Scanner;

public class Exo3 {
    int tailleMax = 10;
    int[] tableauEntiers = new int[tailleMax];
    int nombrePositifs;
    int sommePositifs;
    int nombreNegatifs;
    int sommeNegatifs;
    int nombreNuls;
    int moyennePositifs;
    int moyenneNegatifs;

    public void insertValeur() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tailleMax; i++) {
            System.out.print("Entrez entier n° " + (i + 1) + " : ");
            tableauEntiers[i] = sc.nextInt();
        }
    }

    public void afficherTableau() {
        System.out.print("Contenu du tableau : ");
        for (int val : tableauEntiers) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public void analyseTableau() {
        nombrePositifs = 0;
        sommePositifs = 0;
        nombreNegatifs = 0;
        sommeNegatifs = 0;
        nombreNuls = 0;

        for (int val : tableauEntiers) {
            if (val > 0) {
                nombrePositifs++;
                sommePositifs += val;
            } else if (val < 0) {
                nombreNegatifs++;
                sommeNegatifs += val;
            } else {
                nombreNuls++;
            }
        }
    }

    public void calculerMoyenne() {
        if (nombrePositifs > 0) {
            moyennePositifs = sommePositifs / nombrePositifs;
        } else {
            moyennePositifs = 0;
        }

        if (nombreNegatifs > 0) {
            moyenneNegatifs = sommeNegatifs / nombreNegatifs;
        } else {
            moyenneNegatifs = 0;
        }

        System.out.println("Nombre positifs : " + nombrePositifs + ", moyenne : " + moyennePositifs);
        System.out.println("Nombre négatifs : " + nombreNegatifs + ", moyenne : " + moyenneNegatifs);
        System.out.println("Nombre de zéros : " + nombreNuls);
    }
}
