/**
 * Created by ayushyadav on 9/23/15.
 */

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class EighteenEx {
    public static void main(String args[]) {
        addThreadsToPool();
    }

    public static void addThreadsToPool() {
        ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
        eventPool.scheduleAtFixedRate(new CheckSysTime(), 0, 2, TimeUnit.SECONDS);
        eventPool.scheduleAtFixedRate(new PerformanceSysCheck("Mail"), 5, 5, TimeUnit.SECONDS);
        eventPool.scheduleAtFixedRate(new PerformanceSysCheck("Calendar"), 10, 10, TimeUnit.SECONDS);
        System.out.println("Number of Threads " + Thread.activeCount());
        Thread[] listOfThreads = new Thread[Thread.activeCount()];
        Thread.enumerate(listOfThreads);
        for (Thread i : listOfThreads) {
            System.out.println(i.getName());
        }
        for (Thread i : listOfThreads) {
            System.out.println(i.getPriority());
        }
        eventPool.shutdown();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
        }
    }
}