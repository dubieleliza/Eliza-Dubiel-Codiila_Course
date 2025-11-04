package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class CarConfiguration {

    @Bean
    public Car car() {
        Month currentMonth = LocalDate.now().getMonth();

        if (currentMonth == Month.DECEMBER ||
                currentMonth == Month.JANUARY ||
                currentMonth == Month.FEBRUARY) {
            return new SUV();
        }

        if (currentMonth == Month.JUNE ||
                currentMonth == Month.JULY ||
                currentMonth == Month.AUGUST) {
            return new Cabrio();
        }

        return new Sedan();
    }
}
