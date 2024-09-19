package com.example.demo.service;

import com.example.demo.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LegacySpringService extends VintageBaseService implements CommandLineRunner {


    @Override
    public void run(String... args) {
        System.out.println(greetingsService.greet());
    }
}
