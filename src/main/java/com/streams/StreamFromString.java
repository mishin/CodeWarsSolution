package com.streams;

public class StreamFromString {
    public static void main(String[] args) {

        String sentence = "th quick brown fox jumps over the lazy dog";
        sentence.chars()
                .mapToObj(codePoint -> Character.toString(codePoint))
                .filter(letter -> !letter.equals(""))
                .distinct()
                .sorted()
                .forEach(letter -> System.out.print(letter));
        System.out.println();
        String reduce = sentence.chars()
                .mapToObj(codePoint -> Character.toString(codePoint))
                .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
        System.out.println("reduce = " + reduce);
//                .forEach(letter -> System.out.print(letter));

    }
}
