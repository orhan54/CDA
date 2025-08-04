package training.afpa.utility;

import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Classe pour traiter les demandes d'affichage des boîtes de dialogue
 * @author jboebion
 */
public class DialogBox {

    /**
     * Afficher boite de dialogue int.
     *
     * @param message     the message
     * @param title       the titre
     * @param yesNoOption the yes no option
     * @return the int
     */
    public static int displayDialogBox(String message, String title, int yesNoOption) {
        return showConfirmDialog(null, message, title, yesNoOption);
    }

    /**
     * Saisir entier int.  EN COUS DE DEVELOPPEMENT
     *
     * @param message the message à afficher
     * @param title   the titre de la dialogbox
     * @return the int : la réponse
     */
    public static int enterInt(String message, String title) {

        int entier = 0;
        boolean finie = false;
        String valeurSaisie = "";

        while (!finie) {
            valeurSaisie = showInputDialog(null, message, title, QUESTION_MESSAGE);
            //showInputDialog(null, "Veuillez la valeur d'un entier ", "Entier", QUESTION_MESSAGE);
            try {
                entier = Integer.parseInt(valeurSaisie);
                finie = true;
            } catch (NumberFormatException nfe) {
                showMessageDialog(null, "Veuillez entrer un entier SVP ", "Erreur", ERROR_MESSAGE);
            }
        }
        return entier;
    }

    /**
     *  Methode pour afficher un tableau dans une boite de dialogue
     * @param array
     * @param title
     */
    public static void displayArrayDialogBox(int [] array, String title) {

        // separateur en chaque valeur
        final String splitter = " | ";

        // utilisatation d'un StringBuilder pour eviter de créer trop de String
        StringBuilder message = new StringBuilder();

        // forEach du tableau et construction du message à afficher
        for (int j : array) {
            message.append(j).append(splitter);
        }

        // affichage de la dialogBox
        showMessageDialog(null, message.toString(), title, INFORMATION_MESSAGE);

        InputAndDisplay i = new InputAndDisplay();

    }

}
