package com.rakovets.course.java.core.practice.oop.principles.catshome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SphynxTest {

    @Test
    @DisplayName(value = "Method \"mew\" for Sphynx")
    void mew() {
        String expected = "mew-sphynx";

        String actual = new Sphynx("Tom").mew();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName(value = "Method \"purr\" for Sphynx")
    void purr() {
        String expected = "purr-sphynx";

        String actual = new Sphynx("Tom").purr();

        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> mewWithSphynxProviderArguments() {
        return Stream.of(
                Arguments.of(10.0, new Person(40.0)),
                Arguments.of(0.0, new Person(30.0)),
                Arguments.of(-50.0, new Person(-20.0))
        );
    }

    @ParameterizedTest(name = "Method \"mew\" for Sphynx with Person")
    @MethodSource("mewWithSphynxProviderArguments")
    void mewWithSphynx(double expected, Person user) {
        Sphynx cat = new Sphynx("Tom");
        cat.mew(user);
        double actual = user.getHappiness();
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> purrWithSphynxProviderArguments() {
        return Stream.of(
                Arguments.of(50.0, new Person(20.0)),
                Arguments.of(0.0, new Person(-30.0))
        );
    }

    @ParameterizedTest(name = "Method \"purr\" for Sphynx with Person")
    @MethodSource("purrWithSphynxProviderArguments")
    void purrWithSphynx(double expected, Person user) {
        Sphynx cat = new Sphynx("Tom");
        cat.purr(user);
        double actual = user.getHappiness();
        Assertions.assertEquals(expected, actual);
    }
}
