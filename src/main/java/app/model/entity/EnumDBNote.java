package app.model.entity;

import app.exceptions.InputDataAlreadyExistException;

public enum EnumDBNote {
    USER_1("robbie7", "rob@gmil.com"),
    USER_2("MAT", "Roling_Mat@unp.com");

    private String nickName;
    private String email;

    EnumDBNote(String nickName, String email) {
        this.nickName = nickName;
        this.email = email;
    }

    public static void checkNoteIfExist(Note note) throws InputDataAlreadyExistException {
        String nickName = note.getLogin();
        String email = note.getEmail();
        for (EnumDBNote user : EnumDBNote.values()) {
            if (nickName.equals(user.nickName)) {
                throw new InputDataAlreadyExistException(
                        "User with nick name: %s is already registered", nickName);
            } else if (email.equals(user.email)) {
                throw new InputDataAlreadyExistException(
                        "User with email: %s is already registered", email);
            }
        }
    }
}
