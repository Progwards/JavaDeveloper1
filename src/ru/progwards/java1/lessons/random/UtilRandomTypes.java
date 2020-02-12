package ru.progwards.java1.lessons.random;

import java.util.Arrays;
import java.util.Random;

public class UtilRandomTypes {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("random.nextInt() = " + random.nextInt());
        System.out.println("random.nextLong() = " + random.nextLong());
        System.out.println("random.nextFloat() = " + random.nextFloat());
        System.out.println("random.nextDouble() = " + random.nextDouble());
        System.out.println("random.nextBoolean() = " + random.nextBoolean());

        byte[] byteArr = new byte[5];
        random.nextBytes(byteArr);
        System.out.println("byteArr = " + Arrays.toString(byteArr));
    }
}
