package com.kodilla.spring.basic.spring_dependency_injection.homeworkcalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homeworkcalculator");

        Calculator calculator = context.getBean(Calculator.class);

        calculator.add(10, 5);
        calculator.subtract(10, 5);
        calculator.multiply(10, 5);
        calculator.divide(10, 5);
    }
}