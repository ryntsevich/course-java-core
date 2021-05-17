package com.rakovets.course.java.core.practice.jcf.list.studio;

public class Actor {
    private final String firstName;
    private final String lastName;
    private final int fee;
    private final int age;

    public Actor(String firstName, String lastName, int fee, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", fee: " + fee + ", age: " + age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getFee() {
        return fee;
    }

    public int getAge() {
        return age;
    }
}
