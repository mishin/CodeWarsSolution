package main.com.griddynamics;

import java.util.concurrent.TimeUnit;

/*public class StopThread {
    private static boolean stopRequested;
    public static void main(String[] args) throws Exception {
        Thread backgroundThread = new Thread(() -> {
            while (!stopRequested)
                *//* Do something *//* ;
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(5);
        stopRequested = true;
    }
}*/

public class StopThread {
    private static volatile boolean stopRequested;
    private static synchronized void requestStop() {
        stopRequested = true;
    }
    private static synchronized boolean stopRequested() {
        return stopRequested;
    }
    public static void main(String[] args) throws Exception {
        Thread backgroundThread = new Thread(() -> {
            while (!stopRequested())
                /* Do something */ ;
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(5);
        requestStop();
    }
}
