package com.rakovets.course.java.core.practice.oop.principles.catshome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

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
}
