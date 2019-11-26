package ru.progwards.java1.intro;

public class SimpleBinString {
    // представление числа в двоичной системе счисления
    public static void main(String[] args) {
        int value = 255; // число
        int base = 2; // база
        String result = ""; // результат

        while (value > 0) {
            int remainder = value % base;
            value = value / base;
            System.out.println("value = " + value);

            // конвертация числа типа int в строку
            result = Integer.toString(remainder) + result;
        }

        System.out.println("Результат: " + result);
    }
}
