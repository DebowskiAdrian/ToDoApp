package com.aivid.todo.service;

import com.aivid.todo.model.Category;
import com.aivid.todo.model.Priority;
import com.aivid.todo.model.Task;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TaskServiceTest {

    private final LocalDate dateToday = LocalDate.now();
    private final LocalDate dateTomorrow = LocalDate.now().plusDays(1);
    private final LocalDate dateNextMonth = LocalDate.now().plusDays(31);

    private final Task taskDueTomorrow = new Task(UUID.randomUUID(),"Test task Tomorrow", "Test task due tomorrow", Category.HOME, Priority.URGENT, dateToday,dateTomorrow);

    @Test
    @DisplayName("Test which verify if task is added.")
    void addTask() {
        // Given
        TaskService taskService = new TaskService();
        // When
        taskService.addTask(taskDueTomorrow);
        Task retrieveTasks = taskService.getTaskById(taskDueTomorrow.getId());
        // Then
        assertNotNull(retrieveTasks);
        assertEquals(taskDueTomorrow, retrieveTasks);

    }
}