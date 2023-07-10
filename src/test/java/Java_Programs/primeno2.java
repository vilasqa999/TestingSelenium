package Java_Programs;

public class primeno2
{

	public static void main(String[] args)
	{

       int no=11;
       
       int count=0;
       
       for(int i=1;i<=no;i++)
       {
    	   if(no%i==0)
    		   count++;
       }
       
       if(count==2)
       {
    	   System.out.println("no is prime");
       }
		
       else
       {
    	   System.out.println("no is not prime");
       }
		
	}

}
