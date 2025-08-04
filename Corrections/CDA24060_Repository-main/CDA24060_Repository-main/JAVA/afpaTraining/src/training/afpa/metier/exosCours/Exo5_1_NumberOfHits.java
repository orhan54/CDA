package training.afpa.metier.exosCours;

import training.afpa.utility.InputAndDisplay;
import java.util.Arrays;

/**
 * Exercice 5.1 du cours
 * @author jboebion
 */
public class Exo5_1_NumberOfHits {
	
	public static void start() {
		
		int hits=0;
		int index;
		int[] arr = { 1, 2, 1, 5, 8, 9, 1, 6, 9 };
		
		index = InputAndDisplay.getInt("Nombre à rechercher entre 0-20 :");
		
		for (int i=0; i < arr.length; i++) {
			if (arr[i] == index ) {
				hits ++;
			}
		}

		InputAndDisplay.message(Arrays.toString(arr),1);
		InputAndDisplay.message(index + " est représenté " + hits + " fois",1);
	}
}
