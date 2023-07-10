package Java_Programs;

public class Palindrome1 
{

	public static void main(String[] args)
	{

//34543  16561
		
		int num=16561;
		int rev=0;
		
		int temp=num;
		while(num!=0)
		{
			
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(rev==temp)
		{
			System.out.println("No is palindrome");
		}
		
		else
		{
			System.out.println("No is not palindrome");
		}
		
	}

}
