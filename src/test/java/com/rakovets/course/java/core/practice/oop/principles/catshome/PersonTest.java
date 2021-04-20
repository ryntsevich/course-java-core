package com.rakovets.course.java.core.practice.oop.principles.catshome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    public static Stream<Arguments> changeHappinessProviderArguments() {
        return Stream.of(
                Arguments.of(20.0, 10.0, 10.0),
                Arguments.of(0.0, 10.0, -10.0),
                Arguments.of(-10.0, 10.0, -20.0),
                Arguments.of(-22.04, 34.89, -56.93)
        );
    }

    @ParameterizedTest(name = "Method changeHappiness: ''{1}'', ''{2}''")
    @MethodSource("changeHappinessProviderArguments")
    void changeHappiness(double expected, double happiness, double percentHappiness) {
        Person man = new Person(happiness);
        man.changeHappiness(percentHappiness);
        double actual = man.getHappiness();
        Assertions.assertEquals(expected, actual);
    }
}
