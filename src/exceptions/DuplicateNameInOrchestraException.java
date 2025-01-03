package exceptions;

public class DuplicateNameInOrchestraException extends RuntimeException {

    private final String message;

    public DuplicateNameInOrchestraException(String message) {
        this.message = choseMode(message);
    }
    private String choseMode(String message) {
        if (message.equals("2")) {
            return "Между двумя частями оркестра";
        }
        else if (message.equals("1")) {
            return "В одной из частей оркестра";
        }
        return null;
    }

    @Override
    public String getMessage() {
        return message + " произошёл повтор";
    }
}
