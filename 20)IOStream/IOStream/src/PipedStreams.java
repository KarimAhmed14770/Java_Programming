
/*file6*/

/*in this file we create two threads, with pipes and they will communicate over the pipes*/
import java.io.OutputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;


class Producer extends Thread{
    OutputStream os;
    Producer(OutputStream os){
        this.os=os;
    }
    public void run(){
        int count=1;
        while(true) {
            try {
                os.write(count);
                os.flush();
                System.out.println("Producer: "+count);
                System.out.flush();
                count++;
                Thread.sleep(10);//so that it sleeps for a while after it writes so that consumer reads
            }catch (Exception e){}
        }
    }
}


class Consumer extends Thread{
    InputStream is;
    Consumer(InputStream is){
        this.is=is;
    }
    public void run(){
        int x;
        while(true) {
            try {
                x=is.read();
                System.out.println("Consumer: "+x);
                System.out.flush();
                Thread.sleep(10);//so that it sleeps for a while after it reads so that producer writes
            }catch (Exception e){}
        }
    }
}


public class PipedStreams {
    public static void main(String[] args)throws Exception{
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();
        pis.connect(pos);//now the two pipes are connected, whatever is written to pos is input to pis

        Producer p=new Producer(pos);
        Consumer c=new Consumer(pis);
        p.start();
        c.start();
    }
}
