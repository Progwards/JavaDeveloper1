package ru.progwards.java1.lessons.io.lec3;

import java.util.Arrays;

public class RegNumString2 {
    private String regNum = "";

    public RegNumString2(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str.toCharArray())
            if (Character.isDigit(c) || Character.isAlphabetic(c))
                stringBuilder.append(Character.toUpperCase(c));
        regNum = stringBuilder.toString();
    }

    @Override
    public String toString() { return regNum; }

    public static void main(String[] args) {
        String[] regNumArr = {"а 123 аК 577", " № в987Ва  599",
                "  Е555еЕ ### 55   ", " К 000 ек 0 0", "А 3 2 1 а а   9 5 5"};

        RegNumString2[] regNums = new RegNumString2[regNumArr.length];
        for (int i = 0; i < regNumArr.length; i++) {
            // превращаем строку в рег.номер
            regNums[i] = new RegNumString2(regNumArr[i]);
        }

        System.out.println(Arrays.toString(regNums));
    }
}
