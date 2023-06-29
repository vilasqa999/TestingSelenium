package Java_Programs;

public class Palindromeno {

	public static void main(String[] args) 
	{
	
		//palidrome mean --  12341 
		
		//343
		
		int num= 16461;
		int rev=0;
		
		int temp=num;
		while(num!=0)
		{
			 rev=rev*10 + num%10;
			 num=num/10;
		}
		
		System.out.println("No is"+ rev);
		
		if(temp==rev)
		{
			System.out.println("No is palindrome");
		}
		//else
			
		
		
	}

}
