package com.practice;

public class AtlasBicycle extends Bicycle {
    final double cost = 5.0;
    String name;

    public AtlasBicycle(String name) {
        super(name);
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public double calculateRental(long duration) {
        return cost * duration;
    }

    @Override
    public double price() {
        return cost;
    }
}
