package TestingSelenium.TestingSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropDown {

	public static void main(String[] args) 
	{
		
		

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	
	WebElement element=driver.findElement(By.name("country"));
	
	Select s1=new Select(element);
	
	s1.selectByVisibleText("BAHAMAS");
	
	List<WebElement> element2=  s1.getOptions();
	
	
	for(WebElement e3:element2)
	{
		System.out.println(e3.getText());
	}
	
	
	
		

	}

}
