package com.example.javafx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationTest {


    @Test
     void WellFormedIsAccepted() {
        Registration wellformed = new Registration();
        assertTrue(wellformed.wellFormed("s@gmail.com"));
        assertTrue(wellformed.wellFormed("test@example.com"));
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
        Registration containsLetter = new Registration();
        assertTrue(containsLetter.containsLetter("h11as"));
        assertTrue(containsLetter.containsLetter("ex1"));
    }

    @Test
    void PasswordContainsLetterIsRejected() {
        Registration containsLetter = new Registration();
        assertFalse(containsLetter.containsLetter("112233"));
        assertFalse(containsLetter.containsLetter("@%&^**"));
    }

    @Test
    void PasswordContainsDigitIsAccepted() {
        Registration containsDigit = new Registration();
        assertTrue(containsDigit.containsDigit("h11as"));
        assertTrue(containsDigit.containsDigit("ex1"));
    }

    @Test
    void PasswordContainsDigitIsRejected() {
        Registration containsDigit = new Registration();
        assertFalse(containsDigit.containsDigit("noneumber"));
        assertFalse(containsDigit.containsDigit("example"));
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