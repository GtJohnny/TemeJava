package Calc;

public class OverflowException extends RuntimeException {
    public OverflowException(String message) {
        super(message);
    }
    public OverflowException() {
        super("Suma mai mare decat MAX_INT!");
    }
}
