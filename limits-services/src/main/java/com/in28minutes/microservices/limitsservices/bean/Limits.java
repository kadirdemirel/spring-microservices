package com.in28minutes.microservices.limitsservices.bean;

public class Limits {
    private int minumum;
    private int maxiumum;

    public Limits() {
    }

    public Limits(int minumum, int maxiumum) {
        this.minumum = minumum;
        this.maxiumum = maxiumum;
    }

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
