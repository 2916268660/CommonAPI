package exception;

public class CustomizeException extends Exception {
    String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CustomizeException() {
    }

    public CustomizeException(String message) {
        this.message = message;

    }
}
