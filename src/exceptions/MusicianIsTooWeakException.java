package exceptions;

public class MusicianIsTooWeakException extends Exception {

    private final String message;

    public MusicianIsTooWeakException(String message) {

        this.message = message;

//        System.exit(0);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
