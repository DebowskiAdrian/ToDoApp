package com.aivid.todo.model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Task {
    private UUID id;
    private String taskName;
    private String taskDescription;
    private Category category;
    private Priority priority;
    private LocalDate taskStartTime;
    private LocalDate taskEndTime;

    public Task(UUID id, String taskName, String taskDescription, Category category, Priority priority, LocalDate taskStartTime, LocalDate taskEndTime) {
        this.id = id;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.category = category;
        this.priority = priority;
        this.taskStartTime = taskStartTime;
        this.taskEndTime = taskEndTime;
    }

    public UUID getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDate getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(LocalDate taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    public LocalDate getTaskEndTime() {
        return taskEndTime;
    }

    public void setTaskEndTime(LocalDate taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(taskName, task.taskName) && Objects.equals(taskDescription, task.taskDescription) && Objects.equals(category, task.category) && Objects.equals(priority, task.priority) && Objects.equals(taskStartTime, task.taskStartTime) && Objects.equals(taskEndTime, task.taskEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taskName, taskDescription, category, priority, taskStartTime, taskEndTime);
    }
}
