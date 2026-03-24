import MyFirstPackage.Demo;
import MyFirstPackage.Demo2;
import MyFirstPackage.SubPackage.Demo3;





public class Test{
    public static void main(String[] Args)
    {
        Demo d1=new Demo();
	d1.display();
	Demo2 d2=new Demo2();
	d2.display();

	Demo3 d3=new Demo3();
	d3.display();

    }
}