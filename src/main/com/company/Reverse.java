package main.com.company;

public class Reverse {
    public static void main(String[] args) {
        String forReverse = "My name is Nikolay!";
        System.out.println("reverse(" + forReverse + ") = " + reverse(forReverse));
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

}
