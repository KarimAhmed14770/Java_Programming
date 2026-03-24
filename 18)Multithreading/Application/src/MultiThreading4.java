/*Continuing after MultiThreading3*/


/*Inter-Thread Communication:
*besides Monitor that is achieved by the Synchronized keyword provided by java
* we want to achieve Inter-Thread communication, this is not something that java is responsible for but
* it is the programmer responsibility to achieve Inter-Thread communication
* what is Inter-Thread or Inter-Process communication?
* we have two threads one produces data and the other consumes data, both threads are running alternatively but
* we want a synchronization between both threads so that if the producer is writing data, the consumer doesn't
* read at the same time, it must wait for the producer to tell it that i have finished writing u can read,
* also when consumer is reading data, the producer shouldn't be able to write,
* so besides monitor that allows only 1 thread in the process, we want synchronization between the two threads
* to handle the order of threads processing
*
* this level of communication is called Inter-thread communication because threads communicate with each other
* to synchronize the whole task.
* this level of communication is not java responsibility it is the developer's responsibility
*
* an example, make 2 threads + a flag in the shared data, the flag will determine turns
* when u command a thread to wait it enters a sleeping state it will not wakeup until it gets notified
*
*
*
*
*

 */

class SharedData{
    boolean flag=true;
    String data;

    synchronized public void writeData(String str)
    {
        while(flag==false)
            try{wait();}catch(Exception e){}
        data="";

            for (int i = 0; i < str.length(); i++) {
                data += str.charAt(i);

            }
            System.out.println("Produced: " + data);

            flag = false;
            notify();

    }
    synchronized public void readData() {
        while (flag==true)
            try {
                wait();
            } catch (Exception e) {
            }
        String str = "";

            for (int i = 0; i < this.data.length(); i++) {
                str += this.data.charAt(i);
            }
            System.out.println("Consumed: " + str);
            flag = true;
            notify();
    }
}

class ProducerThread extends Thread
{
    SharedData data;
    ProducerThread(String name,SharedData d)
    {
        super(name);
        this.data=d;
    }
    @Override
    public void run(){
        for (int i=0;i<1000;i++)
        {
            data.writeData("I am Karim "+i);
        }
    }
}

class ConsumerThread implements Runnable
{
    SharedData data;
    ConsumerThread(SharedData d)
    {
        this.data=d;
    }
    @Override
    public void run(){
        for (int i=0;i<1000;i++)
        {
            data.readData();
        }
    }
}



public class MultiThreading4 {

    public static void main(String[] Args)
    {
        SharedData d=new SharedData();
        ProducerThread producer=new ProducerThread("Producer",d);
        ConsumerThread c=new ConsumerThread(d);
        Thread consumer=new Thread(c,"Consumer");
        producer.start();
        consumer.start();


    }
}
