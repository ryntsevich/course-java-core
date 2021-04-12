package com.rakovets.course.java.core.practice.string;

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
        char[] charArray = str.toCharArray();
        for (char letter : charArray) {
            if (letter == 'e' || letter == 'u' || letter == 'i' || letter == 'o' || letter == 'a') {
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
}
