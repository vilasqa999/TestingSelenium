package Java_Programs;

public class DuplicateElementArray {

	public static void main(String[] args) 
	{

      //int a[]= {2,3,4,5,6,23};
      
      String str[]= {"vilas", "java", "cpp","javka"};
      boolean flag=false;
      for(int i=0;i<str.length;i++)
      {
    	  for(int j=i+1;j<str.length;j++)
    	  {
    		  if(str[i]==str[j])
    		  {
    			  System.out.println("duplicate element in array... " + str[i]);
    			  flag=true;  
    		  }
    		  
    	  }
      }
		

      if(flag==false)
      {
    	  System.out.println("duplicate element not in array... " );
      }
      
	}

}
