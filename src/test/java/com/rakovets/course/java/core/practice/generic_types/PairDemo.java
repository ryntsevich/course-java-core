package com.rakovets.course.java.core.practice.generic_types;

public class PairDemo {
    public static void main(String[] args) {
        Pair<String, Integer> obj = new Pair<>("string", 29);
        System.out.println(obj.getValue1() + ", " + obj.getValue2());
        obj.setValue1("hello");
        obj.setValue2(33);
        System.out.println(obj.getValue1() + ", " + obj.getValue2());
        System.out.println(obj.getSwapped());
        System.out.println(Pair.swap(new Pair<>(true, 66)));
    }
}
