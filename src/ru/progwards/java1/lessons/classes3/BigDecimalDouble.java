package ru.progwards.java1.lessons.classes3;

import java.math.BigDecimal;

public class BigDecimalDouble {
    public static void main(String[] args) {
        BigDecimal bigDec1 = new BigDecimal("1234.56789");
        System.out.println("bigDec1 = " + bigDec1);
        System.out.println("unscaledValue = " + bigDec1.unscaledValue());
        System.out.println("scale = " + bigDec1.scale() + "\n");

        BigDecimal bigDec2 = new BigDecimal(1234.56789);
        System.out.println("bigDec2 = " + bigDec2);
        System.out.println("unscaledValue = " + bigDec2.unscaledValue());
        System.out.println("scale = " + bigDec2.scale());
    }
}
