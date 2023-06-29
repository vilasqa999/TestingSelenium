package Java_Programs;

public class Fibonacci {

	public static void main(String[] args) 
	{


		// 0 1  1 2 3 5 8 13
		
		int num1=0;
		int num2=1;
		int sum=0;
		
		for(int i=0; i<10;i++)
		{
			sum=num1+num2;
			System.out.println("sum is"  + sum );
			
			num1=num2;
			num2=sum;
		}
			
		
	}

}
