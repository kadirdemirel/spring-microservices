package com.in28minutes.microservices.limitsservices.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("limits-services")
@Component
public class Configuration {
    private int minumum;
    private int maxiumum;

    public int getMinumum() {
        return minumum;
    }

    public void setMinumum(int minumum) {
        this.minumum = minumum;
    }

    public int getMaxiumum() {
        return maxiumum;
    }

    public void setMaxiumum(int maxiumum) {
        this.maxiumum = maxiumum;
    }
}
