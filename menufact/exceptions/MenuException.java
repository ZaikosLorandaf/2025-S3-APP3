package menufact.exceptions;

/**
 * Exception pour les menus
 */
public class MenuException extends Exception{

    /**
     * Exception pour la classe Menu
     * @param message le message à afficher
     */
    public MenuException(String message){
        super("MenuException: " + message);
    }
}

