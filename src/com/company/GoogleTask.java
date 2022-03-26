package com.company;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
//https://www.onlinetutorialspoint.com/java8/java-8-how-to-get-common-elements-from-two-lists.html

import static org.junit.Assert.assertEquals;

public class GoogleTask {

    static boolean isArrayHasCommonValues(char[] array1, char[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isArrayHasCommonValuesImprove(char[] array1, char[] array2) {
        for (char c : array1) {
            for (char value : array2) {
                if (c == value) {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean isArrayHasCommonValuesImprove2(char[] array1, char[] array2) {
        for (char c : array1)
            for (char value : array2)
                if (c == value) {
                    return true;
                }
        return false;
    }

    static boolean isArrayHasCommonValuesImprove3(char[] array1, char[] array2) {
        for (char c : array1)
            for (char value : array2)
                if (c == value) return true;
        return false;
    }

    static boolean isArrayHasCommonValuesImprove4(char[] array1, char[] array2) {
        for (char c : array1)
            for (char value : array2)
                if (c == value) return true;
        return false;
    }

    public static boolean containCommonElements(char[] arr1,
                                          char[] arr2)
    {
        // create hashsets
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        // Adding elements from array1
        for (char i : arr1) {
            set1.add(i);
        }

        // Adding elements from array2
        for (char i : arr2) {
            set2.add(i);
        }

        // use retainAll() method to
        // find common elements
        System.out.println("Common elements- " + set1);
        set1.retainAll(set2);
        if(set1.isEmpty()) return false;
        return true;
    }

    static boolean isArrayHasCommonValuesImprove5(char[] array1, char[] array2) {
        for (char c : array1)
            for (char value : array2)
                if (c == value) return true;
        return false;
    }

    static boolean isArrayHasCommonValues2(char[] array1, char[] array2) {
        HashSet<Character> arr1HashSet = new HashSet<Character>();
        for (int i = 0; i < array1.length; i++) {
            arr1HashSet.add(array1[i]);
        }

        for (int j = 0; j < array2.length; j++) {
            if (arr1HashSet.contains(array2[j])) {
                return true;
            }
        }
        return false;
    }
    static boolean isArrayHasCommonValues2Improve(char[] array1, char[] array2) {
        HashSet<Character> arr1HashSet = new HashSet<Character>();

        for (char c : array1) {
            arr1HashSet.add(c);
        }

        for (char c : array2) {
            if (arr1HashSet.contains(c)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[] array1 = {'a', 'b', 'c', 'x'};
        char[] array2 = {'x', 'y', 'i'};
        System.out.println("isArrayHasCommonValues(array1, array2) = " + isArrayHasCommonValues(array1, array2));
    }

    @Test
    public void isArrayHasCommonValuesTest() {
        char[] array1 = {'a', 'b', 'c', 'x'};
        char[] array2 = {'z', 'y', 'i'};
        System.out.println("isArrayHasCommonValues(array1, array2) = " + isArrayHasCommonValues(array1, array2));
        assertEquals(false, isArrayHasCommonValues(array1, array2));
    }

    @Test
    public void isArrayHasCommonValuesTestTrue() {
        char[] array1 = {'a', 'b', 'c', 'x'};
        char[] array2 = {'x', 'y', 'i'};
        System.out.println("isArrayHasCommonValues2(array1, array2) = " + isArrayHasCommonValues2(array1, array2));
        assertEquals(true, isArrayHasCommonValues2(array1, array2));
    }

    @Test
    public void iscontainCommonElementsTrue() {
        char[] array1 = {'a', 'b', 'c', 'x'};
        char[] array2 = {'z', 'y', 'i'};
        System.out.println("containCommonElements(array1, array2) = " + containCommonElements(array1, array2));
        assertEquals(true, containCommonElements(array1, array2));
    }
}