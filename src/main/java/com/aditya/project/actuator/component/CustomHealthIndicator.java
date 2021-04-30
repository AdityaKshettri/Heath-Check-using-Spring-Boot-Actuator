package com.aditya.project.actuator.component;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Slf4j
@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Autowired
    private DataSource dataSource;

    @SneakyThrows
    @Override
    public Health health() {
        if (dataSource.getConnection().getSchema() == null) {
            return Health.down().build();
        }
        return Health.up().build();
    }
}
