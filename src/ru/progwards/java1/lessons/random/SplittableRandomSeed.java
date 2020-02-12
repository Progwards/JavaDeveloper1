package ru.progwards.java1.lessons.random;

import java.util.SplittableRandom;

public class SplittableRandomSeed {
    public static void main(String[] args) {
        final long SEED = 54321012345L;

        SplittableRandom random1 = new SplittableRandom(SEED);
        for (int i = 0; i < 5; i++)
            System.out.println("random1.nextInt() = " +
                    random1.nextInt(0, 10));

        System.out.println();
        SplittableRandom random2 = new SplittableRandom(SEED);
        for (int i = 0; i < 5; i++)
            System.out.println("random2.nextInt() = " +
                    random2.nextInt(0, 10));
    }
}
