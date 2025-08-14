package Controller;

import Model.Groupe;
import Model.Guerrier;
import Model.Soigneur;
import Model.Voleur;
import View.viewMMORPG;

import java.util.Scanner;

import static View.viewMMORPG.acceuilMMORPG;

public class MainMMORPG {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try{
            MainMMORPG mainMMORPG = new MainMMORPG();
            mainMMORPG.run();
        }catch (Exception e){
            System.out.println("Error au lancement du MMORPG" + e.getMessage());
        }
    }

    private boolean finProgramme = true;

    public boolean finProgramme() {
        return finProgramme();
    }

    //methode logique programme
    public void run(){
        initialisationMonde();
        acceuilMMORPG();
    }

    public void choixMenu(){
        System.out.println("Choisir le menu entre [1 et 4] : [0] pour quitter ");
        System.out.println("1 - afficher les guerriers : ");
        System.out.println("2 - afficher tout les voleurs : ");
        System.out.println("3 - afficher tout les soigneurs : ");
        System.out.println("4 - afficher tout les groupes : ");
        System.out.println("0 - Pour quitter : ");
        int choix = sc.nextInt();
        switch(choix){
            case 0:
                finProgramme = true;
                System.out.println("Vous avez quitter");
                break;
            case 1:
                viewMMORPG.afficherGuerrier(Guerrier.getGuerriers());
                break;
            case 2:
                viewMMORPG.afficherVoleurs(Voleur.getVoleurs());
                break;
            case 3:
                viewMMORPG.afficherSoigneurs(Soigneur.getSoigneurs());
                break;
            case 4:
                viewMMORPG.afficherGroupe();
                break;
            default:
                System.out.println("Erreur !");
                break;
        }
    }

    public static void initialisationMonde(){
        Guerrier g1 = new Guerrier("Conan", "humain", "homme", 1);
        Guerrier.getGuerriers().add(g1);
        Guerrier g2 = new Guerrier("Xena", "humain", "femme", 1);
        Guerrier.getGuerriers().add(g2);
        Voleur v1 = new Voleur("Marco", "elfe", "homme", 1);
        Voleur.getVoleurs().add(v1);
        Voleur v2 = new Voleur("Mouly", "goblin", "homme", 1);
        Voleur.getVoleurs().add(v2);
        Soigneur s1 = new Soigneur("Dafal", "humain", "femme", 1);
        Soigneur.getSoigneurs().add(s1);
        Soigneur s2 = new Soigneur("Parace", "orc", "femme", 1);
        Soigneur.getSoigneurs().add(s2);

        Groupe grp1 = new Groupe("Les ouff", "Conan", "Marco", "Dafal");
        //Groupe grp1 = new Groupe("Les ouff", "Conan", "Marco", "Dafal");
        Groupe.getGroupes().add(grp1);
    }

}