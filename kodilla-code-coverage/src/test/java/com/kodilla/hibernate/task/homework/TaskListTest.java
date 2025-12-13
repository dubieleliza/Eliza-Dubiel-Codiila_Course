package com.kodilla.hibernate.task.homework;

import com.kodilla.hibernate.task.homework.repository.TaskListRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListTest {

    @Autowired
    private TaskListRepository taskListRepository;

    @Test
    void testFindByListName() {
        // given
        TaskList taskList = new TaskList("Test List", "This is a test list");
        taskListRepository.save(taskList);
        Integer id = taskList.getId();

        // when
        List<TaskList> foundLists = taskListRepository.findByListName("Test List");

        // then
        assertEquals(1, foundLists.size());
        assertEquals("Test List", foundLists.get(0).getListName());

        // clean up (idempotent)
        taskListRepository.deleteById(id);
    }
}
//b
