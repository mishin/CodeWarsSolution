package main.com.griddynamics.stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

 /*       List list = new ArrayList<>();

        list.add ("молоко") ;

        list.add ("хлеб");

        list.add ("колбаса");

        Stream stream = list.stream();

        list.add ("яйца, яйца ещё!");

        stream.forEach (System.out::println);*/

/*
        List list = new ArrayList<>(Arrays.asList("A", "B", "C"));

        list.stream().forEach (x -> {

            if (x.equals("B")) {

                list.remove(x);

            }

        });
*/

      /*  Set leaders = new HashSet<>(Arrays.asList("Сталин", "Ленин", "Че Гевара"));

        System.out.println("Leaders = " + leaders);*/
/*        IntStream.iterate(1, x -> x + 1)
                .sorted()
                .limit(5)
                .forEach(System.out::println);*/
 /*       List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        System.out.println( " list="+list);
        list.forEach(System.out::println);

        Queue<String> namesQueue = new ArrayDeque<>(Arrays.asList("Larry", "Steve", "James"));

        namesQueue.forEach(System.out::println);*/
  /*  x -> {
            if (x != null) {
                System.out.println("x = " + x+ " list="+list); // do something...
            }
        });*/
/*        list.stream()
                .peek(x -> {
                    if (x == null) {
                        System.out.println("x = " + x+ " list="+list); // do something...
                    }
                })
                .forEach(x -> {
            if (x.equals("A")) {
                list.remove(x);
            }
        });*/

/*        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            itemList.add(new Item(i));
        }*/
    }


}
