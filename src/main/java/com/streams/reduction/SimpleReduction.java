package com.streams.reduction;

import java.util.List;
import java.util.Optional;

public class SimpleReduction {
    public static void main(String[] args) {

        List<Integer> ints = List.of(1,1,1,1);

//        Optional<Integer> reduce = ints.stream().reduce((i1, i2) -> i1 + i2);


        Integer sum = ints.stream().reduce(0, (i1, i2) -> i1 + i2);
        System.out.println("sum = " + sum);


/*        System.out.println("reduce = " + reduce);
//        reduce.get();
        Integer sum = reduce.orElseThrow();*/

//        int sum = ints.stream().reduce((i1, i2) -> i1 + i2);

//        System.out.println("sum = " + sum);
    }
}
