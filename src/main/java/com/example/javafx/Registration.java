package com.example.javafx;

public class Registration {

    public boolean emailValidate(String input) {
        return true;
    }

    public boolean passwordValidate(String input) {
        String password = input;
        boolean current_return = true;

        if (password.length() < 7) {
            current_return = false;
        }

        return current_return;
    }
}
