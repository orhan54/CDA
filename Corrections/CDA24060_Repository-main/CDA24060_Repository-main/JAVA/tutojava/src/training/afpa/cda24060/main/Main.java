package training.afpa.cda24060.main;

import training.afpa.cda24060.poo.Computer;

import java.io.Console;
import java.util.Scanner;

public class Main {

    // Bloc de déclaration des variables/constantes globales

    /**
     * Méthode main de l'application
     * @param args  arguments du programme
     */
    public static void main(String[] args) {

        Main main = new Main();
        main.run();

    }

    /**
     * Méthode contenant la logique du programme
     */
    public void run(){

        // bloc de déclaration des variables/constantes locales

        // code...
        System.out.println("Hello World!");

        // Création des instances
        Computer computer = new Computer(64, "Intell", "500Gb");
        Computer computer2 = new Computer(64, "Intell");
        Computer computer3 = new Computer();
        // affichage
        System.out.println(computer.getCpu());
        // modification d'une propriété
        computer.setCpu("AMD");

        computer.

        System.out.println(computer.getCpu());
        // Affichage du nombre d'instance
        System.out.println(Computer.getNumberOfComputers());


    }
}
