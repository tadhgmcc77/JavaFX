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
        assertTrue(validateLength.passwordValidate("12345678CHARS"));
    }
    /*
    @Test
    void PasswordLengthIsRejected() {
    }

    @Test
    void PasswordContainsLetterIsAccepted() {
    }

    @Test
    void PasswordContainsLetterIsRejected() {
    }


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