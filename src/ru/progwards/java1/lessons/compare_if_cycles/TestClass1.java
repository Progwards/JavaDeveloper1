package ru.progwards.java1.lessons.compare_if_cycles;

import org.junit.Assert;
import org.junit.Test;

public class TestClass1 {
    // массив с данными для процессинга результата теста
    // 0: идентификатор теста, - имя функции @Test
    // 1: имя теста словами, если == "", то возмется идентификатор
    // 2: баллы за эту часть теста
    // 3: * отмечены обязательные части теста
    private static String[][] testData = {
            // Первая строка [0] содержит данные о всем тесте.
            // Оценка отражает проходной балл
            //       - это информация для утилиты проверки

            {"task1", "ДЗ урока Compare, задача TriangleSimpleInfo", "20", ""},
            {"test1", "Тест maxSide", "7", "*"},
            {"test2", "Тест minSide", "7", "*"},
            {"test3", "Тест isEquilateralTriangle", "6", "*"},
    };

    @Test
    public void test1() {
        Assert.assertEquals("Проверка maxSide()", 5, TriangleSimpleInfo.maxSide(3, 4, 5));
        Assert.assertEquals("Проверка maxSide()", 7, TriangleSimpleInfo.maxSide(5, 7, 7));
        Assert.assertEquals("Проверка maxSide()", 1500, TriangleSimpleInfo.maxSide(1500, 1000, 1007));
    }

    @Test
    public void test2() {
        Assert.assertEquals("Проверка minSide()", 3, TriangleSimpleInfo.minSide(3, 4, 5));
        Assert.assertEquals("Проверка minSide()", 5, TriangleSimpleInfo.minSide(5, 7, 7));
        Assert.assertEquals("Проверка minSide()", 1000, TriangleSimpleInfo.minSide(1500, 1000, 1007));
    }

    @Test
    public void test3() {
        Assert.assertEquals("Проверка isEquilateralTriangle()", false, TriangleSimpleInfo.isEquilateralTriangle(3, 4, 5));
        Assert.assertEquals("Проверка isEquilateralTriangle()", true, TriangleSimpleInfo.isEquilateralTriangle(5, 5, 5));
        Assert.assertEquals("Проверка isEquilateralTriangle()", false, TriangleSimpleInfo.isEquilateralTriangle(3, 5, 5));
        Assert.assertEquals("Проверка isEquilateralTriangle()", true, TriangleSimpleInfo.isEquilateralTriangle(1, 1, 1));
        Assert.assertEquals("Проверка isEquilateralTriangle()", false, TriangleSimpleInfo.isEquilateralTriangle(1000, 1000, 1));
    }

    // это обязательная функция, она возвращает данные теста утилите
    public static String[][] getData() {
        return testData;
    }
}
