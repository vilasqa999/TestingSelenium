package Java_Programs;

public class Countdigit11 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		int num=12345678;
		int count=0;
		
	while(num>0) 
	{
		num=num/10;
		count++;
	}
	System.out.println("no of digit " + count );
	}

}
