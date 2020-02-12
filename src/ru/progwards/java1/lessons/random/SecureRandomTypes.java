package ru.progwards.java1.lessons.random;

import java.security.SecureRandom;
import java.util.Arrays;

public class SecureRandomTypes {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
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
