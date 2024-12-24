package exceptions;

public class WrongHeadAngleException extends Exception {

    private final String message;

    public WrongHeadAngleException(String message) {
        this.message = message;
//        System.exit(0);
    }

    @Override
    public String getMessage() {
        System.out.println("Произошёл отрыв головы");
        return message;
    }
}
