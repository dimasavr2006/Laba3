package exceptions;

public class DuplicateNameInOrchestraException extends RuntimeException {

    private final String message;
    private final String between = "Между двумя частми оркестра";
    private final String inOne = "В одной части оркестра";

    public DuplicateNameInOrchestraException(String message) {
        this.message = choseMode(message);
    }
    private String choseMode(String message) {
        if (message.equals("2")) {
            return between;
        }
        else if (message.equals("1")) {
            return inOne;
        }
        return null;
    }

    @Override
    public String getMessage() {
        return message + " Произошёл повтор";
    }
}
