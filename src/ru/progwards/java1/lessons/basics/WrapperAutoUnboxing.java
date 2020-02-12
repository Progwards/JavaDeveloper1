package ru.progwards.java1.lessons.basics;

public class WrapperAutoUnboxing {
    public static void main(String[] args) {
        Integer int1 = 5;
        Integer int2 = 20;
        Double double1 = 25.0;

        int result1= int1 + int2;
        double result2 = int1 * double1;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println();
    }
}
