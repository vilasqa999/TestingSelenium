package TestingSelenium.TestingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOginWithPageFactory
{

	WebDriver driver;
	
	LOginWithPageFactory(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver,this);
	}
	
	


	@FindBy(xpath="//input[@autocomplete='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@autocomplete='current-password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	

	public void enterusername(String uname)
	{
		username.sendKeys(uname);
	}

	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	

	public void clickLogin()
	{
		loginBtn.click();	
	}
	
}
