package menufact.exceptions;

public class NegativeQuantity extends Exception {
    private String message;
    public NegativeQuantity(String error){
        message = error;
    }
}

