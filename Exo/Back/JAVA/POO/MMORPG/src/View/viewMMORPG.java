package View;

import Model.Guerrier;
import Model.Soigneur;
import Model.Voleur;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class viewMMORPG {

    //lecture des saisie clavier
    static Scanner sc = new Scanner(System.in);

    private static String nom;
    private static String classe;
    private static String race;
    private static String sexe;

    public static String getNom() {
        return nom;
    }

    public static String getClasse() {
        return classe;
    }

    public static String getRace() {
        return race;
    }

    public static String getSexe() {
        return sexe;
    }

    public static void vueCreation() {
        try {
                System.out.println("Bienvenue dans le nouveau MMORPG");
                System.out.println("Veuillez choisir votre nom : ");
                nom = sc.nextLine().toLowerCase();
                System.out.println("Veuillez choisir votre classe : ");
                classe = sc.nextLine().toLowerCase();
                    if(classe.equals("guerrier")){
                        List<Guerrier> guerriers = new ArrayList<Guerrier>();
                    } else if (classe.equals("voleur")) {
                        List<Voleur> voleurs = new ArrayList<>();
                    } else if (classe.equals("soigneur")) {
                        List<Soigneur> soigneurs = new ArrayList<>();
                    } else {
                        System.out.println("Veuillez choisir une classe valide !!");
                    }
            System.out.println("Veuillez choisir votre race : ");
                race = sc.nextLine().toLowerCase();
                System.out.println("Veuillez choisir votre sexe :(Homme ou Femme) ");
                sexe = sc.nextLine().toLowerCase();
        }catch (Exception e){
            System.out.println("Erreur sur l'enregistrement !!!!");
        }
    }

    public static void afficherGerrier(List<Guerrier> guerriers) {
        System.out.println("Voici tout les guerriers : ");
        for (Guerrier guerrier : guerriers) {
            System.out.println(guerrier.toString());
        }
    }

    public static void afficherVoleurs(List<Voleur> voleurs) {
        System.out.println("Voici tout les voleurs : ");
        for (Voleur voleur : voleurs) {
            System.out.println(voleur.toString());
        }
    }

    public static void afficherSoigneurs(List<Soigneur> soigneurs) {
        System.out.println("Voici tout les soigneurs : ");
        for (Soigneur soigneur : soigneurs) {
            System.out.println(soigneur.toString());
        }
    }

    public static void recherchePerso() {
        System.out.println("recherche nom de perso");
        System.out.println("Saisir le nom : ");
        nom = sc.nextLine();
    }

    public static void afficherGroupe() {

    }



}
