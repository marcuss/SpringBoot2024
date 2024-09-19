package com.example.spring_mvc.controller;

import com.example.spring_mvc.exception.CustomException;
import com.example.spring_mvc.model.User;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public ResponseEntity<Map<String, String>> createUser(@Valid @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new IllegalArgumentException("Invalid user");
        }
        // If validation passes, this code will execute
        Map<String, String> successMessage = new HashMap<>();
        successMessage.put("message", "User is valid");
        return new ResponseEntity<>(successMessage, HttpStatus.OK);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/invalid")
    public ResponseEntity<Map<String, String>> createInvalidUser(@RequestBody User user, BindingResult bindingResult)
            throws MethodArgumentNotValidException {
        throw new MethodArgumentNotValidException(null, bindingResult);
    }


    @PostMapping("/custom-error")
    public ResponseEntity<Void> createUserWithCustomError() {
        throw new CustomException("This is a custom exception message.");
    }
}

