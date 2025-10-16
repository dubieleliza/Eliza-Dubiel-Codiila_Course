package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {

    private final GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv", numLinesToSkip = 1)
    void shouldReturnValidResultForCorrectNumbers(String input) throws InvalidNumbersException {
        Set<Integer> userNumbers = convertToSet(input);
        int result = gamblingMachine.howManyWins(userNumbers);
        assertTrue(result >= 0 && result <= 6);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "1,2,3,4,5",
            "1,2,3,4,5,6,7",
            "0,2,3,4,5,6",
            "1,2,3,4,5,50",
            "1,1,2,3,4,5"
    })
    void shouldThrowExceptionForInvalidNumbers(String input) {
        Set<Integer> userNumbers = convertToSet(input);
        assertThrows(InvalidNumbersException.class,
                () -> gamblingMachine.howManyWins(userNumbers));
    }

    private Set<Integer> convertToSet(String input) {
        Set<Integer> numbers = new HashSet<>();
        Arrays.stream(input.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .forEach(numbers::add);
        return numbers;
    }
}
