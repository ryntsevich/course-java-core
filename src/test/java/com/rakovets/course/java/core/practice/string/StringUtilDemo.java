package com.rakovets.course.java.core.practice.string;

public class StringUtilDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(StringUtil.compareSpeedOfAdditionMethod(10));
        System.out.println(StringUtil.compareSpeedOfAdditionMethod(100));
        System.out.println(StringUtil.compareSpeedOfAdditionMethod(1_000));
        System.out.println(StringUtil.compareSpeedOfAdditionMethod(10_000));
        System.out.println(StringUtil.compareSpeedOfAdditionMethod(100_000));
    }
}
