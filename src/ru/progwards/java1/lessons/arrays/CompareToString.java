package ru.progwards.java1.lessons.arrays;

public class CompareToString {
    public static void main(String[] args) {
        String str1 = "ABCDE12345";
        String str2 = "ABCDE12345";

        System.out.println(str1.compareTo(str2));

        str1 = "aBCDE12345";
        str2 = "ABCDE12345";

        System.out.println(str1.compareTo(str2));

        str1 = "ABCDE12345";
        str2 = "CDE12345";

        System.out.println(str1.compareTo(str2));
    }
}
