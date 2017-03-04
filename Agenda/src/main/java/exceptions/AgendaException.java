package exceptions;

/**
 * Indica uma exceção de cliente *
 */
public class AgendaException extends Exception {

    /**
     * Construtor de exceções que permite informar uma mensagem *
     */
    public AgendaException(String message) {
        super(message);
    }

}
