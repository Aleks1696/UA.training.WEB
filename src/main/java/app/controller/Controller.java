package app.controller;

import app.exceptions.InputDataAlreadyExistException;
import app.exceptions.WrongInputFormat;
import app.model.Model;
import app.model.entity.Note;

public class Controller {
    private Model model = new Model();

    public Note processUser(final String login, final String email) throws WrongInputFormat, InputDataAlreadyExistException {
        InputController ic = new InputController();
        ic.validateInput(login, email);
        model.createNote(ic.getLogin(), ic.getEmail());
        model.addNoteToDB();
        Note note = model.getNote();
        return note;
    }
}
