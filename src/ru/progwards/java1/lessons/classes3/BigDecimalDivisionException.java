package ru.progwards.java1.lessons.classes3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDivisionException {
    public static void main(String[] args) {
        BigDecimal bigDec1 = BigDecimal.ONE;
        BigDecimal bigDec2 = BigDecimal.valueOf(3);
        BigDecimal result = bigDec1.divide(bigDec2, RoundingMode.HALF_UP);
        System.out.println("bigDec1.unscaledValue = " + bigDec1.unscaledValue());
        System.out.println("bigDec1.scale = " + bigDec1.scale());
        System.out.println("bigDec2.unscaledValue = " + bigDec2.unscaledValue());
        System.out.println("bigDec2.scale = " + bigDec2.scale());
        System.out.println("result = " + result);
        System.out.println("unscaledValue = " + result.unscaledValue());
        System.out.println("scale = " + result.scale());
    }
}
