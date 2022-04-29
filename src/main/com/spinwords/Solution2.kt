package main.com.spinwords

import java.util.stream.Collectors

fun spinWords(sentence: String): String {
    // Your code goes here!
    return sentence
        .split(" ")
        .stream()
        .map { l -> if (l.length >= 5) l.reversed() else l }
        .collect(Collectors.joining(" "))
}