package Java_Programs;

public class NoofOddeven {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		int num=1234567;
		int evencount=0;
		int oddcount=0;
		
		
		while(num>0)
		{
			 
			int rem=num%10;
			if(num%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num=num/10;
			
		}
		
		
		System.out.println("No of even no:" + evencount);

		System.out.println("No of even no:" + oddcount);
	}

}
