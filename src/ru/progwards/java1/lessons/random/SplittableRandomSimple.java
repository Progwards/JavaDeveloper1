package ru.progwards.java1.lessons.random;

import java.util.Arrays;
import java.util.SplittableRandom;

public class SplittableRandomSimple {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        System.out.println("random.nextInt() = " + random.nextInt(-10, 10));
        System.out.println("random.nextLong() = " + random.nextLong(-100, 100));
        //System.out.println("random.nextFloat() = " + random.nextFloat());
        System.out.println("random.nextDouble() = " + random.nextDouble(9.999, 10));
        System.out.println("random.nextBoolean() = " + random.nextBoolean());

        byte[] byteArr = new byte[5];
        random.nextBytes(byteArr);
        System.out.println("byteArr = " + Arrays.toString(byteArr));

        int[] intArr = random.ints(5, -1, 16).toArray();
        System.out.println("rndArr = " + Arrays.toString(intArr));
    }
}
