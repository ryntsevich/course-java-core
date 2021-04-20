package com.rakovets.course.java.core.practice.oop.principles.catshome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
