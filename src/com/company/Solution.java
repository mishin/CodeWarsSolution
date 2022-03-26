package com.company;

class Solution {

    static String toCamelCase(String s) {
        char[] array = s.toCharArray();

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1]=='-'||array[i - 1]=='_') {
                array[i] = Character.toUpperCase(array[i]);
            }
        }

        return new String(array).replaceAll("[-_]","");
    }
}