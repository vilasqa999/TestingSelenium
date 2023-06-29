package Java_Programs;

public class ArrayOddEven {

	public static void main(String[] args) 
	{


		int a[]= {1,2,3,4,5,6,7,8};
		
		for(int i=0;i<a.length;i++)
			
		{
			if(a[i]%2==0)
			System.out.println("no is even......" + a[i]);
			
		}
		
     for(int i=0;i<a.length;i++)
			
		{
			if(a[i]%2!=0)
			System.out.println("no is odd......" + a[i]);
			
		}
     
     //using enhanced for loop
     for(int var:a)
     {
    	 if(var%2==0)
    		 System.out.println("even no"+ var);
     }
     
     for(int var:a)
     {
    	 if(var%2!=0)
    		 System.out.println("odd no"+ var);
     }
     
     
	}

}
