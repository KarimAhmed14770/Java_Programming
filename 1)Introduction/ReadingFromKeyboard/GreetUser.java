import java.lang.*;
import java.util.*;


class GreetUser
{

	public static void main(String[] args)
	{
		String Name;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		Name=s.nextLine();
		System.out.println("Hello, "+Name);
		
	}

}