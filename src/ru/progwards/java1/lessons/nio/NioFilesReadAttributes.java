package ru.progwards.java1.lessons.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class NioFilesReadAttributes {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Projects/Academy/Java1/file1.txt");

        String attrNames =
                "lastModifiedTime," +
                "lastAccessTime,"+
                "creationTime," +
                "size," +
                "isRegularFile," +
                "isDirectory," +
                "isSymbolicLink," +
                "isOther";

        Map<String, Object> attrMap =
                Files.readAttributes(path, attrNames);
        System.out.println("Базовый атрибут:");
        for (String attr: attrNames.split(","))
            System.out.println(attr + ": " + attrMap.get(attr));
    }
}
