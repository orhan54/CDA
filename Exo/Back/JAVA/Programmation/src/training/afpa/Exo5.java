package training.afpa;

import java.util.Arrays;
import java.util.Scanner;

public class Exo5 {

    char[] operateur;
    float operande1;
    float operande2;
    float resultat;
    boolean continuer;

    public float calculer(char operateur, float operande1, float operande2, float resultat) {

        switch (operateur) {
            case '+':
                resultat = operande1 + operande2;
                break;
            case '-':
                resultat = operande1 - operande2;
                break;
            case '*':
                resultat = operande1 * operande2;
                break;
            case '/':
                if (operande2 == 0) {
                    return 0;
                } else {
                    resultat = operande1 / operande2;
                }
                break;
        }
        return resultat;

    }

    public void exProgramme() {
        continuer = true;

        while (continuer) {
            //afficher le menu et obtenir l'operation
            System.out.println("Choisissez une opération : +, -, *, / ");
            Scanner sc = new Scanner(System.in);
            operateur = sc.nextLine().toCharArray();

            for (int i = 0; i < operateur.length; i++) {
                if (operateur[0] == '+' || operateur[1] == '-' || operateur[2] == '*' || operateur[3] == '/') {
                    System.out.println("Opérateur invalide. Veuillez entrer un opérateur valide ");
                    continuer = false;
                }
            }

            //Saisie des opérandes
            System.out.println("Entrez le premier opérande (nombre réel) :");
            operande1 = sc.nextFloat();

            System.out.println("Entrez le second opérande (nombre réel) :");
            operande2 = sc.nextFloat();

            //calculer le résultat
            resultat = calculer(operateur[0], operande1, operande2, resultat);

            //afficher le resultat
            System.out.println("Le resultat de " + operande1 + Arrays.toString(operateur) + operande2 + " est : " + resultat);

            //Demander si l'utilisateur souhaite continuer
            System.out.println("Souhaitez-vous effectuer un autre calcul ? (Oui/Non)");
            Scanner sc2 = new Scanner(System.in);
            String response = "Non";
            String reponse  = sc.nextLine();
            if(response.equals("Non")){
                continuer = false;
                sc.close();
                System.exit(0);
            }
        }
    }
}
