package com.example.spring_mvc.model;

public class MyCustomObject {
    private String content;

    public MyCustomObject(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}