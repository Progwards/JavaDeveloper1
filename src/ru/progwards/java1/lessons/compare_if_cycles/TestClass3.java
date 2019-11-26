package ru.progwards.java1.lessons.compare_if_cycles;

import org.junit.Assert;
import org.junit.Test;

public class TestClass3 {
    // массив с данными для процессинга результата теста
    // 0: идентификатор теста, - имя функции @Test
    // 1: имя теста словами, если == "", то возмется идентификатор
    // 2: баллы за эту часть теста
    // 3: * отмечены обязательные части теста
    private static String[][] testData = {
            // Первая строка [0] содержит данные о всем тесте.
            // Оценка отражает проходной балл
            //       - это информация для утилиты проверки

            {"task3", "ДЗ урока Compare, задача CyclesGoldenFibo", "22", ""},
            {"test1", "Тест containsDigit", "5", "*"},
            {"test2", "Тест containsDigit с нулями", "5", "*"},
            {"test3", "Тест fiboNumber", "6", ""},
            {"test4", "Тест isGoldenTriangle", "6", ""},
    };

    @Test
    public void test1() {
        Assert.assertEquals("Проверка containsDigit()", false, CyclesGoldenFibo.containsDigit(12345, 0));
        Assert.assertEquals("Проверка containsDigit()", true, CyclesGoldenFibo.containsDigit(12345, 1));
        Assert.assertEquals("Проверка containsDigit()", true, CyclesGoldenFibo.containsDigit(12345, 2));
        Assert.assertEquals("Проверка containsDigit()", true, CyclesGoldenFibo.containsDigit(12345, 3));
        Assert.assertEquals("Проверка containsDigit()", true, CyclesGoldenFibo.containsDigit(12345, 4));
        Assert.assertEquals("Проверка containsDigit()", true, CyclesGoldenFibo.containsDigit(12345, 5));
        Assert.assertEquals("Проверка containsDigit()", false, CyclesGoldenFibo.containsDigit(12345, 6));
        Assert.assertEquals("Проверка containsDigit()", false, CyclesGoldenFibo.containsDigit(12345, 7));
        Assert.assertEquals("Проверка containsDigit()", false, CyclesGoldenFibo.containsDigit(12345, 8));
        Assert.assertEquals("Проверка containsDigit()", false, CyclesGoldenFibo.containsDigit(12345, 9));
    }

    @Test
    public void test2() {
        Assert.assertEquals("Проверка containsDigit()", true, CyclesGoldenFibo.containsDigit(0, 0));
        Assert.assertEquals("Проверка containsDigit()", false, CyclesGoldenFibo.containsDigit(0, 1));
        Assert.assertEquals("Проверка containsDigit()", false, CyclesGoldenFibo.containsDigit(0, 9));
    }

    @Test
    public void test3() {
        Assert.assertEquals("Проверка fiboNumber()", 1, CyclesGoldenFibo.fiboNumber(1));
        Assert.assertEquals("Проверка fiboNumber()", 1, CyclesGoldenFibo.fiboNumber(2));
        Assert.assertEquals("Проверка fiboNumber()", 2, CyclesGoldenFibo.fiboNumber(3));
        Assert.assertEquals("Проверка fiboNumber()", 3, CyclesGoldenFibo.fiboNumber(4));
        Assert.assertEquals("Проверка fiboNumber()", 5, CyclesGoldenFibo.fiboNumber(5));
        Assert.assertEquals("Проверка fiboNumber()", 8, CyclesGoldenFibo.fiboNumber(6));
        Assert.assertEquals("Проверка fiboNumber()", 13, CyclesGoldenFibo.fiboNumber(7));
        Assert.assertEquals("Проверка fiboNumber()", 21, CyclesGoldenFibo.fiboNumber(8));
        Assert.assertEquals("Проверка fiboNumber()", 34, CyclesGoldenFibo.fiboNumber(9));
        Assert.assertEquals("Проверка fiboNumber()", 55, CyclesGoldenFibo.fiboNumber(10));
        Assert.assertEquals("Проверка fiboNumber()", 89, CyclesGoldenFibo.fiboNumber(11));
        Assert.assertEquals("Проверка fiboNumber()", 144, CyclesGoldenFibo.fiboNumber(12));
        Assert.assertEquals("Проверка fiboNumber()", 233, CyclesGoldenFibo.fiboNumber(13));
        Assert.assertEquals("Проверка fiboNumber()", 377, CyclesGoldenFibo.fiboNumber(14));
        Assert.assertEquals("Проверка fiboNumber()", 610, CyclesGoldenFibo.fiboNumber(15));
        Assert.assertEquals("Проверка fiboNumber()", 987, CyclesGoldenFibo.fiboNumber(16));
        Assert.assertEquals("Проверка fiboNumber()", 1597, CyclesGoldenFibo.fiboNumber(17));
    }

    @Test
    public void test4() {
        Assert.assertEquals("Проверка isGoldenTriangle()", true, CyclesGoldenFibo.isGoldenTriangle(55, 55, 34));
        Assert.assertEquals("Проверка isGoldenTriangle()", true, CyclesGoldenFibo.isGoldenTriangle(34, 55, 55));
        Assert.assertEquals("Проверка isGoldenTriangle()", true, CyclesGoldenFibo.isGoldenTriangle(55, 34, 55));
        Assert.assertEquals("Проверка isGoldenTriangle()", true, CyclesGoldenFibo.isGoldenTriangle(89, 89, 55));
        Assert.assertEquals("Проверка isGoldenTriangle()", true, CyclesGoldenFibo.isGoldenTriangle(55, 89, 89));
        Assert.assertEquals("Проверка isGoldenTriangle()", true, CyclesGoldenFibo.isGoldenTriangle(89, 55, 89));
        Assert.assertEquals("Проверка isGoldenTriangle()", false, CyclesGoldenFibo.isGoldenTriangle(34, 34, 55));
        Assert.assertEquals("Проверка isGoldenTriangle()", false, CyclesGoldenFibo.isGoldenTriangle(1, 2, 3));
        Assert.assertEquals("Проверка isGoldenTriangle()", false, CyclesGoldenFibo.isGoldenTriangle(3, 4, 5));
    }

    // это обязательная функция, она возвращает данные теста утилите
    public static String[][] getData() {
        return testData;
    }
}
