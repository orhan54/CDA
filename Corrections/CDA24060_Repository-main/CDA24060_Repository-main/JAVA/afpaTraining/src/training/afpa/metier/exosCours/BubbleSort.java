package training.afpa.metier.exosCours;

import training.afpa.utility.InputAndDisplay;

import java.util.Arrays;

/**
 * @author jboebion
 */
public class BubbleSort {

	public static void start() {
		
		int arr[] ={84, 12, 1, 43, 5, 10}; 
		int taille = arr.length;
		int tmp = 0;
		
        InputAndDisplay.message("Avant : " + Arrays.toString(arr),1);
        
        // tri des elements de tableau avec le tri a bulle
		for (int i = 0; i < taille; i++) {
			for (int j = 1; j < (taille - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// echanges des elements
					tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}

			}
		}
		
        InputAndDisplay.message("Apres : " + Arrays.toString(arr),1);

	}
}
