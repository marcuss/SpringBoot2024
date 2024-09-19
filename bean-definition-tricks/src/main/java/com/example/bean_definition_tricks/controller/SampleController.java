package com.example.bean_definition_tricks.controller;


import com.example.bean_definition_tricks.service.ExtraProperties;
import jakarta.annotation.Nullable;
import jakarta.inject.Inject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Value("#{systemProperties['java.version']}")
    private String javaVersion;

    @Inject
    @Nullable
    private ExtraProperties extraProperties;

    @Value("#{T(java.lang.Math).random() * 100}")
    private String randomValue;

    @GetMapping("/java-version")
    public String getJavaVersion() {
        if (extraProperties != null) {
            return randomValue + ":\nThe current java version is: " + javaVersion + extraProperties.getExtraProperties();
        } else {
            return randomValue + ":\nTThe current java version is: " + javaVersion;
        }
    }

}
