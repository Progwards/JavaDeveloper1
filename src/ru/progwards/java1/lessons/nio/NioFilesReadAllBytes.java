package ru.progwards.java1.lessons.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFilesReadAllBytes {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Projects/Academy/Java1/file1.txt");

        byte[] allBytes = Files.readAllBytes(path);

        for (int i = 0, j = allBytes.length; i < j; i++) {
            int unsignedByte = allBytes[i] & 0xFF;
            System.out.print(Integer.toHexString(unsignedByte) + ",");
            if (i % 16 == 15)
                System.out.println();
        }
    }
}
