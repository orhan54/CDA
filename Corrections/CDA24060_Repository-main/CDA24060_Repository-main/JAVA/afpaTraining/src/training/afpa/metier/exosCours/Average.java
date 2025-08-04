package training.afpa.metier.exosCours;

import training.afpa.utility.InputAndDisplay;

/**
 * @author jboebion
 */
public class Average {
	
	public static void start() {
		
		float result;
		int [] notes = new int[9];
		
		result = 0;
		for(int i=0; i<= 8; i++) {
			notes[i] = InputAndDisplay.getInt("Ecrire une notes n°" + i + ": ");
			result = result + notes[i];
		}
		
		InputAndDisplay.message("la moyenne est " + result/9, 1);
	}

}
