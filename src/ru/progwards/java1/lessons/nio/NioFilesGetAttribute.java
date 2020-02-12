package ru.progwards.java1.lessons.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFilesGetAttribute {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Projects/Academy/Java1/file1.txt");

        String[] attrNames = {
                "lastModifiedTime",
                "lastAccessTime",
                "creationTime",
                "size",
                "isRegularFile",
                "isDirectory",
                "isSymbolicLink",
                "isOther" // что-то другое
        };

        System.out.println("Базовый атрибут:");
        for (String attrName: attrNames)
            System.out.println(attrName + ": " +
                    Files.getAttribute(path, "basic:" + attrName));
    }
}
