package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    private final UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {
            "abc",
            "user.name",
            "User_123",
            "user-name",
            "Ala12"
    })
    void shouldReturnTrueForValidUsernames(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "ab",
            "user!",
            "name with space",
            "",
            "ąęć",
            "12"
    })
    void shouldReturnFalseForInvalidUsernames(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @NullSource
    void shouldReturnFalseWhenUsernameIsNull(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "test@example.com",
            "user.name@sub.domain.co",
            "user+tag@example.com",
            "user_name-123@domain.com"
    })
    void shouldReturnTrueForValidEmails(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "",
            "user@domain",
            "user@domain.c",
            "user@domain.toolongtld",
            "user..dots@example.com"
    })
    void shouldReturnFalseForInvalidEmails(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @NullSource
    void shouldReturnFalseWhenEmailIsNull(String email) {
        assertFalse(validator.validateEmail(email));
    }
}
