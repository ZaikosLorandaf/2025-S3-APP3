package menufact.plats;

public class PlatException extends Exception{
    /**
     * Exception relié au plat
     * @param message le message
     */
    public PlatException(String message){
        super("PlatException : "+message);
    }
}
