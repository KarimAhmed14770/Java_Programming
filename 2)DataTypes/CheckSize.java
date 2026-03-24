import java.lang.*;




class CheckSize
{

	public static void main(String[] args)
	{
		//to know the members of a class use javap java.package_name.class_name in cmd all members will show
		//example: javap java.lang.Integer will give you all members(properties and methods ) in Integer class

		//available classes:Byte,Short,Integer,Long,Float,Double,Character,Boolean (a class wraps each primitive datatype) 
		int x; //int is a primitive datatype in the compiler, but java made everything object oriented
		Integer y;//Integer is a class that makes an Integer object,it is a class wrapped around the int datatype
		System.out.println("Integer Size(bytes): "+Integer.BYTES);
		System.out.println("Integer Size(bits): "+Integer.SIZE);
		System.out.println("Integer Min_Value: "+Integer.MIN_VALUE);
		System.out.println("Integer Max_Value: "+Integer.MAX_VALUE);

		System.out.println("Byte Size(bytes): "+Byte.BYTES);
		System.out.println("Byte Size(bits): "+Byte.SIZE);
		System.out.println("Byte Min_Value: "+Byte.MIN_VALUE);
		System.out.println("Byte Max_Value: "+Byte.MAX_VALUE);
		
		System.out.println("Float Size(bytes): "+Float.BYTES);
		System.out.println("Float Size(bits): "+Float.SIZE);
		System.out.println("Float Min_Value: "+Float.MIN_VALUE);
		System.out.println("Float Max_Value: "+Float.MAX_VALUE);

		

	}




}