package ru.progwards.java1.lessons.random;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomSeedResearch {
    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();

        random.setSeed(1000);
        for (int i = 0; i < 5; i++)
            System.out.println("nextInt = " + random.nextInt(10));
    }
}
