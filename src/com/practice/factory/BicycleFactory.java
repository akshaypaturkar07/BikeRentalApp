package com.practice.factory;

import com.practice.AtlasBicycle;
import com.practice.Bicycle;
import com.practice.HeroBicycle;
import com.practice.exception.UnsupportedClassException;

public class BicycleFactory {
    public Bicycle getBicycle(String type) {
        if (type == null) {
            return null;
        } else if (type.equals("Atlas")) {
            return new AtlasBicycle("Atlas");
        } else if (type.equals("Hero")) {
            return new HeroBicycle("Hero");
        } else {
            throw new UnsupportedClassException("Class of type is not available for factory to generate", new RuntimeException());
        }
    }
}
