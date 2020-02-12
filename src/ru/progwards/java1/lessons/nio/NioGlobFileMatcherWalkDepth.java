package ru.progwards.java1.lessons.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;

public class NioGlobFileMatcherWalkDepth {
    public static void main(String[] args) throws IOException {
        final Path dir  = Paths.get("C:/Projects/Academy/Java1");
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:*");

        Files.walkFileTree(dir, Collections.emptySet(), 1, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
                if (pathMatcher.matches(dir.relativize(path)))
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
