package ru.progwards.java1.lessons.nio;

import java.io.File;
import java.io.FileFilter;

public class IoDirFileListFileFilterExtTxt {
    public static void main(String args[]) {
        // задаём целевой каталог
        File dir = new File("C:/Projects/Academy/Java1");
        // получаем список файлов и каталогов
        File[] listFiles = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().toUpperCase().endsWith(".TXT");
            }
        });

        for (File f : listFiles) {
            System.out.println(
                    String.format("%-17s", f.getName()) +
                            (f.isHidden() ? "скрытый " : "") +
                            (f.isDirectory() ? "каталог" : f.length() + " байт")
            );
        }
    }
}
