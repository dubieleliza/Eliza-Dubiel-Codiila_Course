package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.*;

public class ClockTest {

    @Test
    public void shouldReturnDifferentTimesForDifferentBeans() throws InterruptedException {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes.homework");

        Clock firstClock = context.getBean(Clock.class);
        Thread.sleep(1000);
        Clock secondClock = context.getBean(Clock.class);

        System.out.println("First clock time:  " + firstClock.getTime());
        System.out.println("Second clock time: " + secondClock.getTime());

        assertNotEquals(firstClock.getTime(), secondClock.getTime());
    }
}
