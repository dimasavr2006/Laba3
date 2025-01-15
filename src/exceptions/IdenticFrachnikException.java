package exceptions;

public class IdenticFrachnikException extends RuntimeException {

    private final String message;

    public IdenticFrachnikException(String message) {

        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
