package TestingSelenium.TestingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperation {

	public static void main(String[] args) 
	{
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	//	driver.get("https://demoqa.com/buttons");
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source=driver.findElement(By.id("box6"));
		
		WebElement dest=driver.findElement(By.id("box106"));
		
		
	//	WebElement button=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
	//	WebElement button=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions act=new Actions(driver);
		
		
		//act.contextClick(button).build().perform();
		
		
		//act.doubleClick(button).perform();
		
		act.dragAndDrop(source, dest).perform();
		
		
	}

}
