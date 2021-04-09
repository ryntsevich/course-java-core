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


}
