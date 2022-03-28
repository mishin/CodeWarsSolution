package com.company;

import java.util.Arrays;

import static java.lang.System.out;

public class MergeSortedArrays {
    public static void main(String[] args) {

        int[] array1 = new int[]{0, 3, 4, 31};
        int[] array2 = new int[]{3, 4, 6, 30};
        int[] rez = mergeSortedArrays(array1, array2);
        out.println(Arrays.toString(rez));
//        System.out.println("reverse(" + forReverse + ") = " + reverse(forReverse));
    }

    static String reverse(String str) {
        if (str == null || str.length() < 2) {
            return "hmm that is not good";
        }
        String[] arrayChar = str.split("");
        char[] chars = str.toCharArray();
        String reversedString = "";
        System.out.println("revercedString = " + reversedString);
        System.out.println("arrayChar.length = " + arrayChar.length);
        System.out.println("arrayChar[arrayChar.length-1] = " + arrayChar[arrayChar.length - 1]);
        for (int i = chars.length - 1; i >= 0; i--) {
            reversedString = reversedString + arrayChar[i];
            System.out.println("reversedString = " + reversedString);
        }
        return reversedString;
    }


    static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int index1 = 0;
        int index2 = 0;
        int current = 0;

        while (current < (array1.length + array2.length)) {
//            max = (a > b) ? a : b;
//            if (index1 > array1.length)
            Integer unmerged1 = (index1 < array1.length) ? array1[index1]:null;
            Integer unmerged2 = (index2 < array2.length) ? array2[index2]:null;

            if (unmerged2==null || unmerged1 < unmerged2) {
//                console.log("if1 unmerged1="+unmerged1 + " index1="+index1 + " current="+current);
                mergedArray[current] = unmerged1;
                index1++;

                // if next comes from arr2
            } else {
//                console.log("if2 unmerged2="+unmerged2 + " index2="+index2 + " current="+current);
                mergedArray[current] = unmerged2;
                index2++;
            }

            current++;
        }
        return mergedArray;
    }

//console.log(mergeSortedArrays(array1,array2));

//mergeSortedArrays([0,3,4,31], [3,4,6,30]);

}
