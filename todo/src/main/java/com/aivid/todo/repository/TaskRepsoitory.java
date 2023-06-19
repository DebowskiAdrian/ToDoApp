package com.aivid.todo.repository;

import com.aivid.todo.model.Task;

import java.util.List;
import java.util.UUID;

public interface TaskRepsoitory {

    List<Task> getAllTasks();
    void save(Task task);
    Task findTaskByUUID(UUID uuid);
    void update (Task task);
    void delete (Task task);
}
