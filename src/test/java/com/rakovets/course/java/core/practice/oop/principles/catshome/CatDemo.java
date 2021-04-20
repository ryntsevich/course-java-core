package com.rakovets.course.java.core.practice.oop.principles.catshome;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom");
        System.out.println(cat1.getName());
        System.out.printf("%s: \"%s\" and \"%s\"", cat1.getName(), cat1.mew(), cat1.purr());
        cat1.setName("Alex");
        System.out.printf("\n%s: \"%s\" and \"%s\"", cat1.getName(), cat1.mew(), cat1.purr());
    }
}
