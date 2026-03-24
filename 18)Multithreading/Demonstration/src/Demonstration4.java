
class MyRun implements Runnable{
    @Override
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+ " Hello");
            i++;
        }
    }
}

public class Demonstration4 {
    public static void main(String[] Args)
    {
        MyRun m=new MyRun();
        Thread t=new Thread(m);
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+ " World");
            i++;
        }
    }
}
