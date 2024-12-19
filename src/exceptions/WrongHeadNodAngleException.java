package exceptions;

public class WrongHeadNodAngleException extends Exception {

    private String message;

    public WrongHeadNodAngleException(String message) {
        this.message = message;
//        System.exit(0);
    }

    @Override
    public String getMessage() {
        System.out.println("Кто-то сломал шею :)");
        return message;
    }
}
