package Java_Programs;

public class Revserseno 
{

	public static void main(String[] args) 
	{

       int num=12345;
       int rev=0;
       
       
       while(num!=0)
       {
    	   rev=rev*10+num%10;
    	   num=num/10;
       }
       System.out.println("rev no is:" + rev);
	}

}
