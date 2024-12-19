package exceptions;

public class WallWrongInputHeightException extends RuntimeException {

  private String random;
  private String height;
  private String result;

  public WallWrongInputHeightException(String maxRandomHeight, String maxHeight) {
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
