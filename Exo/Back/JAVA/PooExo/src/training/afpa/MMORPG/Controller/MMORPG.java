package training.afpa.MMORPG.Controller;

import training.afpa.MMORPG.Model.Classe;
import training.afpa.MMORPG.Model.Personnage;
import training.afpa.MMORPG.Model.Race;
import training.afpa.MMORPG.Model.Voleur;

import java.util.Scanner;

public class MMORPG {

    //point d'entrée qui crée une instance
    public static void main(String[] args) {
        MMORPG obj = new MMORPG();
        obj.run();
    }

    public void run(){
        //lecture saisie du clavier
        Scanner sc = new Scanner(System.in);

        //variables pour stocker les saisies

        String nom = "";
        int lvl = 1;
        int pdv = 100;
        String classe = "";
        Race race = null;

        System.out.println("=============================================================================");
        System.out.println("                  [   Création du personnage   ]");
        System.out.println("");
        System.out.println("Quelle classe vous voulez créer : (guerrier, voleur ou soigneur)");
        System.out.println("=============================================================================");
        classe = sc.nextLine();

        try {
            switch (classe) {
                case "guerrier":
                    if (classe.equals("guerrier")) {
                        System.out.println("Création de votre Guerrier : ");
                        System.out.print("Saisir le nom : ");
                        nom = sc.nextLine();
                        break;
                    }
                case "voleur":
                    if (classe.equals("voleur")) {
                        System.out.println("Création du voleur : ");
                        System.out.print("Saisir le nom : ");
                        nom = sc.nextLine();
                        break;
                    }
                case "soigneur":
                    if (classe.equals("soigneur")) {
                        System.out.println("Création du soigneur : ");
                        System.out.print("Saisir le nom : ");
                        nom = sc.nextLine();
                        break;
                    }
                default:
                    System.out.println("La classe n'existe pas");
                    break;
            }
        }catch(Exception e){
            System.out.println("Erreur : " + e.getMessage());
        }

        sc.close();
    }

}
