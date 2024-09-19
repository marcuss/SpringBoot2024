package org.example.repository;

import org.springframework.beans.factory.annotation.Value;

public class GreetingsService {

    @Value("${greeting.text}")
    private String greetingText;

    private final String name;

    public GreetingsService(String name) {
        this.name = name;
    }

    public String greet() {
        return greetingText;
    }
}
