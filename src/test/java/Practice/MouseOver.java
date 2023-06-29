package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) 
	{
		 WebDriverManager.chromedriver().setup();
			
		 ChromeDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		
		 driver.get("https://demo.opencart.com/");
		WebElement link1= driver.findElement(By.linkText("Components"));
		 
		
		
		Actions act=new Actions(driver);
		
		act.moveToElement(link1).perform();
		
	    driver.findElement(By.linkText("Monitors (2)")).click();
	}

}
