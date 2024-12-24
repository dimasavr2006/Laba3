package exceptions;

public class WallHeightException extends Exception {

    private final String message;

    public WallHeightException(String message) {
        this.message = message;
//        System.exit(0);

    }

    @Override
    public String getMessage() {
        return message;
    }
}
