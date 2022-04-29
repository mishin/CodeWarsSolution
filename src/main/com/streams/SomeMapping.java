package main.com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.paumard.streams.StreamsUtils.cycle;
import static org.paumard.streams.StreamsUtils.zip;

public class SomeMapping {
    public static void main(String[] args) {
        User sarah = new User("Sarah", 28);
        User james = new User("James", 35);
        User mary = new User("Mary", 33);
        User john = new User("John", 24);
        List<User> users = Arrays.asList(sarah, james, mary, john);
        List<String> names = new ArrayList<>();
        Function<User, String> toName = (User user) -> user.getName();
        for (User user : users) {
            String name = toName.apply(user);
            names.add(name);
        }
        users.forEach(user -> System.out.println("user = " + user));
        Consumer<String> action = name -> System.out.println("name = " + name);
        names.forEach(action);

        Stream<String> fizzBuzz =
                zip(
                        IntStream.range(0, 101).boxed(),
                        zip(
                                cycle(Stream.of("fizz", "", "")),
                                cycle(Stream.of("buzz", "", "", "", "")),
                                String::concat
                        ),
                        (i, string) -> string.isEmpty() ? i.toString() : string
                );
        fizzBuzz.skip(1).forEach(System.out::println);
    }
}
