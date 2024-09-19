package com.example.bean_definition_tricks.service;

public class Task {

    private static int counter = 0;
    private int taskId;

    public Task() {
        this.taskId = ++counter;
    }

    public void performTask() {
        System.out.println("Performing task with ID: " + taskId);
    }
}