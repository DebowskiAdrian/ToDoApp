package com.aivid.todo.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String taskName;
    private String taskDescription;
    private Category category;
    private Priority priority;
    private LocalDateTime taskStartTime;
    private LocalDateTime taskEndTime;
    private LocalDateTime taskDueTime;

    public Task() {

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

    public LocalDateTime getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(LocalDateTime taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    public LocalDateTime getTaskEndTime() {
        return taskEndTime;
    }

    public void setTaskEndTime(LocalDateTime taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    public LocalDateTime getTaskDueTime() {
        return taskDueTime;
    }

    public void setTaskDueTime(LocalDateTime taskDueTime) {
        this.taskDueTime = taskDueTime;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(taskName, task.taskName) && Objects.equals(taskDescription, task.taskDescription) && Objects.equals(category, task.category) && Objects.equals(priority, task.priority) && Objects.equals(taskStartTime, task.taskStartTime) && Objects.equals(taskEndTime, task.taskEndTime) && Objects.equals(taskDueTime, task.taskDueTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taskName, taskDescription, category, priority, taskStartTime, taskEndTime, taskDueTime);
    }
}
