package training.afpa;

import java.util.Scanner;

public class Exo5 {

    public float calculer(char operateur, float operande1, float operande2) {
        switch (operateur) {
            case '+':
                return operande1 + operande2;
            case '-':
                return operande1 - operande2;
            case '*':
                return operande1 * operande2;
            case '/':
                if (operande2 == 0) {
                    System.out.println("Erreur : division par zéro !");
                    return 0;
                } else {
                    return operande1 / operande2;
                }
            default:
                System.out.println("Erreur : opérateur invalide.");
                return 0;
        }
    }

    public void exProgramme() {
        Scanner sc = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            System.out.println("Choisissez une opération : +, -, *, /");
            String input = sc.nextLine();

            // Vérifier que l'entrée est un seul caractère valide
            if (input.length() != 1 || "+-*/".indexOf(input.charAt(0)) == -1) {
                System.out.println("Opérateur invalide. Veuillez entrer +, -, * ou /.");
                continue;
            }

            char operateur = input.charAt(0);

            // Lire les opérandes
            System.out.println("Entrez le premier opérande (nombre réel) :");
            float operande1 = sc.nextFloat();

            System.out.println("Entrez le second opérande (nombre réel) :");
            float operande2 = sc.nextFloat();

            sc.nextLine(); // Consomme le retour à la ligne restant

            float resultat = calculer(operateur, operande1, operande2);

            System.out.println("Le résultat de " + operande1 + " " + operateur + " " + operande2 + " est : " + resultat);

            // Demander à l'utilisateur s'il veut continuer
            System.out.println("Souhaitez-vous effectuer un autre calcul ? (Oui/Non)");
            String reponse = sc.nextLine().trim();

            if (reponse.equalsIgnoreCase("Non")) {
                continuer = false;
                System.out.println("Fin du programme.");
            }
        }
        sc.close();
    }
}
