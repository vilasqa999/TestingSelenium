package Java_Programs;

public class RemoveWhitespace {

	public static void main(String[] args) 
	{


		// sfsdf    sfdf    sfsd dfdf   
		
		String str="My name            Vilas         Mahadev     Giri.   ";
		int len=str.length();
		System.out.println("String is:" + str);
        System.out.println("String len :"+ len);
        
        str=str.replaceAll("\\s", "");
        
        int len2=str.length();
        System.out.println("String len :"+ len2);
        System.out.println("String is:"+ str);
        
	}

}
