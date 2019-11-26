package ru.progwards.java1.lessons.classes3;

import java.math.BigDecimal;

public class BigDecimalExample1 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1234.56789");
        System.out.println("bigDecimal = " + bigDecimal);
        System.out.println("unscaledValue = " + bigDecimal.unscaledValue());
        System.out.println("scale = " + bigDecimal.scale());
    }
}
