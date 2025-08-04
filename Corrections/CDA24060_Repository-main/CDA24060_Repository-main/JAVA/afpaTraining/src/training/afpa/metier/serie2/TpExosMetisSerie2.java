package training.afpa.metier.serie2;

import training.afpa.exception.CalculException;
import training.afpa.utility.InputAndDisplay;
import training.afpa.utility.DialogBox;
import training.afpa.utility.Utils;

import java.util.Arrays;

import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 * The type Tp exos java.
 * @author jboebion
 */
public class TpExosMetisSerie2 {

    /**
     * Exercice 1.
     */
    public static void exo1_valueMaxTab() {

        int taille;
        int [] tab;

        InputAndDisplay.DisplayTitleExo("----   Bienvenue dans l'exercice   ----",
                " Recherche de valeur Max dans un tableau ");

        taille = InputAndDisplay.getInt("Merci de donner la taille de votre tableau :");
        // création du tableau
        tab = new int[taille];
        // remplissage aléatoire
        for (int i = 0; i < taille; i++) {
            tab[i] = (int) (Math.random() * 20);
        }

        // affichage du tableau
        InputAndDisplay.message(Arrays.toString(tab),1);

        // recherche Max et affichage
        InputAndDisplay.message("la valeur Max de ce tableau est " + Utils.readMaxTabInts(tab),1);
    }

    /**
     * Calcul de la moyenne des valeurs d'un tableau d'entiers
     */
    public static void exo2_AverageTable() {

        int[] intTable = Utils.createRandomArray(10);

        InputAndDisplay.DisplayTitleExo("----   Bienvenue dans l'exercice   ----",
                " Moyenne d'un tableau d'entiers aléatoire ");

        InputAndDisplay.message(Arrays.toString(intTable),1);

        InputAndDisplay.message("La moyenne des valeurs dans le tableau est : "
                + Utils.calculateAverage(intTable),2);
    }

    public static void exo3_AverageTable() {

        int [] intTable = Utils.createRandomArray(10);
        int positiveNumber = 0, negativeNumber=0, nullNumber=0;
        double positiveMoyNumber = 0, negativeMoyNumber = 0;
        int sumPositive = 0, sumNegative = 0;

        InputAndDisplay.DisplayTitleExo("----   Bienvenue dans l'exercice   ----",
                " Analyse d'un tableau d'entiers ");

        InputAndDisplay.message(Arrays.toString(intTable),1);

        for(int i = 0; i <= intTable.length-1; i++){

            if(intTable[i] > 0){
                positiveNumber++;
                sumPositive += intTable[i];
            } else if(intTable[i] < 0){
                negativeNumber++;
                sumNegative += intTable[i];
            } else if(intTable[i] == 0){
                nullNumber++;
            }

        }

        positiveMoyNumber = (double) sumPositive / positiveNumber;
        negativeMoyNumber = (double) sumNegative / negativeNumber;

        InputAndDisplay.message("Nombres positifs : " + positiveNumber, 2);
        InputAndDisplay.message("Moyenne des positifs : " + positiveMoyNumber, 3);
        InputAndDisplay.message("Nombres negatives : " + negativeNumber, 2);
        InputAndDisplay.message("Moyenne des negatives : " + negativeMoyNumber, 3);
        InputAndDisplay.message("Nombres nulls : " + nullNumber, 2);
    }

    /**
     * Exercice 4.
     */
    public static void exo4_MultiplicationTable() {

        final int LINE = 10;
        final int COLUMN = 10;
        int response, operand1, operand2;
        boolean end=false;
        int [][] tabMultiplication = new int[LINE][COLUMN];

        InputAndDisplay.DisplayTitleExo("----   Bienvenue dans l'exercice 5   ----",
                "  Table de multiplication et affichage   ");

        // remplissage de la 1er ligne et 1er colonne
        for (int i = 0; i < tabMultiplication.length; i++) {
            tabMultiplication[0][i] = i;
            tabMultiplication[i][0] = i;
        }

        // remplissage des tables de mmultiplication
        for (int i = 1; i < tabMultiplication.length; i++) {
            for (int j = 1; j < tabMultiplication[i].length; j++) {
                tabMultiplication[i][j] = i * j;
            }
        }

        // affichage du tableau complet en couleur
        InputAndDisplay.displayMatrice(tabMultiplication);

        do {
            // saisie utilisateur
            operand1 = InputAndDisplay.getInt("Merci de saisir le 1er entier [1-9] :");
            operand2 = InputAndDisplay.getInt("Merci de saisir le 2eme entier [1-9] :");

            // affichage résltat
            InputAndDisplay.message("le résultat du produit de " + operand1
                    + "*" + operand2 + " est : " + tabMultiplication[operand1][operand2], 1);
            InputAndDisplay.blank();

            // traitement autre calcul
            //reponse = InputAndDisplay.getInt("Un autre calcul [0 pour quitter - 1 pour oui ] ?");
            //if (reponse==0) finie=true;

            // autre méthode plus élégante pour demander une réponse !!
            response = DialogBox.displayDialogBox("Un autre calcul ?", "Multiplication", YES_NO_OPTION);
            if (response == NO_OPTION) end = true;

        } while (!end);

    }

    /**
     * Exercice 5.
     */
    public static void exo5_calculator() {

        char operand;
        String input = "";
        double result=0;
        double valueA, valueB;
        boolean error = true;

        InputAndDisplay.DisplayTitleExo("----   Bienvenue dans l'exercice 7   ----",
                "           Calculatrice simple           ");

        // tant que l'utilisateur effectue une mauvaisie saisie de l'opérateur
        while(error) {
            input = InputAndDisplay.getString("Merci de saisir l'opérateur [+ * - /] :");
            if (!input.equals("-") && !input.equals("+") && !input.equals("*") && !input.equals("/")) {
                InputAndDisplay.error("Merci de saisir un opérateur valide");
            } else {
                error = false;
            }
        }
        // récupération
        operand = input.charAt(0);
        valueA = InputAndDisplay.getDouble("Merci de saisir la valeur de A :");
        valueB= InputAndDisplay.getDouble("Merci de saisir la valeur de B :");

        try {
            result = engineCalculator(operand, valueA, valueB);
            InputAndDisplay.message("le résultat est " + result,1);
        } catch (CalculException ce) {
            // ici on devrait log le comportement de l'application
            InputAndDisplay.error("Erreur : opération impossible / Cause :" + ce.getMessage());
        }
    }

    /**
     * Exercice 6.
     */
    public static void exo6_insertionSort() {

        int [] tableInts;
        int length;

        InputAndDisplay.DisplayTitleExo("----   Bienvenue dans l'exercice 6   ----",
                "Tri par insertion d'un tableau d'entiers ");

        // demande de saisie utilisateur
        length = InputAndDisplay.getInt("Merci de donner la taille du tableau :");

        // création du tableau aléatoirement
        tableInts = Utils.createRandomArray(length);

        // affichage du tableau non trié dans une boite de dialogue
        DialogBox.displayArrayDialogBox(tableInts, "tableau non trié");

        // affichage du tableau trié dans une boite de dialogue
        DialogBox.displayArrayDialogBox(Utils.sortTable(tableInts), "tableau trié");

    }

    // BLOC METHODES PRIVATE

    /**
     * la calculatrice
     * @param operand
     * @param var1
     * @param var2
     * @return
     * @throws CalculException
     */
    private static double engineCalculator(char operand, double var1, double var2) throws CalculException {

        switch(operand) {
            case '+' :
                return ( var1 + var2 );
            case '-' :
                return var1 - var2;
            case '*' :
                return var1 * var2;
            case '/' :
                if ( var2 == 0 ) {
                    InputAndDisplay.error("La Division par zéro est impossible");
                    throw new CalculException("La Division est impossible");
                } else {
                    return var1 / var2;
                }
            default :
                InputAndDisplay.error("erreur interne de la calculatrice");
                throw new CalculException("Argument inconnu");
        }
    }
}
