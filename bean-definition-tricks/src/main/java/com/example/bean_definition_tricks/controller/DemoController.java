package com.example.bean_definition_tricks.controller;

import com.example.bean_definition_tricks.service.BusinessService;
import com.example.bean_definition_tricks.service.TaskProcessor;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final BusinessService businessService;

    private final TaskProcessor taskProcessor;

    @Value("#{systemProperties['java.version']}")
    private String javaVersion;

    public DemoController(
            @Named("businessServiceOne") BusinessService businessService, TaskProcessor taskProcessor) {
        this.businessService = businessService;
        this.taskProcessor = taskProcessor;
    }

    @GetMapping("/hello")
    public String sayHello() {
        taskProcessor.process();
        taskProcessor.process();
        taskProcessor.process();
        return businessService.getGreeting();
    }


}