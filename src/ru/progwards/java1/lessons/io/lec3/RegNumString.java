package ru.progwards.java1.lessons.io.lec3;

import java.util.Arrays;

public class RegNumString {
    public String regNum = "";

    public RegNumString(String str) {
        for (char c : str.toCharArray())
            if (Character.isDigit(c) || Character.isAlphabetic(c))
                regNum += Character.toUpperCase(c);
    }

    @Override
    public String toString() { return regNum; }

    public static void main(String[] args) {
        String[] regNumArr = {"а 123 аК 577", " № в987Ва  599",
                "  Е555еЕ ### 55   ", " К 000 ек 0 0", "А 3 2 1 а а   9 5 5"};

        RegNumString[] regNums = new RegNumString[regNumArr.length];
        for (int i = 0; i < regNumArr.length; i++) {
            // превращаем строку в рег.номер
            regNums[i] = new RegNumString(regNumArr[i]);
        }

        System.out.println(Arrays.toString(regNums));
    }
}
