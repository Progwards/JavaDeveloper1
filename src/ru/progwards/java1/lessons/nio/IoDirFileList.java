package ru.progwards.java1.lessons.nio;

import java.io.File;

public class IoDirFileList {
    public static void main(String args[]) {
        // задаём целевой каталог
        File dir = new File("C:/Projects/Academy/Java1");
        // получаем список файлов и каталогов
        File[] listFiles = dir.listFiles();

        for (File f : listFiles) {
            System.out.println(
                String.format("%-17s", f.getName()) +
                (f.isHidden() ? "скрытый " : "") +
                (f.isDirectory() ? "каталог" : f.length() + " байт")
            );
        }
    }
}
