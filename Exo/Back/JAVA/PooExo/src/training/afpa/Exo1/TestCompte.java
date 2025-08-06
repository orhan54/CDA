package training.afpa.Exo1;

import java.util.Scanner;

public class TestCompte {
    public void Operation() {
        Scanner sc = new Scanner(System.in);
        Compte compte = new Compte();
        int saisieOperation;
        String continuer;

        do {
            System.out.println("\nChoisir une opération :");
            System.out.println("1 - Retrait");
            System.out.println("2 - Déposer");
            System.out.println("3 - Consulter");
            System.out.println("4 - Quitter");

            saisieOperation = sc.nextInt();

            switch (saisieOperation) {
                case 1:
                    System.out.print("Montant à retirer : ");
                    int retrait = sc.nextInt();
                    compte.Retirer(retrait);
                    break;
                case 2:
                    System.out.print("Montant à déposer : ");
                    int depot = sc.nextInt();
                    compte.Deposer(depot);
                    break;
                case 3:
                    compte.Afficher();
                    break;
                case 4:
                    System.out.println("Fin d'opération.");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
            System.out.println("Voulez-vous faire une autre opération : (oui/non)");
            continuer = sc.next();
            if(continuer.equals("oui")) {
                Operation();
            }else if(continuer.equals("non")) {
                System.out.println("Opération terminer !!");
                break;
            }

        } while (saisieOperation != 4);
    }
}