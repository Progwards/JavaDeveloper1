package ru.progwards.java1.lessons.basics;

public class WrapperUnboxing {
    public static void main(String[] args) {
        Integer intObj1 = 5;

        int int1 = intObj1.intValue();

        byte byte1 = intObj1.byteValue();
        short short1 = intObj1.shortValue();
        long long1 = intObj1.longValue();
        double double1 = intObj1.doubleValue();
        float float1 = intObj1.floatValue();

        System.out.println(int1);
        System.out.println(byte1);
        System.out.println(short1);
        System.out.println(long1);
        System.out.println(double1);
        System.out.println(float1);
    }
}
