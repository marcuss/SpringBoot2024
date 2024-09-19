package com.example.bean_definition_tricks.service;

import org.springframework.beans.factory.annotation.Value;

public class ExtraProperties {

    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{systemProperties['os.version']}")
    private String osVersion;

    public String getExtraProperties() {
        return "In " + osName + " " + osVersion;
    }
}
