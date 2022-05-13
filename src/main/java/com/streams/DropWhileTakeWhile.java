package com.streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public class DropWhileTakeWhile {
    public static void main(String[] args) {

        Class<?> clzz = CopyOnWriteArrayList.class;
        clzz.getSuperclass();

//        Stream<Class<?>> classes =
        Stream.<Class<?>>iterate(clzz, c -> c.getSuperclass())
                .takeWhile(c -> c!=null)
                .forEach(System.out::println);

    }
}
