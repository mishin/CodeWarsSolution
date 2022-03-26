package com.split;

public class BitCounting {

    public static int countBits(int n){
        // Show me the code!
        return (int) Integer.toBinaryString(n).chars().filter(ch -> ch == '1').count();
    }

}