package TestingSelenium.TestingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSourceUrl {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

	
		
		WebDriverManager.chromedriver().setup();
		
		//WebDriver driver=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		System.out.println("Source url:"+ driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getAttribute("src"));
	
		Thread.sleep(3000);
		
		System.out.println("==============success==========");
		driver.close();
		
	}

}
