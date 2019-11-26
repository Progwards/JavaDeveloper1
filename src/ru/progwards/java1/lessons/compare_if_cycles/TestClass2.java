package ru.progwards.java1.lessons.compare_if_cycles;

import org.junit.Assert;
import org.junit.Test;

public class TestClass2 {
    // массив с данными для процессинга результата теста
    // 0: идентификатор теста, - имя функции @Test
    // 1: имя теста словами, если == "", то возмется идентификатор
    // 2: баллы за эту часть теста
    // 3: * отмечены обязательные части теста
    private static String[][] testData = {
            // Первая строка [0] содержит данные о всем тесте.
            // Оценка отражает проходной балл
            //       - это информация для утилиты проверки

            {"task2", "ДЗ урока Compare, задача TriangleInfo", "20", ""},
            {"test1", "Тест isTriangle", "7", "*"},
            {"test2", "Тест isRightTriangle", "7", "*"},
            {"test3", "Тест isIsoscelesTriangle", "6", "*"},
    };

    @Test
    public void test1() {
        Assert.assertEquals("Проверка isTriangle()", true, TriangleInfo.isTriangle(3, 4, 5));
        Assert.assertEquals("Проверка isTriangle()", true, TriangleInfo.isTriangle(5, 7, 7));
        Assert.assertEquals("Проверка isTriangle()", true, TriangleInfo.isTriangle(1500, 1000, 1007));
        Assert.assertEquals("Проверка isTriangle()", false, TriangleInfo.isTriangle(4, 1, 5));
        Assert.assertEquals("Проверка isTriangle()", false, TriangleInfo.isTriangle(301, 100, 201));
    }

    @Test
    public void test2() {
        Assert.assertEquals("Проверка isRightTriangle()", true, TriangleInfo.isRightTriangle(3, 4, 5));
        Assert.assertEquals("Проверка isRightTriangle()", false, TriangleInfo.isRightTriangle(5, 7, 7));
        Assert.assertEquals("Проверка isRightTriangle()", true, TriangleInfo.isRightTriangle(6, 8, 10));
    }

    @Test
    public void test3() {
        Assert.assertEquals("Проверка isIsoscelesTriangle()", false, TriangleInfo.isIsoscelesTriangle(3, 4, 5));
        Assert.assertEquals("Проверка isIsoscelesTriangle()", true, TriangleInfo.isIsoscelesTriangle(5, 5, 5));
        Assert.assertEquals("Проверка isIsoscelesTriangle()", true, TriangleInfo.isIsoscelesTriangle(3, 5, 5));
        Assert.assertEquals("Проверка isIsoscelesTriangle()", true, TriangleInfo.isIsoscelesTriangle(1, 1, 1));
        Assert.assertEquals("Проверка isIsoscelesTriangle()", true, TriangleInfo.isIsoscelesTriangle(1000, 1000, 1));
    }

    // это обязательная функция, она возвращает данные теста утилите
    public static String[][] getData() {
        return testData;
    }
}
