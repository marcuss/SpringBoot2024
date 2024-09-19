package com.example.bean_definition_tricks.service;

public class Environment {

    private final String name;


    public Environment(String name) {
        this.name = name;
    }

    public String getEnvironment() {
        return name;
    }
}
