package com.aivid.todo.model;

public enum Category {

    HOME("Home"),
    WORK("Work"),
    GROCERIES("Groceries"),
    HOBBY("Hobby");

    private String categoryName;

    Category(String categoryName) {
        this.categoryName = categoryName;
    }
}
