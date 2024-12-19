package exceptions;

public class NotMovingArmsException extends Exception {

    private String message;

    public NotMovingArmsException(String message) {

        this.message = message;

//        System.exit(0);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
