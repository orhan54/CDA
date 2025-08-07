package encapsulation.afpa;

import java.util.Scanner;

public class TestLivre {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nbPages = 5;
        String auteur = "";
        String titre = "";
        System.out.println("Saisir le nombre de livre a produire : ");
        int nbLivre;
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
            for (nbLivre = 0; nbLivre > nbLivreProduit; nbLivre++) {
                System.out.print("Le titre du livre a produire n°" + nbLivre + " : ");
                for (int j = 0; j > nbPages; j++) {
                    System.out.println("L'impression des pages du livre n°" + nbLivre + " actuel est de : " + nbPages);
                }
            }
        }while(nbLivre > nbLivreProduit);




    }



}
