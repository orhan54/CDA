package training.afpa.cda24060.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class MoyenneNotes {

    int[] notes = new int[5];

    public void moyenneNotes() {

        int moyenne = 0;
        float resultat = 0;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<notes.length; i++) {
            System.out.println("Veuillez saisir une note :");
            notes[i] = sc.nextInt();
            moyenne = moyenne + notes[i];
        }

        //System.out.println(Arrays.toString(notes));
        System.out.printf("[");
        for(int j=0; j<notes.length; j++) {
            System.out.printf(notes[j] + ",");
        }
        System.out.println("]");
        resultat = (float) moyenne /notes.length;
        System.out.println("La moyenne :" + resultat);
    }

    public int[] triInsertionNotes() {

        int cle;
        int j;

        for (int i = 0; i < notes.length; i++) {
            cle = notes[i];
            j = i - 1;
            while (j >= 0 && notes[j] > cle) {
                notes[j + 1] = notes[j];
                j =  j - 1;
            }
            notes[j + 1] = cle;
        }
        return notes;
    }
}
