package com.aivid.todo.model;

public enum Priority {
    LOW("Low",4),
    MEDIUM("Medium", 3),
    High("High",2),
    HIGH("Urgent",1);

    private String textPriorityValue;
    private int numericPriorityValue;

    Priority(String textPriorityValue, int numericPriorityValue) {
        this.textPriorityValue = textPriorityValue;
        this.numericPriorityValue = numericPriorityValue;
    }
}
