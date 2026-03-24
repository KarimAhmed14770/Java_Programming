/*the first file for explaining multithreading
*there was a concept called Multiprogramming which was divided into two aspects:
* 1)Multi-users: Multiple users using 1 computer for running multiple programs
* 2)Multitasking or Multithreading:1 user uses 1 computer for multitasks at a time
*
* the thing is if you use ur computer for 1 hour, the processor will work only around 5 minutes
* because tour processor is very fast,so it sleeps and wake up when work is needed
*
* Cpu can only perform 1 task at a time, but because it is too fast the user feels that all the
* tasks are running simultaneously
*
* example when you are opening chrome,excel, and ide they are all loaded on the main memory(RAM)
* u can vie it on the task manager, the cpu can only process 1 task at a time , but they
* are all loaded in memory and the cpu is very fast so the user thinks they are all running
* Simultaneously
* when several Programs are running on the same CPU it is called Multitasking
*
* but what is Multithreading
* take chrome as an example: u open chrome browser and open youtube, there is video playing,
* comments section,ads,messaging and all these are happening independently , this is called
* Multithreading, when a Single program performs different tasks independently and
* Simultaneously, each task is called a thread and this is a multithreaded program
*
* so Multithreading basically means that a single program runs Multi tasks independently and
* simultaneously
* remember again:CPU can only handle one task at a time but because of its high speed it is
* felt to the user that all tasks are running simultaneously
* in Multithreading each thread takes a portion of cpu time a slice of time, and the cpu
* processes the threads alternatively,the user is feeling it is simultaneously
*
* examples of Multithreading:
* 1)Ball bouncing Animation:
* you have 3 balls bouncing on a wall animation, each ball is independent of the other
* so each ball can be treated as a thread and this thread is responsible for the ball movement
* and animation ,each thread takes a slice of cpu time, because cpu processes
* each ball in very fast time, micro or nanoseconds or even faster therefore the user feels
* that the balls are all moving at the same time
*
* 2)car racing game online:
* on a server there is a game where each player is considered a user,each user has is
* considered as a thread that control its car and view the track and other cars,the server
* transfers the information and integrate the player together, and each thread is responsible
* for the user input and user experience
*
* 3)Websites like facebook:
* facebook has like millions of visitors on hourly rate,each user has a thread that is
* responsible for what appears,and the user experience....etc
* 1 user not having a single thread but multi, comments,videos,sharing,posting ,reacting
* going live ....etc all these are independent tasks that the user views as simultaneous ones
*
*
* program flow before multithreading:
* a main function that processes functions line after another till the program ends
*
* multithreading:
* the program has multiple threads, each thread takes a portion of cpu time to be processed
* the cpu process the threads alternatively and very fast, so that the user feels that everything
* is running simultaneously
*
*
* how to achieve Multithreading in Java?
* java provides Multithreading by two ways
* 1)using the Thread class:when you extend the Thread class and override the method run, u have created a thread
* 2)using the runnable interface:when u implement Runnable and define run method, then make a reference of
* Thread class that refers to a runnable object then u made a thread
* Runnable is provided because a class can only extend one class but can implement multiple interfaces
 */


/*example, we want to create two threads that run together each one is an infinite loop, each one will take
* portion of cpu and the cpu will alternate between them
*
* note:Main is the starting point of a program, Run is the starting point of a thread
*we can't know which thread takes more time of cpu, or how much time does the cpu gives for each thread
* we only know that the cpu will process all the threads alternatively and very fast
*
* FirstThread f=new FirstThread();//FirstThread is a class that extends Thread class
        SecondThread m=new SecondThread(); //SecondThread is a class that implements Runnable
        Thread t=new Thread(m);
        f.start(); .start() starts the thread and calls the run function of the thread
        t.start();
* */



class FirstThread extends Thread{
    @Override
    public void run()
    {
        int i=0;
        while (true)
        {
            System.out.println("Hello "+i+".");
            i++;
        }
    }
}

class SecondThread implements Runnable{

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
public class MultiThreading1 {
    public static void main(String[] Args)
    {
        FirstThread f=new FirstThread();
        SecondThread m=new SecondThread();
        Thread t=new Thread(m);
        f.start();
        t.start();
    }
}
