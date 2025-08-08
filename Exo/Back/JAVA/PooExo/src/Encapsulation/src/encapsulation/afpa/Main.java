package encapsulation.afpa;

import java.util.ArrayList;
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
        double prix;
        ArrayList<Integer> livres = new ArrayList<Integer>();

        System.out.print("Combien de livres à rentrer : ");

        nbLivre = sc.nextInt();
        sc.nextLine(); // Pour consommer le \n restant après nextInt()

        if (nbLivre < 1 || nbLivre > 100) {
            System.out.println("Le nombre de livres doit être entre 1 et 100.");
        } else {
            for (int i = 1; i <= nbLivre; i++) {

                System.out.println("");
                System.out.println("*** Saisir les informations complete du livre n°" + i + " ***");

                System.out.println("Saisir le titre du livre n°" + i + ": ");
                titre = sc.nextLine();

                System.out.println("Saisir l'auteur du livre n°" + i + ": ");
                auteur = sc.nextLine();

                System.out.println("Saisir le nombre de pages du livre n°" + i + ": ");
                nbPages = sc.nextInt();

                System.out.print("Saisir le prix du livre : ");
                prix = sc.nextDouble();
                System.out.println("");

                //fonction pour la saisie positif des pages entre 1 et 300
                do {
                    if (nbPages < 1 || nbPages > 100) {
                        //message d'erreur en de non respect de la condition do...while
                        System.out.println("Votre livre dois contenir entre 1 et 100 pages.");
                    }
                }while (nbPages < 1 || nbPages > 100);
                livres.add(nbPages);
                nbPagesTotals += nbPages;
                sc.nextLine();

                Livre setPrixLivre = new Livre(prix, titre);
                if(prix<0){
                    System.out.println("Prix invalide.");
                    prix = sc.nextDouble();
                } else if (prix>0) {
                    //set
                    setPrixLivre.setPrix(prix);
                    setPrixLivre.getTitre();
                    System.out.println("Le livre avec titre " + setPrixLivre.getTitre() + " coute " + setPrixLivre.getPrix() + "€");
                }

                System.out.println("Voici le prix du livre " + setPrixLivre.getPrix() + "€");

                //setPrixLivre.setPrix(10.2); // ligne pour tester erreur en cas de modif du prix

                System.out.println("");
                System.out.println("==========================================================================");
                System.out.println("[*** Description complete du livre entree n°" + i + " ***]");


                Livre ex1 = new Livre(titre, auteur, nbPages);
                ex1.afficher();
                Livre prixLivre = new Livre(prix, titre);
                prixLivre.afficherPrix();
                System.out.println("==========================================================================");
            }
            System.out.println("");
            System.out.println("");

            //affichage de chaque livre et de son nombre de page
            for (int i = 0; i <= livres.toArray().length-1; i++) {
                System.out.println("Le livre n°" + (i+1) + " contient " +  livres.get(i) + " pages");
            }
            //affichage du nombre des pages totals des livres
            System.out.println("[*** Voici le nombre totals des pages des livres : " + nbPagesTotals + " pages ***]");
            System.out.println("Fin du programme !!");
            System.out.println("");
        }

        sc.close();
    }

}