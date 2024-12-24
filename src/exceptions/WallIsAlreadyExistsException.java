package exceptions;

public class WallIsAlreadyExistsException extends Exception {

    private final String message;

    public WallIsAlreadyExistsException(String message) {
        this.message = message;
//        System.exit(0);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
