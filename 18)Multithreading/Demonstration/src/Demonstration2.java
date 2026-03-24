public class Demonstration2 extends Thread{
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
    public static void main()
    {
        Demonstration2 t=new Demonstration2();
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+ " World");
            i++;
        }
    }
}
