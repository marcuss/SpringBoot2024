package com.example.bean_definition_tricks.config;

import com.example.bean_definition_tricks.service.Environment;
import com.example.bean_definition_tricks.service.ExtraProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ExtraPropertiesConfig {

    @Bean
    @ConditionalOnProperty(name = "app.feature.show.info", havingValue = "true")
    public ExtraProperties extraProperties() {
        return new ExtraProperties();
    }


    /*
    ConditionalOnBean
    ConditionalOnCheckpointRestore
    ConditionalOnClass
    ConditionalOnCloudPlatform
    ConditionalOnExpression
    ConditionalOnJava
    ConditionalOnJndi
    ConditionalOnMissingBean
    ConditionalOnMissingClass
    ConditionalOnNotWarDeployment
    ConditionalOnNotWebApplication
    ConditionalOnProperty
    ConditionalOnResource
    ConditionalOnSingleCandidate
    ConditionalOnThreading
    ConditionalOnWarDeployment
    ConditionalOnWebApplication
    * */

    @Bean
    @Profile("prod")
    public Environment getEnvironmentProd() {
        return new Environment("prod");
    }

    @Bean
    @Profile("dev")
    public Environment getEnvironmentDev() {
        return new Environment("dev");
    }

    // Fallback when no profile is defined
    @Bean
    @Profile("!prod & !dev") // Matches when neither "prod" nor "dev" profiles are active
    public Environment getEnvironment() { //@Profile("") will always be created
        return new Environment("default");
    }
}
