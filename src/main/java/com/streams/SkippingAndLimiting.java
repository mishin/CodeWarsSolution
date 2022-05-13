package com.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SkippingAndLimiting {
    public static void main(String[] args) {

        IntStream.range(0, 30)
                .skip(10)
                .limit(10)
                .forEach(index -> System.out.print(index + " "));

        Path path = Path.of("/Users/nimishin/IdeaProjects/CodeWarsSolution/src/main/resources/data/first-names.txt");
        try (Stream<String> lines = Files.lines(path)) {
            lines.skip(10).limit(10).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
