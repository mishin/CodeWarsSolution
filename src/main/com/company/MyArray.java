package main.com.company;

import java.util.Arrays;

import static java.lang.System.*;

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
        out.println(Arrays.toString(myArray.data));
        myArray.pop();
        out.println("after pop="+Arrays.toString(myArray.data));
        myArray.deleteAtIndex(0);
        out.println("after delete_index="+Arrays.toString(myArray.data));
        myArray.push("are");
        myArray.push("nice");
        myArray.shiftItems(0);


        out.println(Arrays.deepToString(myArray.data));
    }

    private String deleteAtIndex(int index) {
        out.println("MyArray.deleteAtIndex index="+index);
    String item = data[index];
        out.println("item = " + item);
        shiftItems(index);
        return item;
    }
    private void  shiftItems(int index) {
        for (int i = index; i < length - 1; i++) {
            data[i] = data[i + 1];
        }
        out.println("this.data[this.length - 1] = " + this.data[this.length - 1]);
        deleteLast();
        out.println("length = " + length);
        this.length--;
    }

    private String pop() {
        String lastItem = data[length - 1];
        deleteLast();
        length--;
        return lastItem;
    }

    private void deleteLast() {
        String[] newData = new String[length - 1];
        for (int i = 0; i < this.length - 1; i++) {
            newData[i] = data[i];
        }
        data = newData;
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