package Java_Programs;

public class MinMaxInArray {

	public static void main(String[] args) 
	{


		int a[]= {10,20,50,61,60};
		
		int min=a[0];
	    
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
	
		System.out.println("min in array..." + min);
	}

}
