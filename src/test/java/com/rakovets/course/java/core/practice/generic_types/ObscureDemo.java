package com.rakovets.course.java.core.practice.generic_types;

public class ObscureDemo {
    public static void main(String[] args) {
        Obscure<Integer> obj = new Obscure<Integer>(78);
        System.out.println(obj.get());
        System.out.println(obj.isPresent());
        System.out.println(obj.isEmpty());
        System.out.println(obj.orElse(23));
        try {
            System.out.println(obj.orElseThrow(new NullPointerException("obj is null")));
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
        System.out.println(Obscure.<Integer>of(9));
        System.out.println(Obscure.<String>empty());
    }
}
