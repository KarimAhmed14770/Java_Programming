

/*example 1 extending(inheriting) Thread class*/
class MyThread extends Thread{
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


public class Demonstration {

    public static void main(String[] Args)
    {
        MyThread t=new MyThread();
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
