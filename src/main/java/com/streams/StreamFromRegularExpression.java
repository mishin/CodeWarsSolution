package com.streams;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamFromRegularExpression {
    public static void main(String[] args) {
        String sentence = "th quick brown fox jumps over the lazy dog";
        String[] words = sentence.split(" ");
        Stream<String> streamWords = Arrays.stream(words);
        long count = streamWords.count();
        System.out.println("count = " + count);

        Pattern pattern = Pattern.compile(" ");
        Stream<String> stringStream = pattern.splitAsStream(sentence);
        long count1 = stringStream.count();
        System.out.println("count1 = " + count1);
        //сын Елены Анатольевны
    }
}
