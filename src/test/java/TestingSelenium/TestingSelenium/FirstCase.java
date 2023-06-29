package TestingSelenium.TestingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstCase {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://groww.in/");
		
		System.out.println("Current url is:"+driver.getCurrentUrl());

		System.out.println("Current title is:"+driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.close();
		}

}
