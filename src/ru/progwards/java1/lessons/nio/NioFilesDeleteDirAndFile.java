package ru.progwards.java1.lessons.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFilesDeleteDirAndFile {
    public static final void deleteAndSout(Path path) throws IOException {
        System.out.println("Удаляем: " + path);
        Files.deleteIfExists(path);
    }

    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("C:/Projects/Academy/Java1/symlinkJava1");
        Path path2 = Paths.get("C:/Projects/Academy/Java1/tmp_dir/tmp_file.txt");
        Path path3 = Paths.get("C:/Projects/Academy/Java1/tmp_dir");
        Path path4 = Paths.get("C:/Projects/Academy/Java1/tmp1/tmp2/tmp3/tmp4/tmp5");
        Path path5 = Paths.get("C:/Projects/Academy/Java1/progwards_3429522540631986900.tmp");

        deleteAndSout(path1);
        deleteAndSout(path2);
        deleteAndSout(path3);
        for (int i = 0; i < 5; i++) {
            deleteAndSout(path4);
            path4 = path4.getParent();
        }
        deleteAndSout(path5);
    }
}
