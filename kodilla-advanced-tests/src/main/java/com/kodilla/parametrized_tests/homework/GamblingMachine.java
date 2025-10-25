package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


class GamblingMachine {

    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers);
        Set<Integer> computerNumbers = generateComputerNumbers();
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    private void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (isNotCorrectSize(numbers) || isAnyNumberOutOfDeclaredScope(numbers)) {
            throw new InvalidNumbersException();
        }
    }

    private boolean isAnyNumberOutOfDeclaredScope(Set<Integer> numbers) {
        return numbers.stream()
                .anyMatch(number -> number < 1 || number > 49);
    }

    private boolean isNotCorrectSize(Set<Integer> numbers) {
        return numbers.size() != 6;
    }

    private Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while(numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
    }

    public static class Person {
        private double heightInMeters;
        private double weightInKilogram;

        public Person(double heightInMeters, double weightInKilogram) {
            this.heightInMeters = heightInMeters;
            this.weightInKilogram = weightInKilogram;
        }

        public String getBMI() {
            double bmi = weightInKilogram / (heightInMeters * heightInMeters);
            if (bmi < 15) {
                return "Very severely underweight";
            } else if (bmi < 16) {
                return "Severely underweight";
            } else if (bmi < 18.5) {
                return "Underweight";
            } else if (bmi < 25) {
                return "Normal (healthy weight)";
            } else if (bmi < 30) {
                return "Overweight";
            } else if (bmi < 35) {
                return "Obese Class I (Moderately obese)";
            } else if (bmi < 40) {
                return "Obese Class II (Severely obese)";
            } else if (bmi < 45) {
                return "Obese Class III (Very severely obese)";
            } else if (bmi < 50) {
                return "Obese Class IV (Morbidly Obese)";
            } else if (bmi < 60) {
                return "Obese Class V (Super Obese)";
            }
            return "Obese Class VI (Hyper Obese)";
        }
    }
}