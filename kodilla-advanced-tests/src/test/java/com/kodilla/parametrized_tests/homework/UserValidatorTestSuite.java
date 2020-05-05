package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"ghh@jk.pl", "aaa@ss.li"})
    public void shouldValidateEmailWorkingCorrectForCorrectEmail(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

//    @ParameterizedTest
//    @ValueSource(strings = {"ghhjk.pl", "aaa@ssli", "@",""})
//    public void shouldValidateEmailWorkingCorrectForEmailDoesNotMatchThePattern(String email) {
//        assertFalse(userValidator.validateEmail(email));
//    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsNull(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Janek\n", "Piotrek\n"})
    public void shouldValidateUsernameWorkingCorrectForCorrectUsername(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"gk\n", "aa?ss\n", "aa@ss\n", "aa!ss\n", "\n", ""})
    public void shouldValidateUsernameWorkingCorrectFortUsernameDoesNotMatchThePattern(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

//    @ParameterizedTest
//    @NullSource
//    public void shouldReturnFalseIfUsernameIsNull(String username) {
//        assertFalse(userValidator.validateUsername(username));
//    }
}