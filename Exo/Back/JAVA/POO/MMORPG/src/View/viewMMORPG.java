package View;

import Model.Groupe;
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

    public static void acceuilMMORPG() {
        try {
            System.out.println("");
            System.out.println("              [ ---   Bienvenue dans le nouveau MMORPG AFPA   --- ]");
            System.out.println("");
            System.out.println("Choisir une option entre : [1-3]");
            System.out.println("1 - Créer un personnage : ");
            System.out.println("2 - Option :");
            System.out.println("3 - Exit");

            int choixMenu = sc.nextInt();// lecture du choix Menu

            if (choixMenu == 1) {
                vueCreation();
            }else if (choixMenu == 2) {
                vueOption();
            }else if (choixMenu == 3) {
                System.exit(0);
            }
        }catch(Exception e){
            System.out.println("erreur au lancement de l'acceuil du MMORPG   :/  ");
        }finally {
            sc.nextLine();
        }
    }

    public static void vueCreation() {
        try {
                System.out.println("              [ ---   Création du personnage AFPA   --- ]");
                System.out.println("");
                System.out.println("Veuillez choisir votre nom : ");
                nom = sc.nextLine().toLowerCase();
                sc.nextLine();
                System.out.println("Veuillez choisir votre classe : ");
                classe = sc.nextLine().toLowerCase();
                System.out.println("Veuillez choisir votre race : ");
                race = sc.nextLine().toLowerCase();
                System.out.println("Veuillez choisir votre sexe :(Homme ou Femme) ");
                sexe = sc.nextLine().toLowerCase();

                //appel pour creation du personnage
                if(classe.equals("guerrier")){
                    Guerrier guerrier = new Guerrier(nom, race, sexe, 1);
                    Guerrier.getGuerriers().add(guerrier);
                } else if (classe.equals("voleur")) {
                    Voleur voleur = new Voleur(nom, race, sexe, 1);
                    Voleur.getVoleurs().add(voleur);
                } else if (classe.equals("soigneur")) {
                    Soigneur soigneur = new Soigneur(nom, race, sexe, 1);
                    Soigneur.getSoigneurs().add(soigneur);
                } else {
                    System.out.println("Veuillez choisir une classe valide !!");
                }
                System.out.println("Votre personnage est crée avec succès  =)  ");
                acceuilMMORPG();
        }catch (Exception e){
            System.out.println("Erreur sur l'enregistrement !!!!");
        }
    }

    public static void vueOption() {
        try {
            System.out.println("Veuillez choisir une option : ");
            System.out.println("");
            System.out.println("1 - Voir tout les peronnages d'une classe : ");
            System.out.println("2 - Recheche un personnage : ");
            System.out.println("3 - Supprime un personnage : ");
            System.out.println("4 - Information sur le personnage : ");

            int choixOPtion = sc.nextInt();
            if (choixOPtion == 1) {
                System.out.println("");
                System.out.println("1 - Voir les classes Guerriers : ");
                System.out.println("2 - Voir les classes Voleurs : ");
                System.out.println("3 - Voir les classes Soigneurs : ");
                System.out.println("4 - Retour accueil : ");

                int choixToutClasses = sc.nextInt();
                switch (choixToutClasses) {
                    case 1:
                        afficherGuerrier(Guerrier.getGuerriers());
                        break;
                    case 2:
                        afficherVoleurs(Voleur.getVoleurs());
                        break;
                    case 3:
                        afficherSoigneurs(Soigneur.getSoigneurs());
                        break;
                    case 4:
                        System.out.println("Retour accueil !!");

                }
            }
            if (choixOPtion == 2) {
                System.out.println("Saisir le nom du personnage a rechercher : ");
                nom = sc.nextLine();
            }
            if (choixOPtion == 3) {
                System.out.println("Supprimer un personnage : ");
                nom = sc.nextLine();

            }if (choixOPtion == 4) {
                System.out.println("Information sur le personnage : ");
                nom = sc.nextLine();
            }


        }catch(Exception e){
            System.out.println("erreur au lancement de l'option !!!!");
        }
    }

    public static void afficherGuerrier(List<Guerrier> guerriers) {
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
        System.out.println("Voici tout les groupes : ");
        for (Groupe groupe : Groupe.getGroupes()) {
            System.out.println(groupe.toString());
        }
    }



}
