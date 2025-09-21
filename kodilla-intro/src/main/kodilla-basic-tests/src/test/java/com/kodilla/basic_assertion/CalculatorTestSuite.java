package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(9.0, 8.0);
        assertEquals(1.0, result, 0.001);  // delta 0.001
    }

    @Test
    public void testPowerWithPositiveBase() {
        Calculator calculator = new Calculator();
        double result = calculator.power(2.0, 3.0); // 2^3 = 8
        assertEquals(8.0, result, 0.001);
    }

    @Test
    public void testPowerWithZeroBase() {
        Calculator calculator = new Calculator();
        double result = calculator.power(0.0, 5.0); // 0^5 = 0
        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testPowerWithNegativeBaseEvenExponent() {
        Calculator calculator = new Calculator();
        double result = calculator.power(-2.0, 2.0); // (-2)^2 = 4
        assertEquals(4.0, result, 0.001);
    }

    @Test
    public void testPowerWithNegativeBaseOddExponent() {
        Calculator calculator = new Calculator();
        double result = calculator.power(-2.0, 3.0); // (-2)^3 = -8
        assertEquals(-8.0, result, 0.001);
    }
}