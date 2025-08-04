package training.afpa.cda24060.exercices;

import java.util.Scanner;

public class CalculPrixTTC {

    public void calculPrixTTC() {
        float prixHT;
        float prixTTC;

        Scanner in = new Scanner(System.in);
        System.out.println("Merci de saisir le prix ?");
        prixHT = in.nextFloat();

        prixTTC = prixHT * 1.1960f;
        System.out.println("Prix HT: " + prixHT);
        System.out.println("Prix TTC: " + prixTTC);
    }
}
