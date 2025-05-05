/*
    Threads - used for multitasking or in other words if I want to execute multiple
    blocks of code run at the same time (simultaneously).

    Threads allows a program to operate more efficiently by doing multiple things at the same time
    a thread is a lightweight process that allows a program to perform multiple tasks concurrently.
    A program is divided into multiple smaller tasks as threads. To run it concurrently and parallel.
    To execute or get a result parallel.
*/

///     To do that in java we need to Extend Thread in the classes. And call the method using "start()" keyword & the
///  method inside class should be of "run" name only.


class Hii_print extends Thread {       ///     extends Thread
    public void run() {               ///      method name should be run only
        for(int i=1; i<100; i++) {
            System.out.println("Hii " + i);
            try {
                Thread.sleep(10);       // this might throw error. so to handel we use try and catch
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Hello_print extends Thread {      ///     extends Thread
    public void run() {                ///      method name should be run only
        for(int i=1; i<100; i++) {
            System.out.println("Hello " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Threads_and_all {
    public static void main(String[] args) {
        Hii_print obj1   = new Hii_print();
        Hello_print obj2 = new Hello_print();
        // won't call this - like this. obj1.run();  obj2.run(); -  it wont work.
       /// we must call it using start() method name.
//        obj1.start();
//        obj2.start();    // now you can see the output is mixed among themselves - means both running at the same time.

//        But if we want to run it like one print from hi and then hello. we need to use some "sleep" or "priority".
        // some Priority No.scale(1 to 10) details - By Default Priority is set 5. If max you want to set Highest is 10.
        // If the Lowest you want, then ypu can set is 1.
//        obj2.setPriority(10);   // now obj2 will be executed at the very first. You can check output.
/*      obj1.start();
        obj2.start();
*/
//        we can add try and catch here too
        obj1.start();
        try {
            Thread.sleep(2);   //   here all the values will be in milliseconds
        } catch (InterruptedException e) { throw new RuntimeException(e); }
        
        obj2.start();


    }
}
