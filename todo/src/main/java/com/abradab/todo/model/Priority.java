package com.abradab.todo.model;

public enum Priority {
    URGENT(1),
    HIGH(2),
    MEDIUM(3),
    LOW(4);

    int priorityNumber;

    Priority(int priorityNumber) {
        this.priorityNumber = priorityNumber;
    }

    public int getPriorityNumber() {
        return priorityNumber;
    }
}
