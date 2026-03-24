import java.lang.*;
import java.util.*; //this Util Package contains the Scanner class that is used for reading input


class ReadKeyboard
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);//s is object created from Scanner class, Scanner(System.in) is class constructor
		//and it is initialized by System.in which means that the object s will be used to read from keyboard
		System.out.println("Enter two numbers:");
		int a,b,c; //variable declaration
		a=s.nextInt(); //nextInt is a method in the Scanner class which reads an integer
		b=s.nextInt();
		c=a+b;
		System.out.println("Sum is: "+c);//Sum is: "+c is string concatenation
	}

}