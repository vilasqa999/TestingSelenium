package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args)
	{


        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in/");
       
		//driver.findElement(By.linkText("New Releases")).click();
		
		driver.findElement(By.partialLinkText("Releases")).click();
		
         List<WebElement> links=driver.findElements(By.tagName("a"));
         
         System.out.println("No of links:" +links.size());
       	
         
       	 for(WebElement l1:links)
       	 {
       		System.out.println("Link text" + l1.getText());
       	 }
       	 
    	 System.out.println("success");
	}

}
