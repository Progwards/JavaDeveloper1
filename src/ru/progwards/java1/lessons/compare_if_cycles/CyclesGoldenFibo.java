package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        long remainder;
        do {
            remainder = number % 10;
            if (remainder == digit)
                return true;
            number /= 10;
        } while (number > 0);

        return false;
    }

    public static int fiboNumber(int n) {
        int a = 1;
        int fibo = 0;
        int counter = 0;

        while (counter++ < n) {
            int a1 = a;
            a = fibo;
            fibo += a1;

        }

        return fibo;
    }

    private static boolean isGoldenRatio(int side, int base) {
        double ratio = (double)side / base;

        return 1.61703 < ratio && ratio < 1.61903;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        if (a == b) {
            // основание c
            if (isGoldenRatio(a, c))
                return true;
        } else if (b == c) {
            // основание a
            if (isGoldenRatio(b, a))
                return true;
        } else if (a == c) {
            // основание b
            if (isGoldenRatio(a, b))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.print("Золотые треугольники: ");
        for (int i = 0; i < 100; i++) {
            // i - основание
            for (int j = i + 1; j < 100; j++) {
                // j - сторона
                if (isGoldenTriangle(j, j, i))
                    System.out.println("основание: " + i + ", сторона: " + j);
            }

        }

        System.out.print("Ряд Фибоначчи: ");
        for (int i = 1; i <= 15; i++) {
            System.out.print(fiboNumber(i) + ", ");
        }
    }
}
