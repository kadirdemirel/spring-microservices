package com.in28minutes.microservices.limitsservices.controller;

import com.in28minutes.microservices.limitsservices.bean.Limits;
import com.in28minutes.microservices.limitsservices.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinumum(),configuration.getMaxiumum());
        //return new Limits(1,100);
    }
}
