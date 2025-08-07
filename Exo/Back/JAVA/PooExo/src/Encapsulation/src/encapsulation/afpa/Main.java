package encapsulation.afpa;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String titre = "";
        String auteur = "";
        int nbPages = 0;
        int nbPagesTotals = 0;
        int nbLivre;

        System.out.print("Combien de livres à rentrer : ");
        nbLivre = sc.nextInt();
        sc.nextLine(); // Pour consommer le \n restant après nextInt()

        if (nbLivre < 1 || nbLivre > 100) {
            System.out.println("Le nombre de livres doit être entre 1 et 100.");
        } else {
            for (int i = 1; i <= nbLivre; i++) {

                System.out.println("");
                System.out.println("*** Saisir les informations complete du livre n°" + i + " ***");

                System.out.print("Saisir le titre du livre n°" + i + ": ");
                titre = sc.nextLine();

                System.out.print("Saisir l'auteur du livre n°" + i + ": ");
                auteur = sc.nextLine();

                System.out.print("Saisir le nombre de pages du livre n°" + i + ": ");

                //fonction pour la saisie positif des pages entre 1 et 300
                do {
                    nbPages = sc.nextInt();

                    if (nbPages < 1 || nbPages > 100) {
                        //message d'erreur en de non respect de la condition do...while
                        System.out.println("Votre livre dois contenir entre 1 et 100 pages.");
                    }
                }while (nbPages < 1 || nbPages > 100);
                nbPagesTotals += nbPages;
                sc.nextLine();


                System.out.println("");
                System.out.println("==========================================================================");
                System.out.println("[*** Description complete du livre entree n°" + i + " ***]");


                Livre ex1 = new Livre(titre, auteur, nbPages);
                ex1.afficher();
                System.out.println("==========================================================================");
            }
            System.out.println("");
            System.out.println("");
            //affichage du nombre des pages totals des livres
            System.out.println("[*** Voici le nombre totals des pages des livres : " + nbPagesTotals + " pages ***]");
            System.out.println("Fin du programme !!");
            System.out.println("");
        }

        sc.close();
    }

}