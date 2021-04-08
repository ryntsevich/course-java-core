package com.rakovets.course.java.core.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest {
    public static Stream<Arguments> concatProviderArguments() {
        return Stream.of(
                Arguments.of("HelloJava", "Hello", "Java"),
                Arguments.of("Java", "", "Java"),
                Arguments.of("Hello", "Hello", "")
        );
    }

    @ParameterizedTest
    @MethodSource("concatProviderArguments")
    void getConcatString(String expected, String str1, String str2) {
        String actual = StringUtil.getConcatString(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> getIndexProviderArguments() {
        return Stream.of(
                Arguments.of(1, "HelloJava", 'e'),
                Arguments.of(-1, "HelloJava", 'k'),
                Arguments.of(-1, "HelloJava", '0')
        );
    }

    @ParameterizedTest
    @MethodSource("getIndexProviderArguments")
    void getIndexForChar(int expected, String str, char symbol) {
        int actual = StringUtil.getIndexForChar(str, symbol);
        Assertions.assertEquals(expected, actual);
    }
}
