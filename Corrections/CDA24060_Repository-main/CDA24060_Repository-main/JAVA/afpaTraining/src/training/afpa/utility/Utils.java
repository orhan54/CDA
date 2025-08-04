package training.afpa.utility;

import java.util.Random;

public class Utils {

    /**
     * Methode de calcul de la x puissance y
     * @param x
     * @param y
     * @return
     */
    public static long power(int x, int y) {

        return (long) Math.pow(x, y);
    }

    /**
     * fonction de calcul de la factorielle
     * @param value    valeur à calculer
     * @return          resultat
     */
    public static int factorial(int value) {

        // déclaration de variables.
        int result;

        // initialisation et parcours pour le calcul
        result = 0;
        for (int i = 0; i <= value; i++) {
            if (i == 0) {
                result = 1;
            } else {
                result = result * i;
            }
        }

        return result;
    }

    /**
     * Methode de recherche par dichotomie
     * @param tab   le tableau déja trié
     * @param x     la valeur à rechercher
     * @return      l'indice si trouvé ou -1
     */
    public static int findIntByDichotomie(int [] tab, int x) {
        int indexLow = 0;
        int indexHight = tab.length - 1;
        int indexMiddle = (indexLow + indexHight) / 2;

        boolean found = false;

        while ( !found && indexLow <= indexHight) {
            if (x < tab[indexMiddle]) {
                indexHight = indexMiddle - 1;
            } else if (x > tab[indexMiddle]) {
                indexLow = indexMiddle + 1;
            } else {
                found = true;
            }
            indexMiddle  = (indexLow + indexHight) / 2;
        }
        if (found) {
            return indexMiddle;
        } else {
            return -1;
        }
    }

    /**
     * Methode de creation d'un tableau d'entiers aléatoires
     * @param length
     * @return
     */
    public static int[] createRandomArray(int length) {
        // Créer un tableau d'entiers
        int[] table = new int[length];

        // Créer une instance de Random pour générer des nombres aléatoires
        Random random = new Random();

        // Remplir le tableau avec des entiers aléatoires
        for (int i = 0; i < length; i++) {
            // Générer un entier aléatoire entre -100 et 100 (inclus)
            // nextInt(201) génère un entier entre 0 et 200, donc on soustrait 100 pour obtenir un intervalle de -100 à 100
            table[i] = random.nextInt(201) - 100;
        }
        return table;
    }

    /**
     * trie du tableau par la méthode du tri par insertion
     * @param table
     */
    public static int [] sortTable(int[] table) {
        // Parcourir le tableau à partir du deuxième élément
        for (int i = 1; i < table.length; i++) {
            int key = table[i]; // Élément à insérer
            int j = i - 1;

            // Déplacer les éléments du tableau qui sont plus grands que la clé,
            // vers une position en avant de leur position actuelle
            while (j >= 0 && table[j] > key) {
                table[j + 1] = table[j];
                j = j - 1;
            }
            table[j + 1] = key; // Insérer la clé à la position trouvée
        }
        return table;
    }

    /**
     * Methode pour rechercher le max d'un tableau donné
     * @param table
     * @return
     */
    public static int readMaxTabInts(int [] table) {
        int max= table[0];
        for (int i=1; i<table.length ; i++ ){
            if ( table[i] > max) {
                max = table[i];
            }
        }
        return max ;
    }

    public static double calculateAverage(int[] tab) {

        int average = 0;
        for (int i = 0; i < tab.length; i++) {
            average += tab[i];
        }
        return average / tab.length;

    }
}
