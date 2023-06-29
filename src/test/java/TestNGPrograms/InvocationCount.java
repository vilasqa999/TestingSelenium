package TestNGPrograms;

import org.testng.annotations.Test;

public class InvocationCount 
{
    @Test(invocationCount=5)
	public void testcase1()
	{
		
		System.out.println("This is testcases1 ...");
	}
    
    
    @Test	
   	public void testcase2()
   	{
   		
   		System.out.println("This is testcases2 ...");
   	}
       
       
	
	
}
