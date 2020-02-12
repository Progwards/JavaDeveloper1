package ru.progwards.java1.lessons.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFilesCreateFileDir {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Projects/Academy/Java1");
        Path newDir = path.resolve("tmp_dir");

        System.out.println("Создаём каталог: " + newDir);
        Files.createDirectory(newDir);

        Path newFile = newDir.resolve("tmp_file.txt");
        System.out.println("Создаём файл: " + newFile);
        Files.createFile(newFile);
    }
}
