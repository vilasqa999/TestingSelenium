package TestNGPrograms;

import org.testng.annotations.Test;

public class TestNGEnabledDisabled
{

	@Test	
	public void openBank()
	{
		
		System.out.println("Open bank..............");
		
	}
	
	@Test
	public void addcustomer()
	{
		System.out.println("New customer added...........");
		
	}
	
	
	@Test	
	public void addBankAccount()
	{
		System.out.println("New bank account added...........");
		
	}
	
	@Test	
	public void fundTransfer()
	{
		System.out.println("fund transferdone..........");
		
	}
	
	@Test
	public void withdraw()
	{
		System.out.println("fund withdraw..........");
		
	}
	
	
}
