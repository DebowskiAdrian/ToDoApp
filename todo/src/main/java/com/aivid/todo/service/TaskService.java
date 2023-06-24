package com.aivid.todo.service;

import com.aivid.todo.exception.TaskNotFoundException;
import com.aivid.todo.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TaskService {

    private List<Task> taskList = new ArrayList<Task>();

    public void addTask(Task task){

    }

    public List<Task> getAllTasks(){
        return taskList;
    }

    public Task getTaskById(UUID uuid){
        return taskList.stream()
                .filter(task -> task.getId() == uuid)
                .findFirst()
                .orElseThrow(() -> new TaskNotFoundException("Not found task with ID: %s".formatted(uuid)));
    }


}
