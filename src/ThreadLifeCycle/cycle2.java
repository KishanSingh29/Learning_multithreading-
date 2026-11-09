package ThreadLifeCycle;

public class cycle2 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Main thread starts");

        Thread t1 = new Thread(() -> {
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}
            System.out.println("Thread -0 starts");
        });

        t1.start();



        t1.join(1000); // let the t1 thread first complete its executionn (within 1 seconde other wise other thread start) then start other thread

        System.out.println("main thread ends");
    }
}




/* 
Thread important Methond
Thread.sleep(millisecond) -> TIMED_WAITING
RUNNABLE -> tIMED_WAITING -> rUNNABLE
*/

/*
main thread -> waiting
t1 thread -> runnable -> terminated
main -> waiting -> runnable -> terminated 
*/

/*

THread.yield() -> i am willing to give my cpu time to someone else with same periority and that wants to run 

1- OS can rejects this because os can handle all of this 
2- it is like a suggestion to the os
3- current thread does not go to waiting, timed_waiting, blocked.
    it does go to only runnable state

*/


/*
Thread --> interrupt flag (default true)

t1.interrupt() --> sends a  singnal to t1 thread that it should stop doint what its doing

we can gracefully hangdle
1- you can make a thread run util a consdition
2- cancelling a long running task 
3- cancellong a long running task
4- sed to stop thread pool


isInterrupted() ->> return interrup flag value (t/f)

interrupted() -> return interrup flag value (t/f) but also set it back to false


isAlive() --> start -> terminate

Thread priority
max pariority = 10
avag = 5
min = 1\

\


daemon threads ==> Background running threads
-> stop immediately once main thread is compleated
threads --> user threads, daemon threads

useages in garbage collection --> deemon threads
*/