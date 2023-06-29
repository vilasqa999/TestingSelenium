package TestingSelenium.TestingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	
	WebDriver driver;
	
	
	LoginPage(WebDriver d)
	{
		driver=d;
	}
	
	By Username= By.xpath("//input[@autocomplete='username']");
	By Password= By.xpath("//input[@autocomplete='current-password']");
	By loginBtn= By.xpath("//button[@type='submit']");
	
	
	public void enterusername(String uname)
	{
		driver.findElement(Username).sendKeys(uname);
	}

	public void enterPassword(String pwd)
	{
		driver.findElement(Password).sendKeys(pwd);
	}
	

	public void clickLogin()
	{
		driver.findElement(loginBtn).click();	
	}
	
}
