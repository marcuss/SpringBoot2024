package com.example.demo.repository;

import org.springframework.stereotype.Component;

@Component
public class GreetingsService {

    public String greet() {
        return "Hello from GreetingService!";
    }
}
