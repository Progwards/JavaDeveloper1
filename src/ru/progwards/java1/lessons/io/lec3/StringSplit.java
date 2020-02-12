package ru.progwards.java1.lessons.io.lec3;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String regNums = "Слово1,Слово2,Слово3,Слово4,Слово5";
        String[] regNumArr = regNums.split(",");
        System.out.println("Длина массива: " + regNumArr.length);
        System.out.println(Arrays.toString(regNumArr));
    }
}
