package com.example.javafx;
import java.util.*;

public class Registration {

    public boolean emailValidate(String input) {
        return true;
    }

    public boolean passwordValidate(String input) {
        String password = input;
        boolean current_return = true;

        if (!validateLength(password)) {
            current_return = false;
        }

        if (!containsSpecialChar(password))
            current_return = false;

        return current_return;
    }

    public boolean validateLength (String input) {
        String password = input;

        if (password.length() < 7) {
            return false;
        }

        else return true;
    }

    public boolean containsSpecialChar (String input) {
        String password = input;
        String[] specialChars = {"^","&","@","!"};

        for (String character: specialChars) {
            if (password.contains(character)) {
                return false;
            }
        }
       return true;
    }
}
