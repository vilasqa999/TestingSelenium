package TestingSelenium.TestingSelenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObjectModel
{

	public static void main(String[] args) 
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://visualstories.com/login");
		
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("testingvsbuilder@gmail.com");
		
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("testing123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	
	}

}
