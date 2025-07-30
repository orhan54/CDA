package training.afpa;

import java.util.Scanner;

public class Exo5 {

    public static int rechercheEntier(int[] tabent, int x) {
        int indiceBas = 0;
        int indiceHaut = tabent.length - 1;
        int indiceMilieu;
        boolean trouve = false;

        while (!trouve && indiceBas <= indiceHaut) {
            indiceMilieu = (indiceBas + indiceHaut) / 2;

            if (x < tabent[indiceMilieu]) {
                indiceHaut = indiceMilieu - 1;
            } else if (x > tabent[indiceMilieu]) {
                indiceBas = indiceMilieu + 1;
            } else {
                trouve = true;
                return indiceMilieu;
            }
        }

        return -1;
    }

    public static void creationTabent() {
        Scanner sc = new Scanner(System.in);

        int[] tabent = {-2, -1, 0, 13, 24, 37, 44, 56, 99, 117};
        System.out.print("Veuillez saisir la valeur de X à rechercher dans le tableau : ");
        int x = sc.nextInt();

        int position = rechercheEntier(tabent, x);

        if (position == -1) {
            System.out.println("x n’existe pas dans le tableau.");
        } else {
            System.out.println("x se trouve à la position " + position + " dans le tableau.");
        }

        sc.close();
    }
}
