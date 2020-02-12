package ru.progwards.java1.lessons.random;

import java.security.SecureRandom;

public class SecureRandomSeedResearch {
    public static void main(String[] args) {
        byte[] seed = {-7, 55, 1, -33, 5};
        SecureRandom random = new SecureRandom(seed);

        for (int i = 0; i < 5; i++)
            System.out.println("nextInt = " + random.nextInt(10));

        System.out.println();
        random.setSeed(seed);
        for (int i = 0; i < 5; i++)
            System.out.println("nextInt = " + random.nextInt(10));
    }
}
