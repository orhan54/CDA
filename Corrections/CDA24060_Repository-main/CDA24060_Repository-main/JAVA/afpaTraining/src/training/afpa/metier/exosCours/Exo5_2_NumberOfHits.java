package training.afpa.metier.exosCours;

import training.afpa.utility.InputAndDisplay;

import java.util.Arrays;

/**
 * Exercice 5.2 du cours
 * @author jboebion
 */
public class Exo5_2_NumberOfHits {
	
	public static void start() {
		
		int hits;
		int index;

		int[] arr = { 1, 2, 1, 5, 8, 9, 1, 6, 9 };
        int[] hitsTable = new int[50];


        // création du tableau des occurences avec des 0
        Arrays.fill(hitsTable, 0);

        // 1er boucle parcours du tableau
        for(int i=0;i<arr.length;i++) {
            // recuperation de la valeur et initialisation du compteur
            index = arr[i];
            hits = 0;
            // 2eme boucle : Comptage
            for(int j=0;j<arr.length;j++) {
                if(index==arr[j]) {
                    hits++;
                }
            }
            // positionnement dans le tableau récapitulatif du nombre des occurences
            hitsTable[index] = hits;
        }

        // affichage final
		InputAndDisplay.message(Arrays.toString(arr),1);
        InputAndDisplay.message(Arrays.toString(hitsTable),1);
	}
}
