package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements 
{

	public static void main(String[] args) throws InterruptedException
	{

		 WebDriverManager.chromedriver().setup();
			
		 ChromeDriver driver =new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.get("https://demo.nopcommerce.com/register");
		 
		// 1. return 1 element 	
		 
		WebElement searchbox= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		searchbox.sendKeys("wire");
		
		// 1. return only one element
		
       List<WebElement>links= driver.findElements(By.xpath("//div[@class='footer-upper']//a"));

       System.out.println("size of element:"+ links.size());
		
		 for(WebElement ele:links)
		 {
          System.out.println("List of links: " + ele.getText());
		 }
		
		
        Thread.sleep(3000);

        driver.close();

	}

}
