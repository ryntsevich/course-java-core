package com.rakovets.course.java.core.practice.oop.principles.catshome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    @Test()
    @DisplayName(value = "Method \"mew\" for Cat")
    void mew() {
        String expected = "mew";

        String actual = new Cat("Tom").mew();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName(value = "Method \"purr\" for Cat")
    void purr() {
        String expected = "purr";

        String actual = new Cat("Tom").purr();

        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> mewWithPersonProviderArguments() {
        return Stream.of(
                Arguments.of(10.0, new Person(20.0)),
                Arguments.of(0.0, new Person(10.0)),
                Arguments.of(-30.0, new Person(-20.0))
        );
    }

    @ParameterizedTest(name = "Method \"mew\" for Person")
    @MethodSource("mewWithPersonProviderArguments")
    void mewWithPerson(double expected, Person user) {
        Cat cat = new Cat("Tom");
        cat.mew(user);
        double actual = user.getHappiness();
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> purrWithPersonProviderArguments() {
        return Stream.of(
                Arguments.of(30.0, new Person(20.0)),
                Arguments.of(-10.0, new Person(-20.0))
        );
    }

    @ParameterizedTest(name = "Method \"purr\" for Person")
    @MethodSource("purrWithPersonProviderArguments")
    void purrWithPerson(double expected, Person user) {
        Cat cat = new Cat("Tom");
        cat.purr(user);
        double actual = user.getHappiness();
        Assertions.assertEquals(expected, actual);
    }
}
