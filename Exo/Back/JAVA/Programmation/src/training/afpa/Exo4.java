package training.afpa;

import java.util.Scanner;

public class Exo4 {

    final int lignes = 10;
    final int colonnes = 10;

    public void remplirTab() {
        int [][] tabMulti = new int[lignes][colonnes];
        boolean continuer;

        for(int i=0; i<=tabMulti.length-1; i++){
            for(int j=0; j<=tabMulti[i].length-1; j++){
                tabMulti[i][j] = i * j;
            }
        }

        continuer = true;

        while(continuer){
            int X = 0;
            int Y = 0;

            Scanner sc = new Scanner(System.in);

            // saisie de X
            do {
                System.out.println("Entrez un entier X entre 1 et 9 : ");
                int saisie = Integer.parseInt(sc.nextLine());
                if(saisie > 0){
                    X = saisie;
                }else{
                    System.out.println("Veillez entrer un entier : ");
                }
            }while(X <= 1 && X >= 9);

            //saisie Y
            do {
                System.out.println("Entrez un entier Y entre 1 et 9 : ");
                int saisie = Integer.parseInt(sc.nextLine());
                if(saisie > 0){
                    Y = saisie;
                }else{
                    System.out.println("Veillez entrer un entier : ");
                }
            }while(Y <= 1 && Y >= 9);

            //afficher le produit
            int[] produit = new int[tabMulti[X][Y]];
            System.out.println("Le resultat de " + X + " * " + Y + " = " + (X * Y));

            // demander si l'utilisateur souhaite continuer
            System.out.println("Souhaitez-vous enocre un calcul ? (Oui/Non)");
            String response = "Non";
            String reponse  = sc.nextLine();
            if(reponse.equals("Non")){
                continuer = false;
                System.exit(0);
            }

        }
    }
}
