package TestingSelenium.TestingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessTesting {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
      
		WebDriverManager.chromedriver().setup();
		
		
		
	//	ChromeOptions options=new ChromeOptions();
		
		//options.setHeadless(true);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		System.out.println("Before search:"+ driver.getTitle());
		
		WebElement box=driver.findElement(By.name("q"));
		
		box.sendKeys("Varanasi");
	
		box.sendKeys(Keys.ENTER);
		
	//	driver.findElement(By.name("btnK")).click();
		
		System.out.println("After search:"+ driver.getTitle());
		
		Thread.sleep(2000);
		
		System.out.println("=================success============");
		
		driver.quit();
		
		
		
	}

}
