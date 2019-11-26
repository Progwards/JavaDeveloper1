package ru.progwards.java1.lessons.classes3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDivisionSolve1 {
    public static void main(String[] args) {
        BigDecimal bigDec1 = BigDecimal.ONE;
        BigDecimal bigDec2 = BigDecimal.valueOf(3);
        BigDecimal result = bigDec1.divide(bigDec2, 5, RoundingMode.HALF_UP);
        System.out.println("result = " + result);
        System.out.println("unscaledValue = " + result.unscaledValue());
        System.out.println("scale = " + result.scale());
    }
}
