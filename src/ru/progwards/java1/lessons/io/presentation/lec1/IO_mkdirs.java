package ru.progwards.java1.lessons.io.presentation.lec1;

import java.io.File;

public class IO_mkdirs {
    public static void main(String[] args) {
        File f = new File("c:/Academy/цепь/каталогов/создана/с использованием/mkdirs");

        if (f.mkdirs())
            System.out.println("Цепь каталогов создана");
        else
            System.out.println("Не удалось создать цепь каталогов");
    }
}
