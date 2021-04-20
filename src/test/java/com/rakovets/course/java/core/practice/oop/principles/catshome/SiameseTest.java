package com.rakovets.course.java.core.practice.oop.principles.catshome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
