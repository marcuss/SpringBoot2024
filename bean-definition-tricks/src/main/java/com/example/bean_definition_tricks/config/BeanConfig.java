package com.example.bean_definition_tricks.config;

import com.example.bean_definition_tricks.service.BusinessService;
import com.example.bean_definition_tricks.service.Task;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean
    @Scope("prototype")
    public Task task() {
        return new Task();
    }

    @Bean
    @Primary
    public BusinessService businessServiceOne() {
        return new BusinessService("Howdy");
    }

    @Bean
    public BusinessService businessServiceTwo() {
        return new BusinessService("Hello");
    }


}