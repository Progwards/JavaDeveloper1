package ru.progwards.java1.lessons.classes3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalInMinute {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("12345.54321");
        BigDecimal bigDecimalInt = new BigDecimal("12345");
        BigDecimal bigDecimalFrac = new BigDecimal("0.54321");
        System.out.println("bigDecimal = " + bigDecimal);

        BigDecimal result1 = bigDecimal.subtract(bigDecimalFrac);
        BigDecimal result2 = bigDecimal.subtract(bigDecimalInt);
        BigDecimal result3 = result1.add(result2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        System.out.println("result3 * 10 = " + result3.multiply(BigDecimal.TEN));
        System.out.println("result3 / 10 = " + result3.divide(BigDecimal.TEN));
        System.out.println("result3 / 17 = " + result3.divide(new BigDecimal(17), RoundingMode.HALF_UP));
    }
}
