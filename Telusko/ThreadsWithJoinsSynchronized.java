//    From Part 89  -- RACE CONDITION
/**
    Synchronized is a keyword used to control access to shared resources among multiple threads.
    It ensures that only one thread can execute
    a synchronized block or method at a time, preventing race conditions and ensuring data consistency

    Join() is a method that allows one thread to wait for the completion of another thread. When a thread
    calls join() on another thread, the calling thread will block until the other thread finishes its execution
**/
/// When multiple threads access the same resource, synchronized ensures that only one thread can access it at a time.
/**
    STORY TO UNDERSTAND     --------------->
   Think: when a person tries to do two withdrawals at the same time — one of ₹7000 from the ATM and
     another of 7000 from mobile banking — but the account only has ₹10,000. If both transactions are
     processed at the same time without control, both might succeed and withdraw a total of ₹14,000,
     which is wrong. This is where synchronized is needed — to lock the account during one transaction,
     so the second one waits, preventing such errors. And join() is used when we want the system
     (like a balance updater) to wait until both transactions are completed before showing
     the final balance or generating a statement.
**/

class Counter extends Thread {
    int count;
    public synchronized void increment() {  // try output without a synchronized keyword.
        count++;          ///   You will see always different output every time. But should be always 2000.
    }
/**
    If you don't use the synchronized keyword, both threads may simultaneously modify the count variable,
    causing a race condition. This could result in incorrect or inconsistent values because both threads
    might read and update the count at the same time, missing updates from each other.

    The story above one is RACE CONDITION's EXAMPLE.
**/
    public void run() {
        for (int i = 0; i < 10000; i++)
            increment();
    }
}

public class ThreadsWithJoinsSynchronized {
    public static void main(String[] args) throws InterruptedException {
        // Two separate counter-objects for two threads
        Counter c = new Counter();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        // Starting both threads
        t1.start();
        t2.start();
        // Wait for both threads to finish
        t1.join();
        t2.join();
        // Print the final count after both threads have finished execution
        System.out.println("Final count: " + c.count);
    }
}



