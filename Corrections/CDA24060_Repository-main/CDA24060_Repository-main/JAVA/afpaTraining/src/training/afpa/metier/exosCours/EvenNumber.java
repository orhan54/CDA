package training.afpa.metier.exosCours;


import training.afpa.utility.InputAndDisplay;

/**
 * @author jboebion
 */
public class EvenNumber {

    /**
     * Écrire un algorithme qui demande à l'utilisateur d'entrer
     * un nombre entier positif et affiche tous les nombres
     * pairs de 0 jusqu'à ce nombre
     */
	public static void start() {
		
		int valeur = 0; 
	
		while(valeur <= 0) {	
			System.out.println("le nombre doit être positif. Merci !");
			valeur = InputAndDisplay.getInt("Entrer un nombre : ");
		}
		
		String message = "les nombres pairs jusqu'a " + valeur + " sont : ";
		
		System.out.println(message);
		
		for(int i=0; i<=valeur; i++) {
			if (i%2 == 0) {
				
				System.out.println(i);
			}
		}
		
		InputAndDisplay.close();
	}
}
