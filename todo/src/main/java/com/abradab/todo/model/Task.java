package com.abradab.todo.model;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Task {

    private int id;
    private String taskName;
    private String taskDescription;
    private LocalDate taskStart;
    private LocalDate taskEnd;
}
