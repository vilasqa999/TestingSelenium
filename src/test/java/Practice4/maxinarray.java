package Practice4;

public class maxinarray {

	public static void main(String[] args) 
	{

       int  a[]= {23,45,67,64,90};
       int max=a[0];
       for(int i=1;i<a.length;i++)
       {
    	   if(a[i]>max)
    	   {
    		   max=a[i];
    	   }
       }
       System.out.println("max no is: " + max);
		
	}

}
