package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {

    @Test
    public void shouldReturnTeacherNameIfPresent() {

        Teacher teacher = new Teacher("Eliza Dubiel");
        Student student = new Student("Kuba Wojciechowski", teacher);

        String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse("<undefined>");

        assertEquals("Eliza Dubiel", teacherName);
    }

    @Test
    public void shouldReturnUndefinedIfTeacherIsNull() {
        Student student = new Student("Karolina Jasińska", null);

        String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse("<undefined>");

        assertEquals("<undefined>", teacherName);
    }

    @Test
    public void shouldReturnStudentNameCorrectly() {
        Student student = new Student("Klaudia Kulasza", null);

        String name = student.getName();

        assertEquals("Klaudia Kulasza", name);
    }
}
