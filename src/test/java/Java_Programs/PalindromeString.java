package Java_Programs;

public class PalindromeString {

	public static void main(String[] args) 
	
	{
	
		String str= "MADAM";
		
		String rev="";
		
		int no=str.length();
		
		String temp=str;
		
		for(int i=no-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		
		System.out.println("String is" + rev);
		
		if(temp.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not	 palindrome");
		}

	}

}
