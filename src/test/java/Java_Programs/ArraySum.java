package Java_Programs;

public class ArraySum {

	public static void main(String[] args) 
	{
	
		
		int a[]= {3,4,6,7,8,9};
		
		int sum=0;
		
//		for(int i=0;i<=a.length-1;i++)
//		{
//			sum=sum+a[i];
//		}

		for(int data:a)
		{
			sum=sum+data;
		}
		
		System.out.println("Array sum is " + sum);
	}

}
