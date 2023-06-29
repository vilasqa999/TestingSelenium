package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDragDrop {

	public static void main(String[] args)
	{
		
		
		 WebDriverManager.chromedriver().setup();
			
		 ChromeDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		
		 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 
		 
		 WebElement source=driver.findElement(By.id("box6"));
		
		 WebElement dest=driver.findElement(By.id("box106"));
		 
		 Actions act=new Actions(driver);
		 
		 
		 act.dragAndDrop(source, dest).perform();

	}

}
