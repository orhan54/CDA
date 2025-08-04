package training.afpa.cda24060.exercices;

import java.util.Scanner;

public class HelloWorld {

    public void helloworld() {

        String nom;
        String prenom;

        Scanner in = new Scanner(System.in);
        System.out.println("Merci de saisir votre prenom ?");
        prenom = in.nextLine();
        System.out.println("Merci de saisir votre nom ?");
        nom = in.nextLine();

        System.out.println("Bonjour " + prenom);
        System.out.println("Votre nom est " + nom);

    }
}
