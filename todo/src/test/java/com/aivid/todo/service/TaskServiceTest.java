package com.aivid.todo.service;

import com.aivid.todo.model.Category;
import com.aivid.todo.model.Priority;
import com.aivid.todo.model.Task;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TaskServiceTest {

    private final TaskService taskService = new TaskService();

    private final LocalDate dateToday = LocalDate.now();
    private final LocalDate dateTomorrow = LocalDate.now().plusDays(1);
    private final LocalDate datePlusTen = LocalDate.now().plusDays(10);
    private final LocalDate dateNextMonth = LocalDate.now().plusDays(31);

    private final Task taskDueTomorrow = new Task(UUID.randomUUID(),"Test task Tomorrow", "Test task due tomorrow", Category.HOME, Priority.URGENT, dateToday,dateTomorrow);
    private final Task taskDueTenDays = new Task(UUID.randomUUID(),"Test task ten", "Test task due within ten days", Category.WORK, Priority.HIGH, dateToday,datePlusTen);
    private final Task taskDueMonth = new Task(UUID.randomUUID(),"Test task month", "Test task due within month", Category.HOBBY, Priority.LOW, dateToday,dateNextMonth);

    @Test
    @DisplayName("Test which verify if task is added.")
    void addTask() {
        // Given
        taskService.addTask(taskDueTomorrow);
        // When
        Task retrieveTasks = taskService.getTaskById(taskDueTomorrow.getId());
        // Then
        assertNotNull(retrieveTasks);
        assertEquals(taskDueTomorrow, retrieveTasks);

    }

    @Test
    @DisplayName("Test which verify if list of tasks are return.")
    void getAllTasks() {
        // Given
        taskService.addTask(taskDueTomorrow);
        taskService.addTask(taskDueTenDays);
        taskService.addTask(taskDueMonth);

        List<Task> testListOfTasks = List.of(taskDueTomorrow,taskDueTenDays,taskDueMonth);

        // When
        List<Task> retrieveAllTasks = taskService.getAllTasks();

        // Then
        assertNotNull(retrieveAllTasks);
        assertEquals(testListOfTasks,retrieveAllTasks);

    }

    @Test
    @DisplayName("Test which verify if task is return after providing id.")
    void getTaskById() {
        // Given
        taskService.addTask(taskDueMonth);

        // When
        Task retrieveTaskById = taskService.getTaskById(taskDueMonth.getId());

        // Then
        assertNotNull(retrieveTaskById);
        assertEquals(taskDueMonth, retrieveTaskById);

    }
}