package QuadraticEquation;

import java.lang.*;
import java.util.*;

/*
 * this program is to find the roots of a quadratic equation ax^2 +bx+c=0, given a,b,c find x1,x2
 * x1=(-b+sqrt(b^2 - 4ac))/2a
 * x2=(-b-sqrt(b^2 - 4ac))/2a
 * */
public class QuadraticEquation {
	
	public static void main(String args[])
	{
		double x1,x2;
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b,c in ax^2+bx+c=0");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		x1=(-b + Math.sqrt((b*b) - (4*a*c)))/ (2*a);
		x2=(-b - Math.sqrt((b*b) - (4*a*c)))/ (2*a);
		
		System.out.println("X1= "+x1 +"   X2= "+x2);
		sc.close();
		
		
		
		
		
	}
}