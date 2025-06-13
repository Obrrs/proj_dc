package exceptions;


public class DataAccessException extends Exception {
    // Construtor com apenas a mensagem
    public DataAccessException(String message) {
        super(message);
    }

    // Construtor com mensagem e causa
    public DataAccessException(String message, Throwable cause) {
        super(message, cause);
    }
}
