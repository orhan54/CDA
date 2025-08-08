package encapsulation.afpa;

import java.util.Scanner;

public class TestLivre {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nbPages = 5;
        String auteur = "";
        String titre = "";
        System.out.println("Saisir le nombre de livre a produire : ");
        int nbLivre = 1;
        int nbLivreProduit = sc.nextInt();

        //constructeur par defaut
        Livre livre = new Livre();
        livre.afficheToi();

        //construècteur titre et auteur
        Livre livreTitreAuteur = new Livre(titre, auteur);
        livreTitreAuteur.afficheToi();

        //constructeur avec titre, auteur et nombres de pages
        Livre livreInfoPages = new Livre(nbPages);
        livreInfoPages.afficheToi();


        //creation des 3 livres de 300 pages
        do {
            //le premier for pour les livres
            for (int i =1; i < nbLivreProduit+1; i++) {
                //impression du numero du livre
                System.out.println("");
                System.out.println("Le titre du livre a produire n°" + i + " : ");
                //le deuxieme for pour les nombre
                for (int j = 1; j < nbPages+1; j++) {
                    System.out.println("L'impression des pages du livre n°" + i + " est de : " + j + " sur " + nbPages);
                }
            }
        }while(nbLivre > nbLivreProduit);

    }



}
