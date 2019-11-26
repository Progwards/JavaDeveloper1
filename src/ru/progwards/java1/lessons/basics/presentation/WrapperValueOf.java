package ru.progwards.java1.lessons.basics.presentation;

public class WrapperValueOf {
    public static void main(String[] args) {
        Integer int1 = Integer.valueOf(5);
        Integer int2 = Integer.valueOf("55555");

        Double doub1 = Double.valueOf(5.0);
        Double doub2 = Double.valueOf(5);
        Double doub3 = Double.valueOf("555.55");

        System.out.println(int1);
        System.out.println(int2);
        System.out.println(doub1);
        System.out.println(doub2);
        System.out.println(doub3);
    }
}
