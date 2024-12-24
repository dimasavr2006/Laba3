package exceptions;

public class DuplicateNameInOrchestraException extends RuntimeException {
    public DuplicateNameInOrchestraException(String message) {
        super(message);
    }
}
