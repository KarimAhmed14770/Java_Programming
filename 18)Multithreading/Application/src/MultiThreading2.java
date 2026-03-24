/*Continuing on MultiThreading1*/

/*States of a thread: a thread might be in different states
* new Thread:when u only created a thread object but didn't start it
* ready Thread:when u call the .start() method to start the thread
*running:when the .start() method calls the .run() method of the thread
* while the thread is running it may face 3 states:
* a)waiting:it could be waiting for some resource, or another thread forced it for waiting
* b)timed waiting:it is waiting for a specific time
* c)Blocked:it is blocked from a certain resource it is trying to reach
* terminated:when the thread is finished and closed
*
*
*
* Assume you have 2 threads that want to access the same resource, both can't access the same resource at the
* same time,1 must use the resource and the other must wait for him,when the thread that is using the resource
* finished it must notify the waiting Thread, this is the process of Synchronization
* as thread uses a resource and locks it, any other thread trying to access the resource find that it is locked
* so it is waiting for a notify signal
*
*
* Thread Priorities:java has 10 levels of Priorities for threads from 1 to 10
* what is priority in java: higher priority threads take more cpu time than lower priority threads
*
* Assume that u have 5 threads that exist in a ready queue, JVM scheduler is the one responsible for the
* ready queue, and which thread is taking cpu time first, if the 5 threads are having same priority
* JVM scheduler will just pass them to the cpu one after another for a close potion of time between each other
* this is called time-sharing and all threads are sharing equal amount of cpu time.
*
* what if there are priority differences between the threads, it is then logically that they don't all take the
* same portion of cpu time:
* a)either the higher priority thread takes a higher portion of cpu time
* b)or the higher priority thread gets executed totally before executing the lowe priority thread
*
* Min-priority level in java is 1 , default is 5, max is 10
* assume you are working on microsoft-word, there are multiple threads working at a time,
* a thread takes the input from the keyboard, a thread displays the input on the screen, a thread for autosaving
* of-course the input thread and displaying thread must have higher priorities than the auto saving thread
*
* Note:each thread is given a unique id by java, two threads can't have the same id ever.
*
* the Thread class:
*
 */

class MyThread extends Thread{
    //to pass a name to the thread on constructing
    MyThread(String name){
        super(name);
    }
    @Override
    public void run()
    {
        int i=0;
        while (true)
        {
            System.out.println("Hello "+i+".");
            try{Thread.sleep(1000);}
            catch (Exception e){System.out.println(e);}
            i++;
        }
    }
}

class MyThread2 implements Runnable{
    public void run()
    {
        int i=0;
        while (true)
        {
            System.out.println("World "+i+".");
            i++;
        }
    }
}
public class MultiThreading2 {
    public static void main(String[] Args)
    {
        /*The Thread class*/
        /*Constructors:the first thing to know about a class is its constructors*/
        Thread t1=new Thread();//default constructor
        Thread t2=new Thread("thread_name");//constructor that takes a name
        System.out.println(t1);
        System.out.println(t2);
        MyThread2 m=new MyThread2();
        Thread t3=new Thread(m,"TakesRunnable");//a thread that takes a runnable reference and use it
        // for creating a thread, also having a name
        System.out.println(t3);
        System.out.println("t1 id: "+t1.threadId());
        System.out.println("t2 name:"+t2.getName());

        //t2.  use this to see all methods that can work on a thread object
        //Thread.  use this to see all static methods and members of Thread class
        MyThread thread=new MyThread("KarimThread");
        System.out.println(thread);
        thread.start();


    }
}
