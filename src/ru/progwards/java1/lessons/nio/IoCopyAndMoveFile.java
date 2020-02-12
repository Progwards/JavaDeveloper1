package ru.progwards.java1.lessons.nio;

import java.io.File;

public class IoCopyAndMoveFile {
    public static void main(String[] args) {
        File file = new File("C:/Projects/Academy/Java1/file1.txt");

        if(file.renameTo(new File("C:/Projects/Academy/Java1/iocopy/file1copy.txt"))) {
            System.out.println("Файл успешно перенесён");
        } else {
            System.out.println("Возникла ошибка при переносе файла");
        }
    }
}
