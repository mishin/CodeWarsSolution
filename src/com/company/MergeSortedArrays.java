package com.company;

import java.util.Arrays;

import static java.lang.System.out;

public class MergeSortedArrays {
    public static void main(String[] args) {

        int[] array1 = new int[]{0, 3, 4, 31};
        int[] array2 = new int[]{3, 4, 6, 30};
//        int[] rez = mergeSortedArrays(array1, array2);
        int[] rez = merge(array1, array2);
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
            Integer unmerged1 = (index1 < array1.length) ? array1[index1]:null;
            Integer unmerged2 = (index2 < array2.length) ? array2[index2]:null;

            if (unmerged2==null || unmerged1 < unmerged2) {
                mergedArray[current] = unmerged1;
                index1++;
            } else {
                mergedArray[current] = unmerged2;
                index2++;
            }
            current++;
        }
        return mergedArray;
    }

    public static int[] merge(int[] array1, int[] array2) {

        int array1Length = array1.length;
        int array2Length = array2.length;

        int[] merged = new int[array1Length + array2Length];

        int array1Position, array2Position, mergedPosition;
        array1Position = array2Position = mergedPosition = 0;

        while(array1Position < array1Length && array2Position < array2Length) {
            if (array1[array1Position] < array2[array2Position]) {
                merged[mergedPosition++] = array1[array1Position++];
            } else {
                merged[mergedPosition++] = array2[array2Position++];
            }
        }

        while (array1Position < array1Length) {
            merged[mergedPosition++] = array1[array1Position++];
        }

        while (array2Position < array2Length) {
            merged[mergedPosition++] = array2[array2Position++];
        }

        return merged;
    }

//console.log(mergeSortedArrays(array1,array2));

//mergeSortedArrays([0,3,4,31], [3,4,6,30]);

}
