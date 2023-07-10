package Java_Programs;

public class Reverses
{

	public static void main(String[] args) 
	{
		
		//reverse string vilas
		String str="Vilas";
		int no=str.length();
		String rev=" ";
		for(int i=no-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Rev string: " + rev);
	}

}
