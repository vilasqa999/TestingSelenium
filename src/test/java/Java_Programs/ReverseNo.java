package Java_Programs;

public class ReverseNo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	int num=1234;
	
	int rev=0;
	
	while(num!=0)
	{
		
		rev=rev*10+num%10;  // 0*10=0   + 1234%10=  4  --> 4
		                    // 4*10+ 123-- 3  --> 3+40=43
		                     
		                    // rev= 4 and num4
		num=num/10;
		
		
	}
	
	System.out.println("Rev is:-" + rev);
		
	}

}
