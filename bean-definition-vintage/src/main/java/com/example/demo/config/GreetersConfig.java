package com.example.demo.config;

import com.example.demo.repository.GreetingsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GreetersConfig {
    @Bean
    public GreetingsService greetingsService() {
        return new GreetingsService();
    }

    @Bean
    @Primary
    public GreetingsService specialGreetingsService() {
        return new GreetingsService();
    }
}
