package menufact.exceptions;

/**
 * Exception pour les quantités négative
 */
public class NegativeQuantity extends Exception {
    private String message;

    /**
     * Exception pour les quantités négatives
     * @param error le message
     */
    public NegativeQuantity(String error){
        message = error;
    }
}

