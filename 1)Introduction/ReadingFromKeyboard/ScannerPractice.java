import java.lang.*;
import java.util.*;



class ScannerPractice
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();//you must provide int in the input or it will give runtime error and an exception
		System.out.println(x);
		float y=sc.nextFloat();
		System.out.println(y);
		String word=sc.next();// gets the first word only
		System.out.println(word);
		sc.nextLine(); //this is for clearing the buffer,writing sc.nextline with sc.next in sequence may cause an error
		String UserName=sc.nextLine();//gets the entire line 
		System.out.println(UserName);
		
		sc.useRadix(2); //sets the base of input into binary

		int a=sc.nextInt();//1010 it will read it as binary, store it as decimal
		System.out.println(a);

		

		
	}

}