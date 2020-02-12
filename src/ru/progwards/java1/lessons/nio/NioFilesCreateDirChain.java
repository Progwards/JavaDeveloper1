package ru.progwards.java1.lessons.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFilesCreateDirChain {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Projects/Academy/Java1/tmp1/tmp2/tmp3/tmp4/tmp5");

        System.out.println("Создаём цепь каталогов: " + path);
        Files.createDirectories(path);
    }
}
