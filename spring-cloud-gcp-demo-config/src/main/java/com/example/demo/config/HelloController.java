package com.example.demo.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final MyAppProperties sampleConfig;

    public HelloController(MyAppProperties sampleConfig) {
        this.sampleConfig = sampleConfig;
    }

    @GetMapping("/")
    public MyAppProperties json() {
        return this.sampleConfig;
    }
}
