package training.afpa.metier.exosCours;


import training.afpa.utility.InputAndDisplay;

/**
 * @author jboebion
 */
public class Dichotomie {

	public static void start() {
		
		boolean end = false;
		
		String[] dico = {"iphone", "PC", "Dev", "CDA" };
		
		String toFind = InputAndDisplay.getString("mot à vérifier ?");

		for (String word : dico) {
			if (word.equals(toFind)) {
				end = true;
			}
		}
		
		if (end) {
			InputAndDisplay.message("le mot " + toFind + " existe",1);
		} else {
			InputAndDisplay.message("le mot " + toFind + " n'existe pas",1);
		}
		
	}

}
