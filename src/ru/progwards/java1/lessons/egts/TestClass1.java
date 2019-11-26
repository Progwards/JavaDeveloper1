//Задача1. Класс EgtsDirectionAndSpeed
package ru.progwards.java1.lessons.egts;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
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

            {"task3", "Задача1. Класс EgtsDirectionAndSpeed", "62", ""},
            {"test1", "Тест на направление < 128 градусов", "14", "*"},
            {"test2", "Тест на направление >= 128 и < 256 градусов", "14", "*"},
            {"test3", "Тест на направление >= 256 градусов", "14", ""},
            {"test4", "Тест на скорость со старшим битом 0", "10", "*"},
            {"test5", "Тест на скорость со старшим битом 1", "10", ""},
    };

    // Если надо - инициализация и завершение теста
    @Before
    public void init() {
    }

    @After
    public void done() {
    }

    @Test
    public void test1() {
        Assert.assertEquals("Проверка getDirection()", 0, EgtsDirectionAndSpeed.getDirection((byte)0, (short)0));
        Assert.assertEquals("Проверка getDirection()", 55, EgtsDirectionAndSpeed.getDirection((byte)55, (short)1000));
        Assert.assertEquals("Проверка getDirection()", 127, EgtsDirectionAndSpeed.getDirection((byte)127, (short)32000));
    }

    @Test
    public void test2() {
        Assert.assertEquals("Проверка getDirection()", 255, EgtsDirectionAndSpeed.getDirection((byte)-1, (short)0));
        Assert.assertEquals("Проверка getDirection()", 201, EgtsDirectionAndSpeed.getDirection((byte)-55, (short)1000));
        Assert.assertEquals("Проверка getDirection()", 128, EgtsDirectionAndSpeed.getDirection((byte)-128, (short)32000));
    }

    @Test
    public void test3() {
        Assert.assertEquals("Проверка getDirection()", 359, EgtsDirectionAndSpeed.getDirection((byte)103, (short)-1));
        Assert.assertEquals("Проверка getDirection()", 311, EgtsDirectionAndSpeed.getDirection((byte)55, (short)-1000));
        Assert.assertEquals("Проверка getDirection()", 256, EgtsDirectionAndSpeed.getDirection((byte)0, (short)-32000));
    }

    @Test
    public void test4() {
        Assert.assertEquals("Проверка getSpeed()", 0, EgtsDirectionAndSpeed.getSpeed((short)0));
        Assert.assertEquals("Проверка getSpeed()", 67, EgtsDirectionAndSpeed.getSpeed((short)67));
        Assert.assertEquals("Проверка getSpeed()", 255, EgtsDirectionAndSpeed.getSpeed((short)255));
    }

    @Test
    public void test5() {
        Assert.assertEquals("Проверка getSpeed()", 0, EgtsDirectionAndSpeed.getSpeed((short)-32768));
        Assert.assertEquals("Проверка getSpeed()", 67, EgtsDirectionAndSpeed.getSpeed((short)-32701));
        Assert.assertEquals("Проверка getSpeed()", 255, EgtsDirectionAndSpeed.getSpeed((short)-32513));
    }

    // это обязательная функция, она возвращает данные теста утилите
    public static String[][] getData() {
        return testData;
    }
}
