package exceptions;

public class SomeoneIsPlayingException extends Exception {

    private final String message;

    public SomeoneIsPlayingException(String message) {

        this.message = message;

//        System.exit(0);
    }

    @Override
    public String getMessage() {
        System.out.println("ТРУНЬ ТРунь трууууунь");
        return message;
    }
}
