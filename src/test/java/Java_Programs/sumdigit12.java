package Java_Programs;

public class sumdigit12 
{

	public static void main(String[] args) 
	{

      //sum of digit= 12345= 15
		
		int num=123456;
		int sum=0;
		int count=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
			count++;
		}
		
		System.out.println("sum of digit: " + sum);
		System.out.println("count of digit: " + count);
	}

}
