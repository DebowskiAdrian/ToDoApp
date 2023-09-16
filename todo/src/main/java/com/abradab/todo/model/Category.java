package com.abradab.todo.model;

public enum Category {
    REPAIR("Repair"),
    INSPECTION("Inspection"),
    CREATION("Creation");

    String categoryName;

    Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
