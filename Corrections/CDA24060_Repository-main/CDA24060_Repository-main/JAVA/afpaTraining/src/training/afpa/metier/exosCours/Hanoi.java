package training.afpa.metier.exosCours;

import training.afpa.utility.InputAndDisplay;

import java.lang.Math;

/**
 * @author jboebion
 */
public class Hanoi {

	public static void start() {
		
		int level = InputAndDisplay.getInt("Nombre de diques ? ");
		
		int total = (int) (Math.pow(level,2)-1);
		
		towerOfHanoi(level,'A','C','B');
		
		InputAndDisplay.message("Nombre de coups total : " + total,1);
	}
	
	private static void towerOfHanoi(int n, char start, char finish, char helper ) {
		
		if (n==1) {
			InputAndDisplay.message("prendre le disque 1 de la position " + start + " à la position " + finish,1);
			return;
		}
		
		towerOfHanoi(n-1, start, helper, finish);
		InputAndDisplay.message("prendre le disque " + n + " de la position " + start + " à la position " + finish,1);
		towerOfHanoi(n-1, helper, finish, start);

	}
	
}
