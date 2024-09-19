package com.example.bean_definition_tricks.service;

import org.springframework.beans.factory.annotation.Value;

public class BusinessService {

    private final String greeting;

    public BusinessService(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting + " World!";
    }
}
