package Java_Programs;

public class ReverseString {

	public static void main(String[] args) 
	{
	
		
		String str="ABCDEF";
		String rev="";
		
		int no=str.length();
		
		
		for(int i=no-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}

		System.out.println(rev);;
	}

}
