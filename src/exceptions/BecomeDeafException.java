package exceptions;

public class BecomeDeafException extends Exception {

    private String message;

    public BecomeDeafException(String message) {
        this.message = message;
//        System.exit(0);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
