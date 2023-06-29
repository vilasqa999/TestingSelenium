package TestingSelenium.TestingSelenium;

import org.testng.annotations.Test;

public class TestngAttributes 
{
    @Test(description="This is detailed description of test 1...")
    
	public void test1()
	{
		System.out.println("This is test 1 ");
	}

    //@Test(description="This is detailed description of test 2...")
    
    @Test (dependsOnMethods= {"test1"})
	public void test2()
	{
		System.out.println("This is test 2 ");
	}
    

    //@Test(description="This is detailed description of test 3...")
    @Test(priority=1)
	public void test3()
	{
		System.out.println("This is test 3 ");
	}
}
