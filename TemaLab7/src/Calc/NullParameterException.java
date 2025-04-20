package Calc;

public class NullParameterException extends RuntimeException {
    public NullParameterException(String message) {
        super(message);
    }

    public NullParameterException(){
        super("Parametrul nu poate fi NULL");
    }
}
