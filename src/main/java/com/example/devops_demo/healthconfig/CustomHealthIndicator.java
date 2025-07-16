package com.example.devops_demo.healthconfig;


import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        // Custom logic to check if service is healthy
        return Health.up().withDetail("customService", "Available").build();
    }
}