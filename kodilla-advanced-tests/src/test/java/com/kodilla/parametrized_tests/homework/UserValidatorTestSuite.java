package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"lll", "aaa"})
    public void shouldValidateUsernameWorkingCorrectForCorrectUsername(String username) {
        assertTrue(userValidator.validateUsername(username));
    }




}