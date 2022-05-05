package com.jakobniinja.limitsservice.controller;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Data
@NoArgsConstructor
@ComponentScan
@Configuration
@ConfigurationProperties("limits-service")
public class LimitsConfiguration {
    private int max;
    private int min;

    public LimitsConfiguration(int max, int min) {
        this.max = max;
        this.min = min;
    }
}
