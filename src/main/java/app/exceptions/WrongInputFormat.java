package app.exceptions;

public class WrongInputFormat extends Exception {
    private String enteredData;

    public WrongInputFormat(String message, String enteredData) {
        super(message);
        this.enteredData = enteredData;
    }

    public String getEnteredData() {
        return enteredData;
    }
}
