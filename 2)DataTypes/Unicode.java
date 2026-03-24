import java.lang.*;



class UniCode
{

	public static void main()
	{
		
		char phi=0x03A6;
		System.out.println(phi);
		//the next code will type all greek letters  ranging from  0370–03FF
		char letter=0x370;
		while(letter!=0x3ff)
		{
			System.out.print(letter+" ");
			letter++;	
		}	

	}

}