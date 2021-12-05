package com.example.javafx;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Registration class to register users
 */
public class Registration {

    /**
     * Validates user inputted emails
     * @param input Email input by user
     * @return Boolean for whether email is accepted
     */
    public boolean emailValidate(String input) {
        String email = input;


        if (!wellFormed(email)) {
            return false;
        }

        return true;
    }

    /**
     * Validates user inputted passwords
     * @param input password input by user
     * @return Boolean for whether password is accepted
     */
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

    /**
     * Validates length of password
     * @param input  password input by user
     * @return boolean
     */
    public boolean validateLength (String input) {
        String password = input;

        if (password.length() < 7) {
            return false;
        }

        else return true;
    }

    /**
     * Validates if passwords have special characters
     * @param input password input
     * @return boolean
     */
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
    /**
     * Validates if passwords have a digit
     * @param input password input
     * @return boolean
     */
    public boolean containsDigit (String input) {
        String password = input;

        if (!password.matches(".*\\d.*")) {
            return false;
        }
        return true;
    }
    /**
     * Validates if passwords have a letter
     * @param input password input
     * @return boolean
     */
    public boolean containsLetter (String input) {
        String password = input;

        if (!password.matches(".*[a-zA-Z].*")) {
            return false;
        }
        return true;
    }
    /**
     * Validates if email is well-formed
     * @param input email input
     * @return boolean
     */
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
