package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.homework.TaskFinancialDetails;
import com.kodilla.hibernate.task.homework.TaskList;
import com.kodilla.hibernate.task.homework.repository.TaskListRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskTest {

    @Autowired
    private TaskListRepository taskListRepository;

    @Test
    void testTaskGettersAndSetters() {
        Task task = new Task("Test Task", 7);
        TaskFinancialDetails financialDetails = new TaskFinancialDetails(new BigDecimal("100"), false);
        TaskList taskList = new TaskList("Test List", "List description");

        task.setTaskFinancialDetails(financialDetails);
        task.setTaskList(taskList);

        assertEquals("Test Task", task.getDescription());
        assertEquals(7, task.getDuration());
        assertEquals(LocalDate.now(), task.getCreated());
        assertEquals(financialDetails, task.getTaskFinancialDetails());
        assertEquals(taskList, task.getTaskList());

        assertEquals(new BigDecimal("100"), financialDetails.getPrice());
        assertFalse(financialDetails.isPaid());
    }

    @Test
    void testTaskPersistence() {
        Task task = new Task("Persisted Task", 10);
        TaskFinancialDetails financialDetails = new TaskFinancialDetails(new BigDecimal("500"), true);
        TaskList taskList = new TaskList("Persistence List", "Persist desc");

        task.setTaskFinancialDetails(financialDetails);
        task.setTaskList(taskList);

        taskListRepository.save(taskList);
        Integer taskListId = taskList.getId();

        assertNotNull(taskListId);

        taskListRepository.deleteById(taskListId);
    }
}
