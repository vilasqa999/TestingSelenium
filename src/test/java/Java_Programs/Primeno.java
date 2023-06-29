package Java_Programs;

public class Primeno 
{

	public static void main(String[] args) 
	{

     // two factor 1 and itself
		
		
		int num=100;
		int count=0;
		
		if(num>1)
		{
			for (int i=1;i<=num;i++)
			{
				if(num%i==0)
				
					count++;
			}	
				
				if(count==2) 
				{
				   System.out.println("No is prime");	
				}
				
				else
				{
					 System.out.println("No is not prime");	
				}
			
		}
		else
		{
			System.out.println("No is not prime");	
		}
	}
}
		


