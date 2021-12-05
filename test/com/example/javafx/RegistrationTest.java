package com.example.javafx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationTest {


    @Test
    public void WellFormedIsAccepted() {
    }

    @Test
    void badlyFormedIsRejected() {

    }

    @Test
    void PasswordLengthIsAccepted() {
        Registration validateLength = new Registration();
        assertTrue(validateLength.validateLength("1234567chars"));
        assertTrue(validateLength.validateLength("11CHARACTERS"));
    }

    @Test
    void PasswordLengthIsRejected() {
        Registration validateLength = new Registration();
        assertFalse(validateLength.passwordValidate("few"));
        assertFalse(validateLength.passwordValidate("5char"));
    }

    @Test
    void PasswordContainsLetterIsAccepted() {
        Registration containsSpecialChar = new Registration();
        assertFalse(containsSpecialChar.containsSpecialChar("has@"));
        assertFalse(containsSpecialChar.containsSpecialChar("exclamation!"));
    }

    @Test
    void PasswordContainsLetterIsRejected() {
        Registration containsSpecialChar = new Registration();
        assertFalse(containsSpecialChar.passwordValidate("few"));
        assertFalse(containsSpecialChar.passwordValidate("5char"));

    }

/*
    @Test
    void PasswordContainsDigitIsAccepted() {
    }

    @Test
    void PasswordContainsDigitIsRejected() {
    }

    @Test
    void PasswordContainsSpecialCharIsAccepted() {

    }

    @Test
    void PasswordContainsSpecialCharIsRejected() {

    }
*/

}