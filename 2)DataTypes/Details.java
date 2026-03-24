import java.lang.*;



class Details
{

	public static void main()
	{
		int x=5;
		System.out.println(Integer.toBinaryString(x));//to see the binary form of the variable
		int y=-5;//negative numbers are stored in 2's complement inside memory
		System.out.println(Integer.toBinaryString(y));//first because it is integer it will be stored in 4 bytes meaning 32 bits
		//and then the 2's complement form appears for -5

		
	}

}