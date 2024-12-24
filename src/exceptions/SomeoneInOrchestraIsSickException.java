package exceptions;

public class SomeoneInOrchestraIsSickException extends Exception {

    private final String message;

    public SomeoneInOrchestraIsSickException(String message) {

        this.message = message;

//        System.exit(0);
    }

    @Override
    public String getMessage() {
        System.out.println("АПЧХИ!");
        return message;
    }
}
