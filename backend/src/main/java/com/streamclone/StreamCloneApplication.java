package com.streamclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Voice: Mark the Spring Boot application entry point.
// Reasoning: Enable auto-configuration and package scanning.
@SpringBootApplication
public class StreamCloneApplication {
    public static void main(String[] args) {
        // Voice: Start the Netflix Clone backend.
        // Reasoning: Initialize Spring and its embedded web server.
        SpringApplication.run(StreamCloneApplication.class, args);
    }
}
