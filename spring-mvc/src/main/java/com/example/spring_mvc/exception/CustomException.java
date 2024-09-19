package com.example.spring_mvc.exception;

public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}