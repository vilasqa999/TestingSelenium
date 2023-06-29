package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args)
	{


		 WebDriverManager.chromedriver().setup();
			
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://jqueryui.com/tooltip/");
		 
		 driver.switchTo().frame(0);
		 
		 WebElement text=driver.findElement(By.xpath("//input[@id='age']"));
		
		 System.out.println("tooltip:" + text.getAttribute("title"));
		 
		
	}

}
