/**
 * Created by ayushyadav on 9/23/15.
 */
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class PerformanceSysCheck implements Runnable {
    String checkWhat;
    ReentrantLock Lock=new ReentrantLock();
    public PerformanceSysCheck(String checkWhat){
        this.checkWhat=checkWhat;
    }

    public void run(){
        Lock.lock();
        System.out.println("Checking "+this.checkWhat);
        Lock.unlock();

    }
}
