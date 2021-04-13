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

    public static Stream<Arguments> isEqualsProviderArguments() {
        return Stream.of(
                Arguments.of(true, "Hello", "Hello"),
                Arguments.of(false, "Hello", "hello"),
                Arguments.of(false, "poca", "роса"),
                Arguments.of(false, "Hello", "Hello ")
        );
    }

    @ParameterizedTest
    @MethodSource("isEqualsProviderArguments")
    void isEquals(boolean expected, String str1, String str2) {
        boolean actual = StringUtil.isEquals(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> getTrimAndUpperCaseProviderArguments() {
        return Stream.of(
                Arguments.of("HELLO", "hello"),
                Arguments.of("HELLO", " Hello "),
                Arguments.of("HELLO", "  HELLO  "),
                Arguments.of("HELLO JAVA", " Hello java ")
        );
    }

    @ParameterizedTest
    @MethodSource("getTrimAndUpperCaseProviderArguments")
    void getTrimAndUpperCase(String expected, String str) {
        String actual = StringUtil.getTrimAndUpperCase(str);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> getSubstringProviderArguments() {
        return Stream.of(
                Arguments.of("Hell", "Hello", 0, 4),
                Arguments.of("Hello", "  Hello", 2, 7)
        );
    }

    @ParameterizedTest
    @MethodSource("getSubstringProviderArguments")
    void getSubstring(String expected, String str, int beginIndex, int endIndex) {
        String actual = StringUtil.getSubstring(str, beginIndex, endIndex);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> replaceEmojiProviderArguments() {
        return Stream.of(
                Arguments.of(":)", ":("),
                Arguments.of("Hello :)", "Hello :("),
                Arguments.of("Hello(", "Hello("),
                Arguments.of(":):):):)", ":(:(:(:(")
        );
    }

    @ParameterizedTest
    @MethodSource("replaceEmojiProviderArguments")
    void replaceEmoji(String expected, String str) {
        String actual = StringUtil.replaceEmoji(str);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> isStartWithAndEndWithProviderArguments() {
        return Stream.of(
                Arguments.of(true, "HelloPumpkinHello", "Hello"),
                Arguments.of(false, "HelloPumpkinHello", "u"),
                Arguments.of(false, "HelloPumpkinHello", "He"),
                Arguments.of(false, "HelloPumpkinHello", "lo"),
                Arguments.of(true, "HelloPumpkinHello", "hello"),
                Arguments.of(true, " ", " ")
        );
    }

    @ParameterizedTest
    @MethodSource("isStartWithAndEndWithProviderArguments")
    void isStartWithAndEndWith(boolean expected, String text, String word) {
        boolean actual = StringUtil.isStartWithAndEndWith(text, word);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> getAmountVowelsProviderArguments() {
        return Stream.of(
                Arguments.of(1, "asd"),
                Arguments.of(0, "fgdfkltrsd"),
                Arguments.of(0, "олаф"),
                Arguments.of(5, "ooooo"),
                Arguments.of(0, " "),
                Arguments.of(5, "OOoia")
        );
    }

    @ParameterizedTest
    @MethodSource("getAmountVowelsProviderArguments")
    void test(int expected, String str) {
        int actual = StringUtil.getAmountVowels(str);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> getAmountPunctuationMarkProviderArguments() {
        return Stream.of(
                Arguments.of(1, "!"),
                Arguments.of(0, "fgdfkltrsd"),
                Arguments.of(4, "????.,!"),
                Arguments.of(0, " ")
        );
    }

    @ParameterizedTest
    @MethodSource("getAmountPunctuationMarkProviderArguments")
    void getAmountPunctuationMark(int expected, String str) {
        int actual = StringUtil.getAmountPunctuationMark(str);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> isPalindromeProviderArguments() {
        return Stream.of(
                Arguments.of(true, "deed"),
                Arguments.of(false, "dear"),
                Arguments.of(true, "DEed"),
                Arguments.of(true, "  deed ")
        );
    }

    @ParameterizedTest
    @MethodSource("isPalindromeProviderArguments")
    void isPalindrome(boolean expected, String str) {
        boolean actual = StringUtil.isPalindrome(str);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> getAmountWords() {
        return Stream.of(
                Arguments.of(4, "deed dddf sdf adf"),
                Arguments.of(4, "deed  dddf  sdf  adf"),
                Arguments.of(0, " ")
        );
    }

    @ParameterizedTest
    @MethodSource("getAmountWords")
    void getAmountWords(int expected, String str) {
        int actual = StringUtil.getAmountWords(str);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> getInitials() {
        return Stream.of(
                Arguments.of("DR", "DmitRY RakOVets"),
                Arguments.of("DR", "dmitRY rakOVets")
        );
    }

    @ParameterizedTest
    @MethodSource("getInitials")
    void getInitials(String expected, String str) {
        String actual = StringUtil.getInitials(str);
        Assertions.assertEquals(expected, actual);
    }
}
