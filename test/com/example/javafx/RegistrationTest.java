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

    /*
    @Test
    void PasswordContainsLetterIsAccepted() {

    }

    @Test
    void PasswordContainsLetterIsRejected() {

    }
*/

    @Test
    void PasswordContainsDigitIsAccepted() {
        Registration containsDigit = new Registration();
        assertTrue(containsDigit.containsSpecialChar("h11as"));
        assertTrue(containsDigit.containsSpecialChar("ex1"));
    }

    @Test
    void PasswordContainsDigitIsRejected() {
    }

    @Test
    void PasswordContainsSpecialCharIsAccepted() {
        Registration containsSpecialChar = new Registration();
        assertTrue(containsSpecialChar.containsSpecialChar("h@as"));
        assertTrue(containsSpecialChar.containsSpecialChar("ex!clamation"));
    }

    @Test
    void PasswordContainsSpecialCharIsRejected() {
        Registration containsSpecialChar = new Registration();
        assertFalse(containsSpecialChar.passwordValidate("few"));
        assertFalse(containsSpecialChar.passwordValidate("5char"));
    }


}