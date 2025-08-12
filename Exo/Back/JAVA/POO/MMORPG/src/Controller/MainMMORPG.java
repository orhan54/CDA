package Controller;

import Model.Guerrier;
import Model.Soigneur;
import Model.Voleur;
import View.viewMMORPG;

import java.util.Scanner;

public class MainMMORPG {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        viewMMORPG view = new viewMMORPG();
        view.vueCreation();
        MainMMORPG mainMMORPG = new MainMMORPG();
        mainMMORPG.run();

    }

    private boolean finProgramme = true;

    public boolean finProgramme() {
        return finProgramme();
    }

    //methode logique programme
    public void run(){
        MainMMORPG mainMMORPG = new MainMMORPG();
        mainMMORPG.choixMenu();
    }

    public void choixMenu(){
        System.out.println("Choisir le menu entre [1 et 4] : [0] pour quitter ");
        System.out.println("1 - afficher tout les guerriers : ");
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
                viewMMORPG.afficherGerrier(Guerrier.getGuerriers());
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

}