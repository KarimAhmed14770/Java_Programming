package CalculateArea;
import java.lang.*;
import java.util.*;

public class CalculateArea {

	static public void	main(String[] args)
	{	
		float base,height;
		double Area;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Base: ");
		base=s.nextFloat();
		System.out.println();
		System.out.print("Enter Height: ");
		height=s.nextFloat();
		System.out.println();
		
		Area=0.5f*base*height;
		System.out.println("Area: "+Area);
		
		
		/*another formula of triangle 
		 * area=sqrt(s(s-a)(s-b)(s-c))
		 * s=0.5(a+b+c)*/
		
		float a,b,c,x;
		System.out.print("Enter the length of the three sides: ");
		a=s.nextFloat();
		b=s.nextFloat();
		c=s.nextFloat();
		x=0.5f*(a+b+c);
		Area=Math.sqrt((x*(x-a)*(x-b)*(x-c)));//sqrt returns double
		System.out.println("Area: "+Area);
		
		s.close();//if you never closed s you will have a resource leak
		/*
		 * A resource leak is like leaving a faucet running, a file open, or a database connection alive 
		 * when you're done with it. In programming, it means you acquired a system resource but never
		 * released it back to the system.
		 */
		
		
	}
}
