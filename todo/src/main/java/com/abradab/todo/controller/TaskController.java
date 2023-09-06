package com.abradab.todo.controller;

import com.abradab.todo.model.Task;
import com.abradab.todo.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String index(){
        return "task/task";
    }

    @GetMapping("/task")
    public String getTask(Model model) {
        Task emptyTask = new Task();
        model.addAttribute("task", emptyTask);

        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "task/tasks";
    }
}
