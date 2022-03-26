package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> array= new ArrayList<>();
        array.add("nemo");
        findNemo(array);
    }

    private static void findNemo(List<String> array)
    {
        for(int i =0 ; i< array.size(); i++){
            if(array.get(i)=="nemo"){
                System.out.println("Found NEMO");
            }
        }
    }
/*    public static void main(String[] args) {
	// write your code here
        byte x = 12;
        byte y = 13;
        byte result = (byte) (x+y);
        System.out.println("result = " + result);
    }*/
}
