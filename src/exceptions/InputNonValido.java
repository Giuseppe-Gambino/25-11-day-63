package exceptions;

public class InputNonValido extends RuntimeException {
  public InputNonValido(String message) {
    super(message);
  }
}
