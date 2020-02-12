package ru.progwards.java1.lessons.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class NioGlobFileMatcherRecursiveListExt {
    final static String pattern = "glob:**/*.{txt,log,iml}";

    public static void main(String[] args) throws IOException {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(pattern);

        Files.walkFileTree(Paths.get("C:/Projects/Academy/Java1"), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
                if (pathMatcher.matches(path))
                    System.out.println(path);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException e) {
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
