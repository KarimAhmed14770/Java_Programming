public class Demonstration3 implements Runnable{
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
    public static void main(String[] Args)
    {
        Demonstration3 in=new Demonstration3();
        Thread t=new Thread(in);
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+ " World");
            i++;
        }
    }
}
