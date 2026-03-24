import java.lang.*;



class Literals
{
	public static void main(String[] args)
	{
		byte a=15;//15 is integer literal
		short b=15;
		int c=15;
		
		byte b1=10;//decimal representation of 10
		byte b2=0b1010;//binary representation of 10
		byte b3=012;//octal representation of 10
		byte b4=0xA;//hexa representation of 10
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		long l=125;
		long x=125l;
		//long as=99999999999999;//this will cause error because it is seen as integer literal but the literal crosses the integer 		//range
		long ad=99999999999999l; //to solve this put l to say that it is long
		//int x=125l;//this will cause error because we can't store a long inside an integer,can't store the large
		//datatype in the small one

		//float f=12.56;//this will cause error because you are storing double(big datatype) into float(smaller datatype)
		float f =12.56f;
		double d=12.56;
		long big=999_999_999l;//_ can be used between numbers for readability but can't be put after the last digit
		float deci=123_456.666_12f;//it can be used with floats also but not before or after the floating point
	
		
	}
}