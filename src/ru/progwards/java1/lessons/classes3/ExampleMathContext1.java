package ru.progwards.java1.lessons.classes3;

import java.math.BigDecimal;
import java.math.MathContext;

public class ExampleMathContext1 {
    public static void main(String[] args) {
        BigDecimal bigDec1 = new BigDecimal("12345");
        BigDecimal bigDec2 = new BigDecimal("0.54321");
        MathContext mathContext = new MathContext(1);
        BigDecimal result = bigDec1.add(bigDec2, mathContext);
        System.out.println("result = " + result);
        System.out.println("unscaledValue = " + result.unscaledValue());
        System.out.println("scale = " + result.scale());
    }
}
