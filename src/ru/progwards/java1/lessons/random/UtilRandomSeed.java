package ru.progwards.java1.lessons.random;

import java.util.Random;

public class UtilRandomSeed {
    public static void main(String[] args) {
        final long SEED = 54321012345L;
        Random random = new Random(SEED);
        for (int i = 0; i < 5; i++)
            System.out.println("random.nextDouble() = " + random.nextDouble());

        random.setSeed(SEED);
        System.out.println("seed переустановлен:");
        for (int i = 0; i < 5; i++)
            System.out.println("random.nextDouble() = " + random.nextDouble());
    }
}
