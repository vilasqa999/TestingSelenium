package TestingSelenium.TestingSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLink {

	public static void main(String[] args) 
	{
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.calculator.net/");
		
	List <WebElement> element= driver.findElements(By.tagName("a"));
		
		System.out.println(element.size());
		
		
		
		for(WebElement e1:element)
		{
			System.out.println(e1.getText());
		}
		
		// TODO Auto-generated method stub

	}

}
