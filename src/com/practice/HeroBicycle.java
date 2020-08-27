package com.practice;

public class HeroBicycle extends Bicycle {
    final static double cost = 10.0;
    private String type;

    public HeroBicycle(String type) {
        super(type);
        this.type = type;
    }

    @Override
    public double calculateRental(long duration) {
        return duration * cost;
    }

    @Override
    public double price() {
        return cost;
    }


}
