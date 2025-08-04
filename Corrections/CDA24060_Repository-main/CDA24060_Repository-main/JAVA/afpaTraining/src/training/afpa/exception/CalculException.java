package training.afpa.exception;

/**
 * Classe pour la gestion des exceptions de la methode Utils
 * @author jboebion
 */
public class CalculException extends Exception{

    public CalculException( String message ) {
        super(message);
    }

    public CalculException( ) {
        super();
    }
}
