package Java_Programs;

public class oddevennoarray
{

	public static void main(String[] args) 
	{


		int a[]= {23,44,56,67,33,80,85,90};
		
		int even=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even no" + a[i]);
			}
			else
			{
				System.out.println("odd no" + a[i]);
			}	
		}

	}

}
