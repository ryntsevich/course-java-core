package com.rakovets.course.java.core.practice.oop.principles.catshome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersianTest {

    @Test
    @DisplayName(value = "Method \"mew\" for Persian")
    void mew() {
        String expected = "mew-persian";

        String actual = new Persian("Tom").mew();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName(value = "Method \"purr\" for Persian")
    void purr() {
        String expected = "purr-persian";

        String actual = new Persian("Tom").purr();

        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> mewWithPersianProviderArguments() {
        return Stream.of(
                Arguments.of(5.0, new Person(20.0)),
                Arguments.of(0.0, new Person(15.0)),
                Arguments.of(-35.0, new Person(-20.0))
        );
    }

    @ParameterizedTest(name = "Method \"mew\" for Persian with Person")
    @MethodSource("mewWithPersianProviderArguments")
    void mewWithPersian(double expected, Person user) {
        Persian cat = new Persian("Tom");
        cat.mew(user);
        double actual = user.getHappiness();
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> purrWithPersianProviderArguments() {
        return Stream.of(
                Arguments.of(35.0, new Person(20.0)),
                Arguments.of(-5.0, new Person(-20.0))
        );
    }

    @ParameterizedTest(name = "Method \"purr\" for Persian with Person")
    @MethodSource("purrWithPersianProviderArguments")
    void purrWithPersian(double expected, Person user) {
        Persian cat = new Persian("Tom");
        cat.purr(user);
        double actual = user.getHappiness();
        Assertions.assertEquals(expected, actual);
    }
}
