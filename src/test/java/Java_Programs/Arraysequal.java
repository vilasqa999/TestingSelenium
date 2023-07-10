package Java_Programs;

import java.util.Arrays;

public class Arraysequal
{

	public static void main(String[] args) 
	{

      int a[]= {1,2,3,4,5,6,7};
      int b[]= {1,2,3,4,5,6,97};
      
      boolean status=Arrays.equals(a,b);
      
      if(status==true)
      {
    	  System.out.println("Array is equal");
      }
      else
      {
    	  System.out.println("Array is not equal");
      }
	}

}
