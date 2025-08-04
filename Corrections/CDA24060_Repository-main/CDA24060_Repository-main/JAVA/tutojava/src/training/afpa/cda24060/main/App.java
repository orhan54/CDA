package training.afpa.cda24060.main;

import training.afpa.cda24060.exercices.CalculPrixTTC;
import training.afpa.cda24060.exercices.Factiorelle;
import training.afpa.cda24060.exercices.HelloWorld;
import training.afpa.cda24060.exercices.MoyenneNotes;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * description
 */
public class App {

    // BLOC DE DECLARATION CONSTANTE
    int entier = 10;
    double decimal = 12.5;
    char caractere = 'A';
    boolean booleen = true;
    String chaine = "Bonjour";
    String nom = "John";

    // BLOC DE DECLARATION DES VARIABLES


    // BLOC DE DECLARATION DES METHODES
    /**
     * Méthode main de mon application
     * @param args  argument de la méthode
     */
    public static void main(String[] args) {

        // Création d'une instance de la classe App
        App app = new App();
        // appel de la méthode start() de l'instance app
        app.start();
    }

    /**
     * Méthode de démarrage du programme
     */
    public void start() {
        // BLOC DE DECLARATION CONSTANTE de la méthode

        // BLOC DE DECLARATION DES VARIABLES de la méthode

        // Affichage des variables
        System.out.println("Entier: " + entier);
        System.out.println("Decimal: " + decimal);
        System.out.println("Caractere: " + caractere);
        System.out.println("Booleen: " + booleen);
        System.out.println("Chaine: " + chaine);
        System.out.println("Contatenation de 2 chaines: " + chaine +  " " + nom);

        // Structures de contrôle
        // Structure conditionnelle
        if (entier > 0) {
            System.out.println(entier + " est positif.");
        } else {
            System.out.println(entier + " est négatif ou nul.");
        }

        // Boucle for
        System.out.println("Boucle for de 0 à 4:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }

        // Boucle while
        System.out.println("Boucle while:");
        int j = 0;
        while (j < 5) {
            System.out.println("j: " + j);
            j++;
        }

        // Boucle do-while
        System.out.println("Boucle do-while:");
        int k = 0;
        do {
            System.out.println("k: " + k);
            k++;
        } while (k < 5);

        // Structure switch
        int jour = 3;
        switch (jour) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            default:
                System.out.println("Week-end");
        }

        // Appel d'une méthode
        int somme = additionner(3, 4);
        System.out.println("La somme de 3 et 4 est: " + somme);

        // Déclaration de Tableau et d'une matrice prédifinis
        int[] tableau = {1, 2, 3, 4, 5};
        int [][] matrice = {{ 3, 2, 1, 7 },
                            { 9, 11, 5, 4 },
                            { 6, 0, 13, 17 },
                            { 7, 21, 14, 15 } };
        // déclaration d'un tableau vide de 10 entiers
        int[] index = { 2, 5, 5, 8, 9, 1, 10, 11, 11, 15, 16 };

        System.out.println("index non trié:");
        System.out.println(Arrays.toString(index));
        System.out.println("index trié:");
        // trie du tableau
        Arrays.sort(index);
        System.out.println(Arrays.toString(index));
        // copie d'un tableau
        int [] clone = Arrays.copyOf(index, index.length);
        // affichage du clone
        System.out.println(Arrays.toString(clone));
        // Equalité
        System.out.println("Egalité entre clone et index ? " + Arrays.equals(clone, index));
        // Equalité
        System.out.println("Egalité entre tableau et index ?" + Arrays.equals(tableau, index));

        System.out.println("Tableau:");
        // affichage du tableau avec un for
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tableau[" + i + "]: " + tableau[i]);
        }

        // affichage du tableau avec un for-each
        System.out.println("Tableau avec un foreach:");
        for (int i : tableau) {
            System.out.println("Element : " + i);
        }

        System.out.println("Matrice:");
        for(int i=0;i<matrice.length;i++){
            for (int z=0;z< matrice[i].length;z++) {
                System.out.printf(" " + matrice[i][z]);
            }
            System.out.println();
        }

        // appel de la méthode sur les entrées et sorties
        entreeSortie();


        // TEST DE CONVERSION
        int x = 292;

        float f = x;  // Conversion sans perte
        byte b = (byte) x; // conversion avec perte
        int x2 = b;
        char c = (char) x; // conversion d'un byte en char
        System.out.println("Converion de x en float: " + f);
        System.out.println("Converion de x en byte: " +b);
        System.out.println("Converion de b en int : " + x2); // perte de données
        System.out.println("Converion de x en char : " + c);
        System.out.println("Converion de c en byte: " + (byte) c);
    }

    /**
     * Méthode pour additionner deux entiers
     * equivalent à une fonction
     * @param a     valeur a de l'addition
     * @param b     valeur b de l'addition
     * @return      résultat de l'addition de a + b
     */
    public int additionner(int a, int b) {
        return a + b;
    }

    /**
     * Méthode de lecture et ecriture
     * equivalent à une procédure
     */
    public void entreeSortie() {

        // Création d'un objet Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Lecture d'un entier
        System.out.print("Veuillez entrer un entier: ");
        int entier = scanner.nextInt();
        System.out.println("Vous avez entré l'entier: " + entier);

        // Lecture d'un nombre décimal
        System.out.print("Veuillez entrer un nombre décimal: ");
        double decimal = scanner.nextDouble();
        System.out.println("Vous avez entré le nombre décimal: " + decimal);

        // Lecture d'une chaîne de caractères
        System.out.print("Veuillez entrer une chaîne de caractères: ");
        String chaine = scanner.next();
        System.out.println("Vous avez entré la chaîne: " + chaine);

        // Lecture d'un caractère
        System.out.print("Veuillez entrer un caractère: ");
        char caractere = scanner.next().charAt(0);
        System.out.println("Vous avez entré le caractère: " + caractere);

        // Lecture d'un booléen
        System.out.print("Veuillez entrer un booléen (true/false): ");
        boolean booleen = scanner.nextBoolean();
        System.out.println("Vous avez entré le booléen: " + booleen);

        // Fermeture du scanner
        scanner.close();

        // Exemple de sortie formatée
        System.out.printf("Voici vos entrées formatées: Entier=%d, Décimal=%.2f, " +
                       "Chaîne=%s, Caractère=%c, Booléen=%b%n",
                entier, decimal, chaine, caractere, booleen);

        CalculPrixTTC exo1 = new CalculPrixTTC();
        exo1.calculPrixTTC();

        HelloWorld exo2 = new HelloWorld();
        exo2.helloworld();

        Factiorelle f = new Factiorelle();
        f.factorielle();

        MoyenneNotes moyNotes = new MoyenneNotes();
        moyNotes.moyenneNotes();

        System.out.println(Arrays.toString(moyNotes.triInsertionNotes()));
    }
}
