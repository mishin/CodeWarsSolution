package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sum {
    public int GetSum(int a, int b)
    {
        List<Integer> seqOrder= new ArrayList<>();
        seqOrder.add(a);
        seqOrder.add(b);
        Collections.sort(seqOrder);
        List<Integer> sequence= new ArrayList<>();
        for (int i = seqOrder.get(0); i <= seqOrder.get(1); i++) {
            sequence.add(i);
        }
        Integer sum = sequence.stream().reduce(0, Integer::sum);
        //Good luck!
        System.out.println();
        return sum;
    }
}
