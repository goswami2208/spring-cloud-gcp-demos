package com.example.secretmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SecretConfiguration.class)
public class SecretManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecretManagerApplication.class, args);
    }
}
