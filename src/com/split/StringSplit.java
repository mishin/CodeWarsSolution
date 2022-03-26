package com.split;

public class StringSplit {
    public static String[] solution(String s) {
        if (s.length() % 2 != 0)
            s+="_";
        return s.split("(?<=.)(?=(.{2})+(?!.))");
        //Write your code here
    }
}
