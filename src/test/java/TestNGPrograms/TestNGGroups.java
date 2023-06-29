package TestNGPrograms;

import org.testng.annotations.Test;

public class TestNGGroups
{
	@Test(groups="IT company")
	public void tcsdata()
	{
		System.out.println("Tcs company.....");
	}
	
	

	
	@Test(groups="IT company")
	public void infosys()
	{
		System.out.println("infosys company.....");
	}
	
	
	@Test(groups="IT company")
	public void ibm()
	{
		System.out.println("IBM company.....");
	}
	
	@Test(groups="auto company")
	public void Tata()
	{
		System.out.println("Tata company.....\n");
	}
	
	
	@Test(groups="auto company")
	public void Bajaj()
	{
		System.out.println("bajaj company.....");
	}
	
	@Test(groups="auto company")
	public void Mahindra()
	{
		System.out.println("Mahindra company.....");
	}
	
	
	
}
