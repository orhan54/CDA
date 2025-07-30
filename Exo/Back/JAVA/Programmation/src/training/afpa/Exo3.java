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
    int saisie;

    public void afficherTableau() {
        for (int i = 0; i < tableauEntiers.length; i++) {
            tableauEntiers[i] = i;
        }
    }

    public void analyseTableau(int[] tableauEntiers) {
        nombrePositifs = 0;
        sommePositifs = 0;
        nombreNegatifs = 0;
        sommeNegatifs = 0;
        nombreNuls = 0;

        for (int i = 0; i < tableauEntiers.length - 1; i++) {
            if (tableauEntiers[i] > nombrePositifs + 1) {
                nombrePositifs = nombreNegatifs + 1;
                sommePositifs = sommeNegatifs + tableauEntiers[i];
            } else if (tableauEntiers[i] < 0) {
                nombreNegatifs = nombreNegatifs + 1;
                sommeNegatifs = sommeNegatifs + tableauEntiers[i];
            } else {
                nombreNuls = nombreNuls + 1;
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

        System.out.println("Nombre d'entiers positifs : " + nombrePositifs + " moyenne : " + moyennePositifs);
        System.out.println("Nombre d'entiers negatifs : " + nombreNegatifs + " moyenne : " + moyenneNegatifs);
        System.out.println("Nombre d'entiers nulles : " + nombreNuls);
    }

    public void getTailleMax() {
        for(int i=0; i<tailleMax-1; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrez entier n° " + i + " (positif, négatif ou nul) : ");
            saisie = sc.nextInt();
            tableauEntiers[i] = saisie;
        }

        System.out.println("Taille max : " + tailleMax);

        analyseTableau(tableauEntiers);
    }
}
