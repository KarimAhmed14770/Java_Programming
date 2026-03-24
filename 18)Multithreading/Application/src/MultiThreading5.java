/*The last practice on MultiThreading*/
/*I will make 1 producer and 3 consumers that should act as follows,when a producer produce
* consumer1 consumes then consumer2 then consumer3*/


class MyData2 {
    String data;
    byte turn = 0;
    static int write_count = 0;

    synchronized void writeData(String str) {
        while (turn != 0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
            write_count++;
            data = str;
            System.out.println("Produced: " + data + "(" + write_count + ")");
            turn = 1;
            notifyAll();

    }


        synchronized void readData(int threadId)
        {
            String readData;
            while (turn != threadId) {
                try {
                    wait();
                } catch (Exception e) {}
            }
            if(turn==1) {
                readData=this.data;
                System.out.println("current thread: "+Thread.currentThread()+data+"(" + write_count + ")");
                turn=2;
                notifyAll();
            }
            else if(turn==2) {
                readData=this.data;
                System.out.println("current thread: "+Thread.currentThread()+data+"(" + write_count + ")");
                turn=3;
                notifyAll();
            }
            else if(turn==3) {
                readData=this.data;
                System.out.println("current thread: "+Thread.currentThread()+data+"(" + write_count + ")");
                turn=0;
                notifyAll();
            }


        }

}
class ProducerThread1 extends Thread {
    MyData2 d;

    ProducerThread1(String name, MyData2 d) {
        super(name);
        this.d = d;
    }

    @Override
    public void run() {
        while (true) {
            d.writeData("Karim ");
        }
    }
}
class ConsumerThread1 extends Thread{
    MyData2 d;
    int thread_id;
    ConsumerThread1(String name,int thread_id,MyData2 d)
    {
        super(name);
        this.thread_id=thread_id;
        this.d=d;
    }
    @Override
    public void run(){
        while (true){
            d.readData(this.thread_id);
        }
    }

    }

class ConsumerThread2 extends Thread{
    MyData2 d;
    int threadId;
    ConsumerThread2(String name,int thread_id,MyData2 d)
    {
        super(name);
        this.threadId=thread_id;
        this.d=d;
    }
    @Override
    public void run(){
        while (true){
            d.readData(this.threadId);
        }
    }
}
class ConsumerThread3 extends Thread{
    MyData2 d;
    int threadId;
    ConsumerThread3(String name,int thread_id,MyData2 d)
    {
        super(name);
        this.threadId=thread_id;
        this.d=d;
    }
    @Override
    public void run(){
        while (true){
            d.readData(this.threadId);
        }
    }
}

public class MultiThreading5 {
    public static void main(String[] Args)
    {
        MyData2 d=new MyData2();
        ProducerThread1 p=new ProducerThread1("Producer3",d);
        ConsumerThread1 c1=new ConsumerThread1("Consumer1",1,d);
        ConsumerThread2 c2=new ConsumerThread2("Consumer2",2,d);
        ConsumerThread3 c3=new ConsumerThread3("Consumer3",3,d);
        p.start();
        c1.start();
        c2.start();
        c3.start();

    }

}


