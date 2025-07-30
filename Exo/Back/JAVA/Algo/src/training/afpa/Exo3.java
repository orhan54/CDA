package training.afpa;

import java.util.Scanner;

public class Exo3 {

    public void equationSecondDegre() {

        Scanner sc = new Scanner(System.in);

        // bloc variables
        int a;
        int b;
        int c;
        float delta;
        float resultat;

        System.out.println("Saisir la valeur de a : ");
        a = sc.nextInt();
        System.out.println("Saisir la valeur de b : ");
        b = sc.nextInt();
        System.out.println("Saisir la valeur de c : ");
        c = sc.nextInt();

        delta = (b*b) - (4*a*c);

        if (delta < 0) {
            System.out.println("Il n’y a pas de solution pour cette équation : ");
        }else {
            if (delta == 0) {
                resultat = -b/(2*a);
                System.out.printf("Il y a une solution double pour cette équation : ");
                System.out.println(resultat);
            }else{
                System.out.printf("Il y a 2 solutions pour cette équation : ");
                System.out.println(-b + (delta/2*a));
                System.out.printf(String.valueOf(-b - (delta/2*a)));
            }
        }
    }
}
