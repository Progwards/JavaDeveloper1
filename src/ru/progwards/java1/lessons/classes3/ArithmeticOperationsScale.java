package ru.progwards.java1.lessons.classes3;

import java.math.BigDecimal;

public class ArithmeticOperationsScale {
    public static void main(String[] args) {
        BigDecimal bigDec1 = new BigDecimal("5.5");
        BigDecimal bigDec2 = new BigDecimal("1.0");
        System.out.println("bigDec1 unscaledValue = " + bigDec1.unscaledValue());
        System.out.println("bigDec1 scale = " + bigDec1.scale());
        System.out.println("bigDec2 unscaledValue = " + bigDec2.unscaledValue());
        System.out.println("bigDec2 scale = " + bigDec2.scale());

        BigDecimal result1 = bigDec1.add(bigDec2);
        System.out.println("result1 = " + result1);
        System.out.println("unscaledValue = " + result1.unscaledValue());
        System.out.println("scale = " + result1.scale());

        BigDecimal result2 = bigDec1.multiply(bigDec2);
        System.out.println("result2 = " + result2);
        System.out.println("unscaledValue = " + result2.unscaledValue());
        System.out.println("scale = " + result2.scale());
   }
}
