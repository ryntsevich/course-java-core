package com.rakovets.course.java.core.practice.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    public static String getConcatString(String str1, String str2) {
        return str1.concat(str2);
    }

    public static int getIndexForChar(String str, char symbol) {
        return str.indexOf(symbol);
    }

    public static boolean isEquals(String str1, String str2) {
        return str1.equals(str2);
    }

    public static String getTrimAndUpperCase(String str) {
        return str.trim().toUpperCase();
    }

    public static String getSubstring(String str, int beginIndex, int endIndex) {
        return str.substring(beginIndex, endIndex);
    }

    public static String replaceEmoji(String str) {
        return str.replace(":(", ":)");
    }

    public static boolean isStartWithAndEndWith(String text, String word) {
        text = text.toLowerCase();
        word = word.toLowerCase();
        return text.startsWith(word) && text.endsWith(word);
    }

    public static int getAmountVowels(String str) {
        int counter = 0;
        str = str.toLowerCase();
        String vowels = "euioa";
        for (char letter : str.toCharArray()) {
            if (vowels.indexOf(letter) != -1) {
                counter++;
            }
        }
        return counter;
    }

    public static int getAmountPunctuationMark(String str) {
        int counter = 0;
        char[] punctuationMarkArray = str.toCharArray();
        for (char mark : punctuationMarkArray) {
            if (mark == '.' || mark == '?' || mark == '!' || mark == ',') {
                counter++;
            }
        }
        return counter;
    }

    public static boolean isPalindrome(String str) {
        str = str.trim();
        StringBuilder strBuilder = new StringBuilder(str);
        return strBuilder.reverse().toString().equalsIgnoreCase(str);
    }

    public static String[] getArraySubstrings(String str, int n) {
        int size = str.length() / n + (str.length() % n == 0 ? 0 : 1);
        String[] resultArray = new String[size];
        for (int i = 0; i < resultArray.length; i++) {
            if (i == resultArray.length - 1) {
                resultArray[i] = str.substring(i * n);
            } else {
                resultArray[i] = str.substring(i * n, (i + 1) * n);
            }
        }
        System.out.println(Arrays.toString(resultArray));
        return resultArray;
    }

    public static int getAmountWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static String getInitials(String str) {
        String[] words = str.trim().toUpperCase().split("\\s+");
        return words[0].charAt(0) + "" + words[1].charAt(0);
    }

    public static String getNumeralsString(String str) {
        StringBuilder result = new StringBuilder();
        Pattern pattern = Pattern.compile("\\d*");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            result.append(matcher.group());
        }
        return result.toString();
    }

    public static String getUniqueLetters(String str1, String str2) {
        str1 = str1.trim().toLowerCase();
        str2 = str2.trim().toLowerCase();
        StringBuilder str1Builder = new StringBuilder(str1);
        StringBuilder str2Builder = new StringBuilder(str2);
        boolean isNotUnique = false;

        for (int i = 0; i < str1Builder.length(); i++) {
            for (int j = 0; j < str2Builder.length(); j++) {
                if (str1Builder.charAt(i) == str2Builder.charAt(j)) {
                    str2Builder.replace(j, j + 1, " ");
                    isNotUnique = true;
                }
            }
            if (isNotUnique) {
                str1Builder.replace(i, i + 1, " ");
            }
            isNotUnique = false;
        }
        return str1Builder.append(str2Builder).toString().trim();
    }

    public static boolean isIdenticalArrays(String[] array1, String[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }

    public static String compareSpeedOfAdditionMethod(int number) {
        String resultString = "";
        StringBuilder resultStringBuild = new StringBuilder();
        long startTimeString = System.nanoTime();
        for (int i = 0; i < number; i++) {
            resultString += "ra";
        }
        long timeSpentInString = System.nanoTime() - startTimeString;
        startTimeString = System.nanoTime();
        resultStringBuild.append("ra".repeat(Math.max(0, number)));
        long timeSpentInStringBuilder = System.nanoTime() - startTimeString;

        return "String: " + timeSpentInString + "\nStringBuilder: " + timeSpentInStringBuilder;
    }

    public static String replaceDuplicateSymbol(String str) {
        return str.replaceAll("(.)\\1+", "$1");
    }
}
