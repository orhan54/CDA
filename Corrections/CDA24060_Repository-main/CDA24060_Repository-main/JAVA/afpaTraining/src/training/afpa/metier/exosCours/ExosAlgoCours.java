package training.afpa.metier.exosCours;

// les différents import

import java.util.Arrays;
import java.util.Scanner;

/**
 * Classe regroupant les exercices Algo du cours
 */
public class ExosAlgoCours {

    // Déclaration d'un attribut scanner pour la classe
    Scanner sc = new Scanner(System.in);

    /**
     * Simple affectation de variables
     */
    public void exo1_1() {

        // Déclarations
        int a = 1;
        int b = a + 3;

        // affichage de contrôle
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // affectation
        a = 3;

        // affichage de contrôle
        System.out.println("a = " + a);
    }

    /**
     * Simple exercice d'affectations
     */
    public void exo1_2() {
        // Déclarations
        int a = 5;
        int b = 3;
        int c = a + b;

        // affichage de contrôle
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // affectation
        a = 2;

        // affichage de contrôle
        System.out.println("a = " + a);
        System.out.println("c = " + (b - a));
    }

    /**
     * Exercice de permutations de 2 valeurs
     */
    public void exo1_6() {

        // Déclaration
        int a, b;
        int tampon;

        // demande de saisie
        System.out.println("Merci de saisir a :");
        a = sc.nextInt();
        System.out.println("Merci de saisir b :");
        b = sc.nextInt();

        // affichage de contrôle
        System.out.println("Avant");
        System.out.println(a + " / " + b);

        // echange de valeur
        tampon = b;
        b = a;
        a = tampon;

        // affichage de contrôle
        System.out.println("Aprés");
        System.out.println(a + " / " + b);
    }

    /**
     * Exercice de permutations de 3 valeurs
     */
    public void exo1_7() {

        // Déclaration
        int a, b, c;
        int tampon;

        // demande de saisie
        System.out.println("Merci de saisir a :");
        a = sc.nextInt();
        System.out.println("Merci de saisir b :");
        b = sc.nextInt();
        System.out.println("Merci de saisir c :");
        c = sc.nextInt();

        // affichage de contrôle
        System.out.println("Avant");
        System.out.println(a + " / " + b + " / " + c);

        // echange de valeur
        tampon = c;
        c = b;
        b = a;
        a = tampon;

        // affichage de contrôle
        System.out.println("Aprés");
        System.out.println(a + " / " + b + " / " + c);
    }

    /**
     * description : Utils le prix TTC d'un article
     */
    public void exo2_1() {

        // Déclaration des variables
        float TVA;
        float prixHT, prixTTC;
        String result;

        // Appel de la methode exo2_2
        result = exo2_2(sc);
        System.out.println("Bonjour " + result);
        // demande de la TVA
        System.out.println("Merci de donner le taux TVA ?");
        TVA = sc.nextFloat();
        // demande du prix à calculer
        System.out.println("Merci de donner le prix HT?");
        prixHT = sc.nextFloat();
        // calcul et affichage du résultat
        prixTTC = prixHT * (1 + (TVA / 100));
        System.out.println("Le prix TTC du montant de " + prixHT + "€ est de " + prixTTC + "€");
    }

    /**
     * Méthode de saisie nom et prenom
     *
     * @param scan le scanner pour la saisie
     * @return le résultat de la concaténation prenom + nom
     */
    public String exo2_2(Scanner scan) {
        // Déclaration des variables
        String nom, prenom;
        // demande le nom de l'utilisateur
        System.out.println("Merci de saisir votre prénom ?");
        prenom = scan.nextLine();
        System.out.println("Merci de saisir votre nom ?");
        nom = scan.nextLine();
        // concaténation prenom + nom
        return prenom + " " + nom;
    }

    /**
     * Exercice 2.3 : Le produit de 2 nombres
     * positif ou négatif ?
     */
    public void leProduit() {
        int a, b, resultat;

        System.out.println("Merci de saisir a :");
        a = sc.nextInt();
        System.out.println("Merci de saisir b :");
        b = sc.nextInt();
        resultat = a * b;
        System.out.println("le résultat = " + resultat);
        if (resultat == 0) {
            System.out.println("Le produit est nul");
        } else if (resultat > 0) {
            System.out.println("Le produit est positif");
        } else {
            System.out.println("Le produit est négatif");
        }
    }

    /**
     * Exercice 3.1 : plus petit ou plus grand
     */
    public void plusPetitPlusGrand() {
        int saisie;
        System.out.println("Merci de saisir un nombre :");

        saisie = sc.nextInt();
        while (saisie < 10 || saisie > 20) {
            if (saisie < 10) {
                System.out.println("plus grand");
            }
            if (saisie > 20) {
                System.out.println("plus petit");
            }
            System.out.println("Retente ta chance :");
            saisie = sc.nextInt();
        }
        System.out.println("Gagné !! : " + saisie);
    }

    /**
     * calcul du factorielle d'un nombre
     * Exercice 3.2 méthode simple
     */
    public void factorielle() {

        // déclaration de variables.
        int saisie, resultat;

        // demande de saisie
        System.out.println("Merci de saisir un nombre :");
        saisie = sc.nextInt();

        // initialisation et parcours pour le calcul
        resultat = 0;
        for (int i = 0; i <= saisie; i++) {
            if (i == 0) {
                resultat = 1;
            } else {
                resultat = resultat * i;
            }
        }
        // affichage du résultat
        System.out.println("Factorielle : " + resultat);
    }

    /**
     * Utils du factorielle d'un nombre
     * Exercice 3.2 Méthode récursif
     */
    public void factoRecur() {

        int saisie, resultat;
        // demande de saisie
        System.out.println("Merci de saisir un nombre :");
        saisie = sc.nextInt();
        // affichage du résultat
        System.out.println("Factorielle " + facto(saisie));
    }

    /**
     * Methode récursive de calcul factorielle
     * Exercice 3.2
     * @param valeur valeur à calculer
     * @return int : résultat du calcul
     */
    private int facto(int valeur) {
        // cas de base
        if (valeur == 0) {
            return 1;
            // appel récursif
        } else
            return valeur * facto(valeur - 1);
    }

    /**
     * Utils de la moyenne de notes à partir d'un tableau
     * Exercice 4.1
     */
    public void moyenneNotes() {

        // Déclaration de variables
        float[] tableauNotes = new float[10];
        float resultat = 0;
        float saisie;

        // saisie des notes
        for (int i = 0; i < tableauNotes.length; i++) {
            System.out.println("Merci de saisir une note [" + i + "] :");
            // récupération saisie
            saisie = sc.nextFloat();
            // sauvegarde de la saisie
            tableauNotes[i] = saisie;
            // calcul du total des notes
            resultat = resultat + saisie;
        }

        /*
        * TIPS
        * pour afficher un tableau : utilisation de la classe Arrays et de sa méthode toString
        */
        System.out.println(Arrays.toString(tableauNotes));
        /*
        * TIPS
         */

        // affichage tableau de la moyenne
        System.out.println("La moyenne des notes : " + resultat/tableauNotes.length);

        // tri_par_insertion
        //triParInsertion(tableauNotes);

        // tri à bulles
        triABulles(tableauNotes);
    }

    /**
     * Exercice 4.2
     * @param tableau
     */
    public void triParInsertion(float [] tableau) {
        // Déclarations
        int positionMax;
        float cle;

        //
        for(int i = 0; i < tableau.length; i++) {
            cle = tableau[i];
            positionMax = i - 1;
            while (positionMax >= 0 && tableau[positionMax] > cle) {
                tableau[positionMax + 1] = tableau[positionMax];
                positionMax = positionMax - 1;
            }
            tableau[positionMax + 1] = cle;
        }

        // affichage du tableau trié
        System.out.println(Arrays.toString(tableau));
    }

    /**
     * Exercice 4.2 : tri à bulles
     * avec affichage du tableau après tri
     * @param tableau
     */
    public void triABulles(float [] tableau) {
        // Déclaration
        float tampon;
        boolean permutation;

        permutation = true;
        while (permutation) {
            permutation = false;
            for (int i = 0; i < tableau.length-1; i++) {
                if (tableau[i] > tableau[i+1]) {
                    tampon = tableau[i];
                    tableau[i] = tableau[i+1];
                    tableau[i+1] = tampon;
                    permutation = true;
                }
            }
        }

        // affichage du tableau trié
        System.out.println(Arrays.toString(tableau));
    }


    /**
     * Recherche dichotomique.
     */
    public void rechercheDichotomique() {
        // Déclaration
        int min, max, indice = 0, nombre;
        boolean finie;
        int [] dictionnaire = {1, 3, 3, 4, 4, 5, 7, 8, 9, 10};

        // initialisation de min et max
        max = dictionnaire.length - 1;
        min = 0;

        // demande de saisie
        System.out.println("nombre à vérifier entre 1 et 10 :");
        nombre = sc.nextInt();
        finie = false;
        while (!finie) {
            indice = (max + min)/2;
            if (nombre < dictionnaire[indice]) {
                max = indice-1;
            } else {
                min = indice+1;
            }
            if (nombre == dictionnaire[indice] || max < min) {
                finie = true;
            }
        }
        if (nombre == dictionnaire[indice]) {
            System.out.println("le nombre existe");
        } else {
            System.out.println("le nombre n'existe pas");
        }
    }

}
