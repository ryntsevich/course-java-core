package com.rakovets.course.java.core.practice.oop.principles.catshome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}
