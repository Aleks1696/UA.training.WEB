package app.controller;

import app.exceptions.WrongInputFormat;
import app.view.View;

import static app.controller.Regex.*;

public class InputController {
    private String login;
    private String email;

    public void validateInput(String login, String email) throws WrongInputFormat {
        UtilityController uController = new UtilityController();
        this.login = uController.inputValueValidation(login, US_NICK_NAME_REGEX);
        this.email = uController.inputValueValidation(email, EMAIL_REGEX);
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
