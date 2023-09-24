package engineer.maiko.desafiodiodesignpatterns.api.exception;

public class EstoqueException extends Exception {

    public EstoqueException() {
        super();
    }

    public EstoqueException(String message) {
        super(message);
    }

    public EstoqueException(String message, Throwable cause) {
        super(message, cause);
    }
}
