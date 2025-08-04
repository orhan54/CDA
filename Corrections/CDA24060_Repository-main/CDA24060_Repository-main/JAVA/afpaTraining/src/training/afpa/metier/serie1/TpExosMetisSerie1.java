package training.afpa.metier.serie1;

import training.afpa.utility.Utils;
import training.afpa.utility.InputAndDisplay;

import java.util.Arrays;

public class TpExosMetisSerie1 {

    public static void exo1_sommeNEntiers_while() {

        int value;
        int index = 1;
        int result = 0;

        InputAndDisplay.DisplayTitleExo("----   Bienvenue dans l'exercice  ----",
                "Utils de la somme des N premiers nombres entiers" );

        // saisie de l'utilisateur
        value = InputAndDisplay.getInt("Saisir la valeur de n :");

        while (index <= value) {
            result += index;
        }

        InputAndDisplay.message("Le résultat avec tant que est : " + result,1);
    }

    public static void exo1_sommeNEntiers_doWhile() {

        int value;
        int index = 1;
        int result = 0;

        InputAndDisplay.DisplayTitleExo("----   Bienvenue dans l'exercice  ----",
                "Utils de la somme des N premiers nombres entiers" );

        // saisie de l'utilisateur
        value = InputAndDisplay.getInt("Saisir la valeur de n :");

        do {
            result += index;
        } while (index <= value);

        InputAndDisplay.message("Le résultat avec tant que est : " + result,1);
    }

    public static void exo1_sommeNEntiers_for() {

        int value;
        int result = 0;

        InputAndDisplay.DisplayTitleExo("----   Bienvenue dans l'exercice   ----",
                "Utils de la somme des N premiers nombres entiers" );

        // saisie de l'utilisateur
        value = InputAndDisplay.getInt("Saisir la valeur de n :");

        for( int i = 1; i <= value; i++ ) {
            result += i;
        }

        InputAndDisplay.message("Le résultat avec tant que est : " + result,1);
    }

    public static void exo2_factorielleDeX() {

        // déclaration de variables.
        int value, result;

        // demande de saisie
        InputAndDisplay.DisplayTitleExo("----   Bienvenue dans l'exercice   ----",
                "factorielle d'un nombre x" );

        // saisie de l'utilisateur
        value = InputAndDisplay.getInt("Saisir la valeur de n :");

        // initialisation et parcours pour le calcul
        result = 0;
        for (int i = 0; i <= value; i++) {
            if (i == 0) {
                result = 1;
            } else {
                result = result * i;
            }
        }
        // affichage du résultat
        System.out.println("Factorielle : " + result);
    }

    /**
     * Exercice 3.
     */
    public static void exo3_EquationSecondDegree() {

        int a,b,c;
        double delta;
        double resultat;
        double s1, s2, s3;

        InputAndDisplay.DisplayTitleExo("----   Bienvenue dans l'exercice   ----",
                "Résolution d'une équation du second degré" );

        // saisie de l'utilisateur
        a = InputAndDisplay.getInt("Saisir la valeur de a :");
        b = InputAndDisplay.getInt("Saisir la valeur de b :");
        c = InputAndDisplay.getInt("Saisir la valeur de c :");

        InputAndDisplay.blank();
        InputAndDisplay.message(a + "x² + " + b + "x + " + c + " = 0",1);

        // calcul de delta
        delta = Math.pow((double) b,2) - (4*a*c);

        InputAndDisplay.message("Delta = " + delta,1);

        if (delta < 0) {
            InputAndDisplay.message("Il n'y a pas de solution réelle à cette équation",1);
        } else if (delta == 0) {
            resultat = (float) -b /(2*a);
            InputAndDisplay.message("Il y a une solution double pour cette équation :",1);
            InputAndDisplay.message("resultat = " + resultat,1);
        } else {
            InputAndDisplay.message("Il y a 2 solutions pour cette équation :",1);
            // decomposition du calcul
            s1 = -b + Math.sqrt(delta);
            s2 = -b - Math.sqrt(delta);
            s3 = 2*a;
            InputAndDisplay.message("resultat 1 = " + s1/s3,1);
            InputAndDisplay.message("resultat 2 = " + s2/s3,1);
        }

        /*
        jeu de test :
        a = -3
        b = -7
        c = 10
        delta = 169
        s1 = -3.33333
        s2 = 1
         */
    }

    /**
     * calcul du factorielle d'un nombre x par y
     * Exercice 3.2 méthode avec la classe Math
     */
    public static void exo4_factorielledeXparY() {

        int x = 0,y = 0;
        boolean error = false;

        InputAndDisplay.DisplayTitleExo("----   Bienvenue dans l'exercice   ----",
                "   Utils d'un X élevé à la puissance Y  ");

        // saisie de l'utilisateur
        while (!error) {
            x = InputAndDisplay.getInt("Saisir la valeur positif pour x  :");
            if (x > 0) {
                error = true;
            } else {
                InputAndDisplay.error("la valeur de x doit être un entier positif");
            }
        }
        error = false;
        while (!error) {
            y = InputAndDisplay.getInt("Saisir la valeur positif pour y  :");
            if (y > 0) {
                error = true;
            } else {
                InputAndDisplay.error("la valeur de y doit être un entier positif");
            }
        }

        InputAndDisplay.blank();
        InputAndDisplay.message("le résultat est " + Utils.power(x, y),1);

        /*
        jeu d'essai
        x = 2
        y = 8
        resultat = 256
         */

    }

    /**
     * Exercice 5.
     */
    public static void exo5_Dichtomie() {

        int [] tab = new int[10];
        int x;
        int indice;

        InputAndDisplay.DisplayTitleExo("----   Bienvenue dans l'exercice   ----",
                " Recherche dichotomique d'une variable X " );

        //InputAndDisplay.message("Remplissage du tableau de 10 valeurs", 1);
        //for (int i = 0; i < tab.length; i++) {
        //    tab[i] = InputAndDisplay.getInt("Merci de saisir un entier :");
        //}

        // simplification en utilisant ma méthode de création d'un tableau aléeatoire
        tab = Utils.createRandomArray(10);

        InputAndDisplay.message("Voici votre tableau de recherche non trié",1);
        InputAndDisplay.message(Arrays.toString(tab),1);
        InputAndDisplay.blank();
        InputAndDisplay.message("Voici votre tableau de recherche trié",1);

        // trie du tableau avec la méthode sort() de la classe Arrays
        Arrays.sort(tab);

        InputAndDisplay.message(Arrays.toString(tab),1);
        InputAndDisplay.blank();

        x = InputAndDisplay.getInt("Saisir la valeur de x à rechercher :");
        indice = Utils.findIntByDichotomie(tab, x);

        if (indice != -1) {
            InputAndDisplay.message("l'élément " + x + " se trouve à l'indice " + indice + " du tableau", 1);
        } else {
            InputAndDisplay.message("l'élément " + x + " ne se trouve pas dans le tableau", 2);
        }
    }

    /**
     * exercice 6
     */
    public static void exo6_tableauFactorielle() {

        int[][] matriceFactorielle = new int[2][10];
        int colonne, value;

        colonne = 0;

        InputAndDisplay.DisplayTitleExo("----   Bienvenue dans l'exercice   ----",
                " Recherche de la factorielle de x depuis une matrice de résultat" );


        while (colonne <= 9) {
            matriceFactorielle[0][colonne] = colonne+1;
            colonne++;
        }

        colonne = 0;
        while (colonne <= 9) {

            matriceFactorielle[1][colonne] = Utils.factorial(colonne+1);
            colonne++;
        }

        // Juste pour tester la bonne construction de la matrice
        //InputAndDisplay.displayMatrice(matriceFactorielle);

        value = InputAndDisplay.getInt("Pour quelle valeur souhaitez-vous " +
                "calculer la factorielle (de 1 à 10 Max) ?");

        InputAndDisplay.message("La factorielle de " + value + " est : "
                + matriceFactorielle[1][value-1] ,1);
    }
}
