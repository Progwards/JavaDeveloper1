package ru.progwards.java1.lessons.random;

import java.util.Random;
import java.util.SplittableRandom;

public class TestSplittableRandomAndRandom {
    public static void main(String[] args) {
        Random random = new Random();
        SplittableRandom s_random = new SplittableRandom();
        long start = System.currentTimeMillis();
        random.ints(500_000_000, -1, 16).toArray();
        System.out.println("Random: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        s_random.ints(500_000_000, -1, 16).toArray();
        System.out.println("SplittableRandom: " + (System.currentTimeMillis() - start));
    }
}
