package com.aivid.todo.model;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Task {

    private UUID uuid;
    private String taskName;
    private String taskDescription;
    private String category;
    private Priority priority;
    private LocalDateTime taskStartTime;
    private LocalDateTime taskEndTime;
    private LocalDateTime taskDueTime;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
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
        return Objects.equals(uuid, task.uuid) && Objects.equals(taskName, task.taskName) && Objects.equals(taskDescription, task.taskDescription) && Objects.equals(category, task.category) && Objects.equals(priority, task.priority) && Objects.equals(taskStartTime, task.taskStartTime) && Objects.equals(taskEndTime, task.taskEndTime) && Objects.equals(taskDueTime, task.taskDueTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, taskName, taskDescription, category, priority, taskStartTime, taskEndTime, taskDueTime);
    }
}
