package training.afpa.main;

import training.afpa.metier.serie1.TpExosMetisSerie1;
import training.afpa.metier.serie2.TpExosMetisSerie2;
import training.afpa.utility.InputAndDisplay;

public class App {

    /**
     * Variable définissant la fin de l'application.
     */
    boolean end;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        InputAndDisplay.message("Hello and welcome!", 0);
        App app = new App();
        app.start();

    }

    /**
     * Methode start
     */
    private void start() {
        InputAndDisplay.message("démarrage", 1);

        // tant que l'utilisateur ne quitte pas l'application on boucle
        while (!end) {
            // affichage du menu
            displayMenu();
            // traitement du choix utilisateur
            choiceMenu();
        }

    }
    

    /**
     * Methode pour afficher le menu
     */
    private void displayMenu() {
        InputAndDisplay.message("-------------------------------------", 4);
        InputAndDisplay.message("Bienvenue dans l'application AlgoExos",3);
        InputAndDisplay.message("-------------------------------------",4);
        InputAndDisplay.message("1. TP1 Somme des N entiers",4);
        InputAndDisplay.message("2. TP1 Factorielle de x",4);
        InputAndDisplay.message("3. TP1 Equation du second degrée",4);
        InputAndDisplay.message("4. TP1 Calcul de x^y",4);
        InputAndDisplay.message("5. TP1 Dichotomie",4);
        InputAndDisplay.message("6. TP1 Tableau de factorielle",4);
        InputAndDisplay.message("7. TP2 Valeur Max du tableau",4);
        InputAndDisplay.message("8. TP2 Calcul de la moyenne du tableau",4);
        InputAndDisplay.message("9. TP2 Analyse du tableau",4);
        InputAndDisplay.message("10. TP2 Table de multiplication",4);
        InputAndDisplay.message("11. TP2 Calculatrice simple",4);
        InputAndDisplay.message("12. TP2 Trie d'un tableau",4);
        InputAndDisplay.message("0. Quitter",4);
    }

    /**
     * Methode pour l'affiche des différents choix du menu
     */
    private void choiceMenu() {

        System.out.println();
        int selection = InputAndDisplay.getInt("> Choix de l'exercice [1-12] ou [0] pour quitter :");
        switch (selection) {
            case 0:
                // fin de l'application.
                end = true;
                InputAndDisplay.blank();
                InputAndDisplay.blank();
                InputAndDisplay.message("Merci et à bientôt",3);
                // libération de la ressource du scanner
                InputAndDisplay.close();
                break;
            case 1:
                // Perform exerice 1.
                TpExosMetisSerie1.exo1_sommeNEntiers_doWhile();
                break;
            case 2:
                // Perform exerice 2.
                TpExosMetisSerie1.exo2_factorielleDeX();
                break;
            case 3:
                // Perform exerice 3.
                TpExosMetisSerie1.exo3_EquationSecondDegree();
                break;
            case 4:
                // Perform exerice 4.
                TpExosMetisSerie1.exo4_factorielledeXparY();
                break;
            case 5:
                // Perform exerice 5.
                TpExosMetisSerie1.exo5_Dichtomie();
                break;
            case 6:
                // Perform exerice 6.
                TpExosMetisSerie1.exo6_tableauFactorielle();
                break;
            case 7:
                // Perform exerice 7.
                TpExosMetisSerie2.exo1_valueMaxTab();
                break;
            case 8:
                // Perform exerice 8.
                TpExosMetisSerie2.exo2_AverageTable();
                break;
            case 9:
                // Perform exerice 9.
                TpExosMetisSerie2.exo3_AverageTable();
                break;
            case 10:
                // Perform exerice 10.
                TpExosMetisSerie2.exo4_MultiplicationTable();
                break;
            case 11:
                // Perform exerice 11.
                TpExosMetisSerie2.exo5_calculator();
                break;
            case 12:
                // Perform exerice 12.
                TpExosMetisSerie2.exo6_insertionSort();
                break;
            default:
                InputAndDisplay.error("! Choix incorrect ! [0-12] !");
                break;
        }
    }

}
