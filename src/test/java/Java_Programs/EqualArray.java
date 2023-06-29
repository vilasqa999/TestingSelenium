package Java_Programs;

import java.util.Arrays;

public class EqualArray {

	public static void main(String[] args)
	{


		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,0};
		
		boolean status=Arrays.equals(a, b);
		if(status==true) 
		{
			System.out.println("equal array...");
		}
		else
		{
			System.out.println("Array is not eqal...");
		}

	}

}
