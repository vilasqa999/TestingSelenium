package Practice_3;

public class swapstring 
{

	public static void main(String[] args) 
	{
		
		
		String str1="Vilas";
		String  str2= "Giri";
		
		System.out.println("before  swap "+ str1 + " " + str2);
		str1=str1+str2;
		
		//System.out.println("combine string "+ str1);
		
		str2=str1.substring(0,(str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		
		System.out.println("after swap "+ str1 + " " + str2);
		
	}

}
