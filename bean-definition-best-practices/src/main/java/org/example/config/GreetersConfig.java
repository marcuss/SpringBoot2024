package org.example.config;

import org.example.repository.GreetingsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetersConfig {
    @Bean("defaultGreeter")
    public GreetingsService greetingsService() {
        return new GreetingsService("default");
    }

    @Bean("specialGreeter")
    public GreetingsService specialGreetingsService() {
        return new GreetingsService("special");
    }

}
