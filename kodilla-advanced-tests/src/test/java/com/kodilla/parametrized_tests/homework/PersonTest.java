package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @ParameterizedTest
    @MethodSource("providePeopleForBMI")
    public void shouldReturnCorrectBMI(Person person, String expected) {
        assertEquals(expected, person.getBMI());
    }

    private static Stream<Arguments> providePeopleForBMI() {
        return Stream.of(
                Arguments.of(new Person(1.80, 50), "Severely underweight"),
                Arguments.of(new Person(1.70, 65), "Normal (healthy weight)"),
                Arguments.of(new Person(1.60, 80), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.75, 95), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.50, 110), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.85, 150), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.60, 200), "Obese Class VI (Hyper Obese)")
        );
    }
}
