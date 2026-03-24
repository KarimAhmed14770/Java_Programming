import java.lang.*;



class VarDeclaration
{
	public static void main(String[] args)
	{
		byte a=5;
		System.out.println(a);
		a=25;
		System.out.println(a);
		
		//byte b=130;//note max a byte can store is 128, in java this line will give an error,you must store a value in the 
		//range of the datatype ,otherwise java will give you an error
		
		short b=3;
		int x=100;
		Long v=10000l;
		float f=25.45f;
		Double d=34.44d;
		char h='c';
		
		System.out.println(b);
		System.out.println(x);
		System.out.println(v);
		System.out.println(f);
		System.out.println(d);
		System.out.println(h);

		
	}
}