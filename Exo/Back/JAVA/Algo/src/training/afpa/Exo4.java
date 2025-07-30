package training.afpa;

import java.util.Scanner;

public class Exo4 {
    public int calculPuissance(int x, int y) {
        // Ce programme calcule et affiche X puissance Y.
        // bloc variable et initialisation
        int compteur = 1;
        int resultat = 1;

        while (compteur <= y) {
            resultat = resultat * x;
            compteur++;
        }
        return resultat;
    }

    public void sommePuissance() {
        Scanner sc = new Scanner(System.in);

        int x;
        int y;
        int resultat;

        System.out.println("Saisir la valeur de x : ");
        x = sc.nextInt();

        System.out.println("Saisir la valeur de y : ");
        y = sc.nextInt();

        if (y == 0) {
            System.out.println("Le resultat est 1");
        } else {
            if (x == 0) {
                System.out.println("Le resultat est 0");
            } else {
                resultat = calculPuissance(x, y);
                System.out.println("Le resultat est : " + resultat);
            }
        }
    }
}
