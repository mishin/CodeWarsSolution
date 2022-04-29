package main.com.griddynamics;

import java.util.*;

class Main {

    public static String LongestWord(String sen) {
        // code goes here
        // Create an char array of given String
        char[] chars = sen.toCharArray();
        int max = 0;
        String stringMaxLen = "";
        for (int i = 0; i < chars.length; i++) {
            // Declare an String with empty initialization
            String s = "";
            // When the character is word or digit
            while (i < chars.length
                    && (Character.isAlphabetic(chars[i])
                    ||
                    Character.isDigit(chars[i]))) {

                // concat with the declared String
                s = s + chars[i];
                i++;
            }
            if (s.length() > max) {
                max = s.length();
                stringMaxLen = s;
            }

        }
        return stringMaxLen;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}