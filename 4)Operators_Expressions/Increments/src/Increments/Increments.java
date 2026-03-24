package Increments;

import java.lang.*;
import java.util.*;

public class Increments {

	static public void main(String[] args)
	{
		int x=5,y;
		
		y=x++;//use the value of x then increment x
		System.out.println("y= "+y+"  X= "+x);
		System.out.println("y++= "+(y++));//the value of y is passed to the function and then y increments
		System.out.println("y= "+y);
		x=5;
		int z=2*x++ + 3*++x; // 2*5 + 3*7
		System.out.println("z= "+z);
		
	}
}
