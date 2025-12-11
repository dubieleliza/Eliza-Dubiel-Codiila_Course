package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearTest {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {
        Year year = new Year(1600);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }
    @Test
    public void shouldNotBeLeapYearIfDivisibleBy100ButNot400() {
        Year year = new Year(1700);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4ButNot100() {
        Year year = new Year(2016);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfNotDivisibleBy4() {
        Year year = new Year(2019);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }
}
