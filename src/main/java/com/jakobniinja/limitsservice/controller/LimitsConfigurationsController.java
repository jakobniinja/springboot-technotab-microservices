package com.jakobniinja.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationsController {

    @Autowired
    private LimitsConfiguration limts;

    @GetMapping("/limits")
    public LimitsConfiguration returnLimits() {
        return new LimitsConfiguration(limts.getMin(), limts.getMax());
    }
}
