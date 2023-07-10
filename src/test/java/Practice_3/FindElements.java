package Practice_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//a[@class='_2KpZ6l _3dESVI']/ancestor::div[@class='_6t1WkM _3HqJxg']")).click();
		
	}

}
