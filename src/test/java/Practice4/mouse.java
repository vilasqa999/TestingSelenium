package Practice4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouse {

	public static void main(String[] args)
	{


	       WebDriverManager.chromedriver().setup();
	       
	       WebDriver driver=new ChromeDriver();
	       
	      driver.manage().window().maximize();
	      
	      driver.get("https://demoqa.com/buttons");
	      WebElement button=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	      
	      WebElement button2=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
          Actions act=new Actions(driver);
          
       //   act.contextClick(button).perform();
          
          act.doubleClick(button2).perform();
	}

}
