package Practice4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountLink 
{

	public static void main(String[] args) throws InterruptedException
	{

       WebDriverManager.chromedriver().setup();
       
       WebDriver driver=new ChromeDriver();
       
      driver.manage().window().maximize();
      
      driver.get("https://www.calculator.net/");
      
     List <WebElement> links= driver.findElements(By.tagName("a"));
     
     System.out.println("no of links: "+ links.size());
     
     for(WebElement l1:links) 
     {
    	 System.out.println("link text:" +l1.getText());
     }
     
     Thread.sleep(3000);
     
     driver.close();
     
	}

}
