package com.abradab.todo.service;

import com.abradab.todo.exception.TaskNotFoundException;
import com.abradab.todo.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public void createTask(Task task){
        tasks.add(task);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public  Task findById(Long id) {
        return tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElseThrow(() -> new TaskNotFoundException("Not found task with id: %s".formatted(id)));
    }

    public void removeTaskById(Long id) {
        Task foundTask = findById(id);
        tasks.remove(foundTask);
    }
    public void editTaskById(Long id, Task task) {
        Task taskToEdit = findById(id);

        taskToEdit.setTaskName(task.getTaskName());
        taskToEdit.setTaskDescription(task.getTaskDescription());
        taskToEdit.setTaskStart(task.getTaskStart());
        taskToEdit.setTaskEnd(task.getTaskEnd());
        taskToEdit.setTaskRealStart(task.getTaskRealStart());
        taskToEdit.setTaskRealEnd(task.getTaskRealEnd());
        taskToEdit.setTaskOwner(task.getTaskOwner());
        taskToEdit.setPriority(task.getPriority());
        taskToEdit.setCategory(task.getCategory());
    }
}
