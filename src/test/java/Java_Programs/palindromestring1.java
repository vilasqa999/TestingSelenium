package Java_Programs;

public class palindromestring1 {

	public static void main(String[] args) 
	{

      String str="MADAM";
      
      String rev= "";
     // String temp=str;
      
      int no=str.length();
      String temp=str;
      for(int i=no-1;i>=0;i--) 
      {
    	  rev=rev+str.charAt(i);
      }
      
      System.out.println("rev is " + rev);
      if(temp.equals(rev))
      {
    	  
    	  System.out.println("string is palindrome");
      }
      else
 {
    	  
    	  System.out.println("string is not palindrome");
      }
	}

}
