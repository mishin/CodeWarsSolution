package main.com.griddynamics.stream;

public class Item {
    private int value;
    // constructors

    public Item(int value) {
        this.value = value;
    }

    public boolean isQualified() {
        return value % 2 == 0;
    }

    public void operate() {
        System.out.println("Even Number");
    }
}