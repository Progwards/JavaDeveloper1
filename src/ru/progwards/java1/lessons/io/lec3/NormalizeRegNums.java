package ru.progwards.java1.lessons.io.lec3;

import java.util.Arrays;

public class NormalizeRegNums {
    public static void main(String[] args) {
        String[] regNumArr = {"а 123 аК 577", " № в987Ва  599",
                "  Е555еЕ ### 55   ", " К 000 ек 0 0", "А 3 2 1 а а   9 5 5"};
        for (int i = 0; i < regNumArr.length; i++) {
            regNumArr[i] = regNumArr[i].replace(" ", ""); // убираем пробелы
            regNumArr[i] = regNumArr[i].replace("№", ""); // убираем №
            regNumArr[i] = regNumArr[i].toUpperCase(); // переводим в верхний регистр
        }

        System.out.println(Arrays.toString(regNumArr));
    }
}
