package main.com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class CreatingComparators {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine");
        Comparator<String> cmp =
                (s1, s2) -> s1.compareTo(s2);
        strings.sort(cmp);
        System.out.println("strings = " + strings);

        ToIntFunction<String> toLength = s -> s.length();
        Comparator<String> cmp2 = Comparator.comparingInt(toLength);


       /* Comparator<String> cmp2 =
                (s1, s2) -> Integer.compare(s1.length(), s2.length());*/
        strings.sort(cmp2);
        System.out.println("strings = " + strings);
    }
}
