package app.model;

import app.exceptions.InputDataAlreadyExistException;
import app.model.entity.EnumDBNote;
import app.model.entity.Note;

public class Model {
    private Note note;

    public Note createNote(String login, String email) {
        note = new Note(login, email);
        return note;
    }

    public void addNoteToDB() throws InputDataAlreadyExistException {
        EnumDBNote.checkNoteIfExist(note);
    }

    public Note getNote() {
        return note;
    }
}
