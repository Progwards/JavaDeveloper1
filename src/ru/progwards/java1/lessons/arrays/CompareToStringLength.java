package ru.progwards.java1.lessons.arrays;

public class CompareToStringLength {
    public static void main(String[] args) {
        String str1 = "12345";

        System.out.println(str1.compareTo(""));
        System.out.println("".compareTo(str1));

        System.out.println(str1.length());
    }
}
