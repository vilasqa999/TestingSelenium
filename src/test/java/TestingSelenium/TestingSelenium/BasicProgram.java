package TestingSelenium.TestingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicProgram {

	public static void main(String[] args) throws InterruptedException
	{
	
		//WebDriverManager.chromedriver().setup();
		
		WebDriverManager.edgedriver().setup();
		
		//WebDriver driver=new ChromeDriver();
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.guru99.com/v4/");
		
		System.out.println("Page title:-"+ driver.getTitle());
		
		System.out.println("Page source:-"+driver.getPageSource());
		
		System.out.println("url is:"+driver.getCurrentUrl());
		
		
		System.out.println("succces...");
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		// TODO Auto-generated method stub

	}

}
