package com.kodilla.hibernate.task.homework.repository;

import com.kodilla.hibernate.task.homework.TaskList;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface TaskListRepositor extends CrudRepository<TaskList, Integer> {
    List<TaskList> findByListName(String listName);
}
