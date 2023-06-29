package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperation 
{

	public static void main(String[] args) 
	{


		  WebDriverManager.chromedriver().setup();
		
		  ChromeDriver driver=new ChromeDriver();
		
		  driver.manage().window().maximize();
		 
		  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		  WebElement button= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		 
		  Actions act=new Actions(driver);
		  
		  act.contextClick(button).perform();
		  
		  
		  WebElement button2=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		  
		  
		  act.doubleClick(button2).perform();
		  
		  
		  
	}

}
