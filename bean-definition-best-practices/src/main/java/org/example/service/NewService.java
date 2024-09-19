package org.example.service;

import jakarta.annotation.Resource;
import org.example.repository.GreetingsService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class NewService implements CommandLineRunner {

    private GreetingsService greetingsService;

    @Resource(name = "defaultGreeter")
    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String greet() {
        return greetingsService.greet() + " from NewService!";
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(greet());
    }
}
