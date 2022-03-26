package com.company;

import java.util.Arrays;

public class MyArray {
    int length;
    String[] data;

    MyArray() {
        length = 0;
        data = new String[length];
    }

    public static void main(String[] args) {

        MyArray myArray = new MyArray();
        myArray.push("hi");
        myArray.push("you");
        myArray.push("!");
        System.out.println(Arrays.toString(myArray.data));
        myArray.pop();
        System.out.println(Arrays.toString(myArray.data));
//        myArray.deleteAtIndex(0);
        myArray.push("are");
        myArray.push("nice");
//        myArray.shiftItems(0);


        System.out.println(Arrays.deepToString(myArray.data));
    }

    private String pop() {
        String lastItem = data[length - 1];
        data = deleteLast();
        length--;
        return lastItem;
    }

    private String[] deleteLast() {
        String[] newData = new String[length - 1];
        for (int i = 0; i < this.length - 1; i++) {
            newData[i] = data[i];
        }
        return newData;
    }

    private String[] push(String item) {
        length++;
        String[] newData = new String[length];
        for (int i = 0; i < this.length - 1; i++) {
            newData[i] = data[i];
        }
        newData[length - 1] = item;
        data = newData;
        return data;
    }
}