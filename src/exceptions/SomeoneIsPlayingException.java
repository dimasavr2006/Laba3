package exceptions;

public class SomeoneIsPlayingException extends Exception {
    public SomeoneIsPlayingException(String message) {
        super(message);
    }
}
