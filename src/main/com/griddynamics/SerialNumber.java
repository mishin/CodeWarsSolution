package main.com.griddynamics;

import java.util.concurrent.atomic.AtomicLong;

public class SerialNumber {
    private static final AtomicLong nextSerialNumber = new AtomicLong();
//    private static long nextSerialNumber = 0;
    public static long generateSerialNumber() {
        return  nextSerialNumber.getAndIncrement();
    }
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1_000_000; j++)
                    generateSerialNumber();
            });
            threads[i].start();
        }
        for(Thread thread : threads)
            thread.join();
        System.out.println(generateSerialNumber());
    }
}
