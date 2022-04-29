package main.com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FirstLambdas {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
        strings.removeIf(string -> !string.startsWith("t"));
        strings.forEach(string -> System.out.println(string));
//        System.out.println("strings = " + strings);
        //читает иеромонах Фотий
/*        //Supplier
        Supplier<String> supplier = () ->
        {
            System.out.println("I'am in the Supplier");
            return  "Hello!";
        };
        String string = supplier.get();
        System.out.println("string = " + string);
//Consumer
        Consumer<String> consumer = (String s) ->
        {
            System.out.println("I'am in the Consumer");
            System.out.println("s = " + s);
        }
                ;
        consumer.accept("Hi guys!");

        Runnable alert=()-> System.out.println("Groot " );
        alert.run();*/
    }
}
