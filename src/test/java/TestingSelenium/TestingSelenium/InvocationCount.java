package TestingSelenium.TestingSelenium;

import org.testng.annotations.Test;

public class InvocationCount 
{
    @Test(invocationCount=5)
	public void test1()
	{
		System.out.println("This is Test1 method");
	}
    
    @Test(invocationCount=2)
	public void test2()
	{
		System.out.println("This is Test2 method");
	}
    
    
    
	
}
