package Calc;

public class UnderflowException extends RuntimeException {
    public UnderflowException(String message) {
        super(message);
    }
    public UnderflowException() {
        super("Suma mai mica decat -MAX_INT");
    }

}
