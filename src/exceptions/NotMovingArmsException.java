package exceptions;

public class NotMovingArmsException extends Exception {

    private final String message;

    public NotMovingArmsException(String message) {

        this.message = message;

//        System.exit(0);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
