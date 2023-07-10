package Practice4;

public class missingno {

	
	public static void main(String[] args) 
	{

      // 1,2,3,4,5
		
		int a[]= {1,2,4,5};
		int sum1=0;
		
		int sum2=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
			System.out.println(sum1);
		}
		

		for(int i=0;i<=5;i++)
		{
			sum2=sum2+i;
			System.out.println(sum2);
		}
		
		//int sum=0;
		//sum=
		System.out.println("missing no: "+ (sum2-sum1));

	}

}
