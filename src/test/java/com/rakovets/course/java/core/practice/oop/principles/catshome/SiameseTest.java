package com.rakovets.course.java.core.practice.oop.principles.catshome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SiameseTest {

    @Test
    @DisplayName(value = "Method \"mew\" for Siamese")
    void mew() {
        String expected = "mew-siamese";

        String actual = new Siamese("Tom").mew();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName(value = "Method \"purr\" for Siamese")
    void purr() {
        String expected = "purr-siamese";

        String actual = new Siamese("Tom").purr();

        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> mewWithSiameseProviderArguments() {
        return Stream.of(
                Arguments.of(20.0, new Person(40.0)),
                Arguments.of(0.0, new Person(20.0)),
                Arguments.of(-40.0, new Person(-20.0))
        );
    }

    @ParameterizedTest(name = "Method \"mew\" for Siamese with Person")
    @MethodSource("mewWithSiameseProviderArguments")
    void mewWithSiamese(double expected, Person user) {
        Siamese cat = new Siamese("Tom");
        cat.mew(user);
        double actual = user.getHappiness();
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> purrWithSiameseProviderArguments() {
        return Stream.of(
                Arguments.of(40.0, new Person(20.0)),
                Arguments.of(0.0, new Person(-20.0))
        );
    }

    @ParameterizedTest(name = "Method \"purr\" for Siamese with Person")
    @MethodSource("purrWithSiameseProviderArguments")
    void purrWithSiamese(double expected, Person user) {
        Siamese cat = new Siamese("Tom");
        cat.purr(user);
        double actual = user.getHappiness();
        Assertions.assertEquals(expected, actual);
    }
}
