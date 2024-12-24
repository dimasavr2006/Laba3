package exceptions;

public class WrongArmPositionException extends Exception {

    private final String message;

    public WrongArmPositionException(String message) {
        this.message = message;
//        System.exit(0);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
