package training.afpa.metier.exosCours;


import training.afpa.utility.InputAndDisplay;

/**
 * @author jboebion
 */
public class Potato {

    public static void potato() {

        int turn = 0;
        final int CART = 3;

        // demande  utilisateur
        int pdt = InputAndDisplay.getInt("Nombre de pommes de terres : ");

        // sauvegarde de la quantité
        int totalPdt = pdt;

        while (pdt >= 3) {
            pdt = pdt - CART;
            turn++;
        }

        if (pdt > 0) {
            turn++;
        }

        String message = "Pour éplucher " + totalPdt + ", il faut " + turn + " allers-retours.";
        InputAndDisplay.message(message,1);

    }

}
