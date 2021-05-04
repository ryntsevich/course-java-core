package com.rakovets.course.java.core.practice.generic_types;

public abstract class Math {
    public static <T extends Number> T getMax(T value1, T value2, T value3) {
        double value1InDouble = value1.doubleValue();
        double value2InDouble = value2.doubleValue();
        double value3InDouble = value3.doubleValue();
        T result;

        if (value1InDouble > value2InDouble && value1InDouble > value3InDouble) {
            result = value1;
        } else if (value2InDouble > value1InDouble && value2InDouble > value3InDouble) {
            result = value2;
        } else {
            result = value3;
        }

        return result;
    }
}
