package com.kodilla.hibernate.manytomany;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeCompanyTest {

    @Test
    void testEmployeeCompanyRelation() {
        Employee john = new Employee("John", "Doe");
        Employee jane = new Employee("Jane", "Smith");

        Company kodilla = new Company("Kodilla");
        Company google = new Company("Google");

        john.getCompanies().add(kodilla);
        john.getCompanies().add(google);
        jane.getCompanies().add(kodilla);

        kodilla.getEmployees().add(john);
        kodilla.getEmployees().add(jane);
        google.getEmployees().add(john);

        assertEquals("John", john.getFirstname());
        assertEquals("Doe", john.getLastname());
        assertEquals(2, john.getCompanies().size());

        assertEquals("Jane", jane.getFirstname());
        assertEquals("Smith", jane.getLastname());
        assertEquals(1, jane.getCompanies().size());

        assertEquals("Kodilla", kodilla.getName());
        assertEquals(2, kodilla.getEmployees().size());

        assertEquals("Google", google.getName());
        assertEquals(1, google.getEmployees().size());

        Employee mark = new Employee();
        mark.setFirstname("Mark");
        mark.setLastname("Taylor");
        mark.setCompanies(new ArrayList<>());

        assertEquals("Mark", mark.getFirstname());
        assertEquals("Taylor", mark.getLastname());
        assertTrue(mark.getCompanies().isEmpty());

        Company amazon = new Company();
        amazon.setName("Amazon");
        amazon.setEmployees(new ArrayList<>());

        assertEquals("Amazon", amazon.getName());
        assertTrue(amazon.getEmployees().isEmpty());
    }
}
