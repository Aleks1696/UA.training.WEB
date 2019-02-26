package app.exceptions;

public class InputDataAlreadyExistException extends Exception {
    private String enteredData;

    public InputDataAlreadyExistException(String message, String enteredData) {
        super(message);
        this.enteredData = enteredData;
    }

    public String getEnteredData() {
        return enteredData;
    }
}
