package ru.progwards.java1.lessons.random;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class PasswordCracking {
    private static final long multiplier = 0x5DEECE66DL;
    private static final long addend = 0xBL;
    private static final long mask = (1L << 48) - 1;

    public static void main(String[] args) {
        Random random = new Random();
        long v1 = random.nextInt(), v2 = random.nextInt(), v3 = random.nextInt(), v4 = random.nextInt();
        System.out.println("v1=" + v1 + "\nv2=" + v2 + "\nv3=" + v3 + "\nv4=" + v4);
        // brute-force seed
        for (int i = 0; i < 65536; i++) {
            long seed = (((long) v1) << 16) + i;
            int nextInt = (int)(((seed * multiplier + addend) & mask) >>> 16);
            if (nextInt == v2) {
                System.out.println("Seed found: " + seed);
                Random cRandom = new Random();
                try {
                    Field privateSeedField = Random.class.getDeclaredField("seed");
                    privateSeedField.setAccessible(true);
                    AtomicLong crackingSeed = (AtomicLong)privateSeedField.get(cRandom);
                    crackingSeed.set(seed);
                } catch (Exception e) {
                    System.out.println(e.toString());
                    System.exit(1);
                }
                long cv2 = cRandom.nextInt(), cv3 = cRandom.nextInt(), cv4 = cRandom.nextInt();
                System.out.println("Set seed and generate numbers");
                System.out.println("cv2=" + cv2 + "\ncv3=" + cv3 + "\ncv4=" + cv4);
                break;
            }
        }
    }
}