package com.example.javafx;
import java.util.*;
import java.util.regex.Pattern;

public class Registration {

    public boolean emailValidate(String input) {
        String email = input;


        if (!wellFormed(email)) {
            return false;
        }

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

        for (String i : specialChars) {
            if (password.contains(i)) {
                return true;
            }
        }
       return false;
    }

    public boolean containsDigit (String input) {
        String password = input;

        if (!password.matches(".*\\d.*")) {
            return false;
        }
        return true;
    }

    public boolean containsLetter (String input) {
        String password = input;

        if (!password.matches(".*[a-zA-Z].*")) {
            return false;
        }
        return true;
    }

    public boolean wellFormed (String input) {
        String email = input;
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern emailPattern = Pattern.compile(emailRegex);
        if (email == null)
            return false;

        return emailPattern.matcher(email).matches();

    }

}
