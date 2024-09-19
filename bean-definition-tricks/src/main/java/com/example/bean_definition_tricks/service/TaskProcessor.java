package com.example.bean_definition_tricks.service;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class TaskProcessor {

    public void process() {
        // Get a new instance of Task each time process is called
        Task task = createTask();
        task.performTask();
    }

    @Lookup
    protected Task createTask() {
        // Spring will override this method to return a prototype-scoped Task
        return null;
    }
}