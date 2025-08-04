package training.afpa.cda24060.exercices;

import java.util.Scanner;

public class Factiorelle {

    public void factorielle() {

        int valeur;
        int resultat = 1;

        Scanner sc = new Scanner(System.in);
        valeur = sc.nextInt();

        if (valeur == 1 || valeur == 0) {
            resultat = 1;
        } else {
            for(int i=2; i<=valeur;i++) {
                resultat = resultat * i;
            }
        }
        System.out.println("la factorielle de " + valeur + " est " + resultat);

    }
}
