package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;
import java.util.Comparator;

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

    @SafeVarargs
    public static <T extends Number> T getMin(T... values) {
        Arrays.sort(values, new Comparator<T>() {
            @Override
            public int compare(T t, T t1) {
                return Double.compare(t.doubleValue(), t1.doubleValue());
            }
        });
        return values[0];
    }

    public static <T extends Number> double getArithmeticMean(T[] array) {
        double sum = 0;
        for (T t : array) {
            sum += t.doubleValue();
        }
        return sum / array.length;
    }

    public static <T extends Number> T getMaxArray(T[] array) {
        Arrays.sort(array, new Comparator<T>() {
            @Override
            public int compare(T t, T t1) {
                return Double.compare(t1.doubleValue(), t.doubleValue());
            }
        });
        return array[0];
    }

    public static <T extends Number> T getMinArray(T[] array) {
        Arrays.sort(array, new Comparator<T>() {
            @Override
            public int compare(T t, T t1) {
                return Double.compare(t.doubleValue(), t1.doubleValue());
            }
        });
        return array[0];
    }

    public static <T extends Number> T[] sortArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].doubleValue() < array[j].doubleValue()) {
                    T value = array[i];
                    array[i] = array[j];
                    array[j] = value;
                }
            }
        }
        return array;
    }
}
