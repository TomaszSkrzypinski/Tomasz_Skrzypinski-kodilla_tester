package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.repository.TaskRepository;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String LISTNAME = "Test: listname";
    private static final String DESCRIPTION = "Test: description";

    @Test
    public void testTaskListRepositorySave() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //When
        taskListRepository.save(taskList);

        //Then
        int id = taskList.getId();
        Optional <TaskList> readTask = taskListRepository.findById(id);
        Assert.assertTrue(readTask.isPresent());

        //CleanUp
        taskListRepository.deleteById(id);
    }

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //When
        List <TaskList> readTasks = taskListRepository.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTasks.size());

        //CleanUp
        int id = readTasks.get(0).getId();
        taskListRepository.deleteById(id);
    }
}