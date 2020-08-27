package com.practice;

public abstract class Bicycle implements IBicycle {
    public Bicycle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    public abstract double calculateRental(long duration);

    public abstract double price();

}
