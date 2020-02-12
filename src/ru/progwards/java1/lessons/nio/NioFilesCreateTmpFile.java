package ru.progwards.java1.lessons.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFilesCreateTmpFile {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Projects/Academy/Java1");

        String prefix = "progwards_";
        String suffix = ".tmp";
        Path tmpFile = Files.createTempFile(path, prefix, suffix);

        System.out.println("Создан временный файл " + tmpFile);
    }
}
