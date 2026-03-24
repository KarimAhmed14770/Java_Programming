/*continue on Multithreading2*/


/*Synchronization:
Synchronization is a very important topic when dealing with threads
synchronization is the understanding between two threads
1)Resource sharing:when more than one thread try to access the same resource
2)Critical section: a piece of code that is trying to access a shared object
3)Mutual exclusion:when two threads want to access the same object, they can't access simultaneously
one must access and the other should wait, and they both should coordinate this between them
access of one thread prevents the access of another thread to the same resource, that's why it is called mutual
exclusion

how to achieve this? someone must be responsible for the synchronization between threads allowing only
1 thread to access an object at a time.
1st solution:there is some system that takes care of it like a security guard of ATM-machine.
2nd solution:coordination between threads while the system is still there

1st solution:*locking/mutex
             *Semaphore
             *Monitor

2nd solution:*Race Condition
             *Inter Thread Communication


a)Locking/mutex:we have two threads that wants to access an object so we will make a variable attached
to this object and we will call it (lock/mutex), whichever thread wants to access the object, if the mutex value
is 0 then the object is free, this thread should access the object and lock it by setting the mutex to 1, when
another thread comes it will see that the mutex is 1 so the object is not free so it will not access the object.

what happens in real time?
each thread is running normally taking a slice of cpu time,but the first thread has access to the object so
when it takes its slice of time it can access the object and process it the way it wants, thread2 also takes
its slice of time but it finds that the object is locked, so it doesn't access the object, when thread1 finishes
processing the object he will open the lock, and now thread2 can access it and lock it on its slice of time

this locking or mutex mechanism has one issue: let's assume that thread1 is running it checked that the object is
free, it found that it is free but its slice of time finished before accessing the object and locking its mutex
thread2 ran and found that the mutex is not locked therefore it did access the object, when thread1 runs again, it
will not recheck it will continue from where it stopped so it will also access the object, this means that
both threads are accessing the object at same time,with each 1 thinking he is the only one having access

so locking/mutex is problematic, we need to upgrade it, the upgrade is semaphore.
b)Semaphore:
there must be a system that have two methods, wait() and signal() like a security guard that watches every person
(thread) that tries to access the ATM(shared object),the system really knows if there is someone accessing or not
so it allows only one to access and put the other in a blocked queue, when the one with access finishes, it signals
the next to enter, if one came while the atm is busy, it signals it to wait


c)Monitor:the latest upgrade, java uses Monitor solution for synchronization
Monitor can be achieved using Object-Oriented programming
shared data or a resource is an object, this object carries the data and methods on this data, the whole
mechanism is in the data object
when a thread wants to access the object, it notifies the object, if the object is available it allows the thread
in if it is not it puts the thread in a queue
 */


/*Implementing Monitor in Java using Synchronize and Synchronized*/
class MyData{
    synchronized void display(String str)
    {//the keyword synchronized is the monitor system,it allows only one thread at a time to this method
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    //instead of synchronized keyword for methods we can use synchronize block
    void display2(String str) {
        synchronized(this){
            for(int i=0;i<str.length();i++){
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}
/*the class MyData is an object which will be accessed by multiple threads
* so we need to achieve synchronization between Threads*/
class MyThread3 extends Thread{
    MyData data;//the thread having a reference to the data
    MyThread3(String name,MyData data)
    {
        super(name);
        this.data=data;
    }
    @Override
    public void run()
    {
        data.display("Hello World");
        data.display2("World will end");
    }
}

class MyThread4 extends Thread{
    MyData data;//the thread having a reference to the data
    MyThread4(String name,MyData data)
    {
        super(name);
        this.data=data;
    }
    @Override
    public void run()
    {
        data.display("Kimo is here");
        data.display2("here again");
    }
}
public class MultiThreading3 {
    public static void main(String[] Args)
    {
        MyData d=new MyData();
        MyThread3 t1=new MyThread3("first",d);
        MyThread4 t2=new MyThread4("second",d);
        t1.start();
        t2.start();
    }
}
