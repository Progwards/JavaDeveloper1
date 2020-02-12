package ru.progwards.java1.lessons.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFileCopy {
    final static String HOME_DIR = "C:/Projects/Academy/Java1";

    public static void main(String[] args) {
        Path dir1 = Paths.get(HOME_DIR);

        try {
            Path srcFile = dir1.resolve("file1.txt");
            Path dstFile = dir1.resolve("file1copy.txt");

            Path result = Files.copy(srcFile, dstFile);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
