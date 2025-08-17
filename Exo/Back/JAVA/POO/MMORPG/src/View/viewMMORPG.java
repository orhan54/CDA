package View;

import Model.Groupe;
import Model.Guerrier;
import Model.Soigneur;
import Model.Voleur;
import utility.RegexUtili;

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
            while (true) {
                System.out.println("");
                System.out.println("              [ ---   Bienvenue dans le nouveau MMORPG AFPA   --- ]");
                System.out.println("");
                System.out.println("Choisir une option entre : [1-4]");
                System.out.println("1 - Jouer : ");
                System.out.println("2 - Créer un personnage : ");
                System.out.println("3 - Option :");
                System.out.println("4 - Exit");

                int choixMenu = sc.nextInt();// lecture du choix Menu

                if(RegexUtili.PositiveIntStrict(String.valueOf(choixMenu))) {
                    choixMenu = Integer.parseInt(String.valueOf(choixMenu));
                }else{
                    System.out.println("Erreur saisir un nombre qui correspond au menu !");
                    continue;
                }

                if(choixMenu == 1){
                    System.out.println("");
                    System.out.println("1 - En Solo : ");
                    System.out.println("2 - En groupe : ");
                    String choixModeJeu = sc.next();
                    switch (choixModeJeu) {
                        case "1":
                            System.out.println("Vous entrez en jeu =)  bonne chance ");
                            System.out.println("Saisir [0] pour revenir au menu : ");
                            int retourSolo = sc.nextInt();
                            if(retourSolo == 0){
                                acceuilMMORPG();
                            }
                            break;
                        case "2":
                            System.out.println("");
                            System.out.println("Le groupe se crée  =)  bonne chance ");
                            afficherGroupe();
                            System.out.println("Saisir [0] pour revenir au menu : ");
                            int retourGroupe = sc.nextInt();
                            if(retourGroupe == 0){
                                acceuilMMORPG();
                            }
                            break;
                    }
                }else if (choixMenu == 2) {
                    vueCreation();
                }else if (choixMenu == 3) {
                    vueOption();
                }else if (choixMenu == 4) {
                    System.exit(0);
                }
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
                sc.nextLine();
                System.out.println("Veuillez choisir votre nom : ");
                nom = sc.nextLine().toLowerCase();
                if(RegexUtili.regexAlpha(nom));
                else System.out.println("Erreur saisir votre nom !");
                System.out.println("Veuillez choisir votre classe : ");
                classe = sc.nextLine().toLowerCase();
                if(RegexUtili.regexAlpha(classe));
                else System.out.println("Erreur saisir votre classe !");
                System.out.println("Veuillez choisir votre race : ");
                race = sc.nextLine().toLowerCase();
                if(RegexUtili.regexAlpha(race));
                else System.out.println("Erreur saisir votre race !");
                System.out.println("Veuillez choisir votre sexe :(Homme ou Femme) ");
                sexe = sc.nextLine().toLowerCase();
                if(RegexUtili.regexAlpha(sexe));
                else System.out.println("Erreur saisir votre sexe !");

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
            System.out.println("1 - Voir les peronnages d'une classe : ");
            System.out.println("2 - Voir les groupes : ");
            System.out.println("3 - Recheche un personnage : ");
            System.out.println("4 - Supprime un personnage : ");

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
                afficherGroupe();
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
