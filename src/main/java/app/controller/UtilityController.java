package app.controller;

import app.exceptions.WrongInputFormat;
import app.view.Messages;

public class UtilityController {

    public String inputValueValidation(String input, String regex) throws WrongInputFormat {
        if (!input.matches(regex)) {
            throw new WrongInputFormat(Messages.ERROR_MESSAGE, input);
        } else {
            return input;
        }
    }
}
