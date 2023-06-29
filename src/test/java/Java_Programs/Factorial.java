package Java_Programs;

public class Factorial {

	public static void main(String[] args)
	{
	  	

   //  fact 5= 5*4*3*2*1
		
		int num=5;
		int fact=1;
		
		for (int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Fact of 5 :"+ fact);

	}

}
