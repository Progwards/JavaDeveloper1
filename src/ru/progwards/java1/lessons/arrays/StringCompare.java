package ru.progwards.java1.lessons.arrays;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "12345";
        String str2 = "1234";
        str2 += "5";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
