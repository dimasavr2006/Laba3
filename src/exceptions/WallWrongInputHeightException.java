package exceptions;

public class WallWrongInputHeightException extends RuntimeException {

    private final double random;
    private final double height;
    private final String result;

    public WallWrongInputHeightException(double maxRandomHeight, double maxHeight) {
        this.random = maxRandomHeight;
        this.height = maxHeight;

        result = returner();

    }

    private String returner(){
        String toReturn;
        toReturn = "Максимальная высота стены: " + random + ", а рост маргариты: " + height + "что некорректно";
        return toReturn;
    }

    @Override
    public String getMessage() {
        return result;
    }
}
